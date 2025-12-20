package org.idempiere.security;

import org.idempiere.dao.UserDao;
import org.idempiere.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Optional;

/**
 * Service class for authentication operations.
 */
@Service
public class AuthenticationService {

    private final UserDao userDao;
    private final JwtTokenProvider jwtTokenProvider;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationService(UserDao userDao, JwtTokenProvider jwtTokenProvider, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.jwtTokenProvider = jwtTokenProvider;
        this.passwordEncoder = passwordEncoder;
    }

    public AuthResponse authenticate(String name, String password, Integer clientId, Integer orgId, Integer roleId) {
        Optional<User> userOpt = userDao.findByName(name);

        if (userOpt.isEmpty()) {
            throw new AuthenticationException("Invalid username or password");
        }

        User user = userOpt.get();

        // Verify password (assuming password is stored hashed)
        if (!verifyPassword(password, user.getPassword())) {
            throw new AuthenticationException("Invalid username or password");
        }

        // Check if user is active
        if (!"Y".equals(user.getIsActive())) {
            throw new AuthenticationException("User account is inactive");
        }

        // Generate tokens
        String accessToken = jwtTokenProvider.generateToken(user.getAdUserId(), clientId, orgId, roleId);
        String refreshToken = jwtTokenProvider.generateRefreshToken(user.getAdUserId());

        return new AuthResponse(accessToken, refreshToken, user.getAdUserId(), clientId, orgId, roleId);
    }

    public AuthResponse refreshToken(String refreshToken) {
        if (!jwtTokenProvider.validateToken(refreshToken)) {
            throw new AuthenticationException("Invalid refresh token");
        }

        Integer userId = jwtTokenProvider.getUserIdFromToken(refreshToken);
        User user;
        try {
            user = userDao.gett(userId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (user == null) {
            throw new AuthenticationException("User not found");
        }

        // Generate new access token with default values (client/org/role should be selected by user)
        String newAccessToken = jwtTokenProvider.generateToken(user.getAdUserId(),
                user.getAdClientId(), user.getAdOrgId(), null);
        String newRefreshToken = jwtTokenProvider.generateRefreshToken(user.getAdUserId());

        return new AuthResponse(newAccessToken, newRefreshToken, user.getAdUserId(),
                user.getAdClientId(), user.getAdOrgId(), null);
    }

    private boolean verifyPassword(String rawPassword, String encodedPassword) {
        // For backward compatibility, check if password is plain text or hashed
        if (encodedPassword != null && encodedPassword.startsWith("$2")) {
            // BCrypt encoded
            return passwordEncoder.matches(rawPassword, encodedPassword);
        }
        // Plain text comparison (legacy - should be migrated)
        return rawPassword.equals(encodedPassword);
    }

    public String encodePassword(String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

    public static class AuthResponse {
        private final String accessToken;
        private final String refreshToken;
        private final Integer userId;
        private final Integer clientId;
        private final Integer orgId;
        private final Integer roleId;

        public AuthResponse(String accessToken, String refreshToken, Integer userId,
                           Integer clientId, Integer orgId, Integer roleId) {
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
            this.userId = userId;
            this.clientId = clientId;
            this.orgId = orgId;
            this.roleId = roleId;
        }

        public String getAccessToken() { return accessToken; }
        public String getRefreshToken() { return refreshToken; }
        public Integer getUserId() { return userId; }
        public Integer getClientId() { return clientId; }
        public Integer getOrgId() { return orgId; }
        public Integer getRoleId() { return roleId; }
    }

    public static class AuthenticationException extends RuntimeException {
        public AuthenticationException(String message) {
            super(message);
        }
    }
}
