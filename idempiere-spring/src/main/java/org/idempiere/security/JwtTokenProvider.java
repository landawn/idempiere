package org.idempiere.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * JWT Token Provider for authentication and authorization.
 */
@Component
public class JwtTokenProvider {

    @Value("${jwt.secret:your-256-bit-secret-key-here-make-it-long-enough-for-security}")
    private String jwtSecret;

    @Value("${jwt.expiration:86400000}")
    private long jwtExpiration; // Default: 24 hours

    @Value("${jwt.refresh-expiration:604800000}")
    private long refreshExpiration; // Default: 7 days

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(jwtSecret.getBytes());
    }

    public String generateToken(Integer userId, Integer clientId, Integer orgId, Integer roleId) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);
        claims.put("clientId", clientId);
        claims.put("orgId", orgId);
        claims.put("roleId", roleId);

        return Jwts.builder()
                .claims(claims)
                .subject(userId.toString())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + jwtExpiration))
                .signWith(getSigningKey())
                .compact();
    }

    public String generateRefreshToken(Integer userId) {
        return Jwts.builder()
                .subject(userId.toString())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + refreshExpiration))
                .signWith(getSigningKey())
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .verifyWith(getSigningKey())
                    .build()
                    .parseSignedClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    public Claims getClaims(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    public Integer getUserIdFromToken(String token) {
        Claims claims = getClaims(token);
        return claims.get("userId", Integer.class);
    }

    public Integer getClientIdFromToken(String token) {
        Claims claims = getClaims(token);
        return claims.get("clientId", Integer.class);
    }

    public Integer getOrgIdFromToken(String token) {
        Claims claims = getClaims(token);
        return claims.get("orgId", Integer.class);
    }

    public Integer getRoleIdFromToken(String token) {
        Claims claims = getClaims(token);
        return claims.get("roleId", Integer.class);
    }

    public boolean isTokenExpired(String token) {
        try {
            Claims claims = getClaims(token);
            return claims.getExpiration().before(new Date());
        } catch (ExpiredJwtException e) {
            return true;
        }
    }
}
