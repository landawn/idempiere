package org.idempiere.controller;

import org.idempiere.security.AuthenticationService;
import org.idempiere.security.AuthenticationService.AuthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for authentication operations.
 */
@RestController
@RequestMapping("/api/auth")
@Tag(name = "Authentication", description = "Authentication APIs")
public class AuthController {

    private final AuthenticationService authenticationService;

    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    @Operation(summary = "User login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        try {
            AuthResponse response = authenticationService.authenticate(
                    request.getUsername(),
                    request.getPassword(),
                    request.getClientId(),
                    request.getOrgId(),
                    request.getRoleId()
            );
            return ResponseEntity.ok(response);
        } catch (AuthenticationService.AuthenticationException e) {
            return ResponseEntity.status(401).build();
        }
    }

    @PostMapping("/refresh")
    @Operation(summary = "Refresh access token")
    public ResponseEntity<AuthResponse> refresh(@RequestBody RefreshTokenRequest request) {
        try {
            AuthResponse response = authenticationService.refreshToken(request.getRefreshToken());
            return ResponseEntity.ok(response);
        } catch (AuthenticationService.AuthenticationException e) {
            return ResponseEntity.status(401).build();
        }
    }

    @PostMapping("/logout")
    @Operation(summary = "User logout")
    public ResponseEntity<Void> logout() {
        // JWT is stateless, so logout is handled client-side by discarding the token
        // Server-side token invalidation would require a token blacklist (not implemented)
        return ResponseEntity.ok().build();
    }

    public static class LoginRequest {
        private String username;
        private String password;
        private Integer clientId;
        private Integer orgId;
        private Integer roleId;

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public Integer getClientId() { return clientId; }
        public void setClientId(Integer clientId) { this.clientId = clientId; }
        public Integer getOrgId() { return orgId; }
        public void setOrgId(Integer orgId) { this.orgId = orgId; }
        public Integer getRoleId() { return roleId; }
        public void setRoleId(Integer roleId) { this.roleId = roleId; }
    }

    public static class RefreshTokenRequest {
        private String refreshToken;

        public String getRefreshToken() { return refreshToken; }
        public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }
    }
}
