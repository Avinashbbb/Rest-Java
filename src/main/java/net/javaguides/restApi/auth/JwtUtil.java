package net.javaguides.restApi.auth;

import net.javaguides.restApi.models.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.*;

@Component
public class JwtUtil {
    @Value("${app.jwt.secret}")
    private String secret;

    public String generateAccessToken(User user){
        return Jwts.builder()
                .setSubject(String.format("%s,%s", user.getId(), user.getEmail()))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
}
