/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.security;

import java.sql.Date;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;





/**
 *
 * @author aquil
 */
public class TokenUtils {
    private final static String ACCESS_TOKEN_SECRET = "456sa4dq8sddasdas454665a54asda4s";
    private final static Long ACCESS_TOKEN_VALIDITY_SECONDS = 2592000L;
    
    public static String createToken(String nombre,String email){
        long expirationTime  = ACCESS_TOKEN_VALIDITY_SECONDS*1000;
        Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);
        
        Map<String,Object> extra =new HashMap<>();
        
        extra.put("nombre",nombre);
        
        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
                .compact();
    }
    
    public static UsernamePasswordAuthenticationToken getAuthentication(String token){
        try{
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        
            String email = claims.getSubject();
            return new UsernamePasswordAuthenticationToken(email,null,Collections.emptyList());
        }catch(JwtException e){
            return null;
        }
    }
}
