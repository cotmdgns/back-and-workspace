package com.kh.security.config;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Map;

import javax.crypto.SecretKey;
import javax.print.attribute.standard.Chromaticity;

import org.springframework.stereotype.Service;

import com.kh.security.model.vo.Member;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class TokenProvider {

	private SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
	
	public String create(Member member) {
		return Jwts.builder()
				.signWith(secretKey)
				.setClaims(Map.of( // 해당 정보들 한꺼번에 집어넣기
						"id", member.getId(),
						"name", member.getName(),
						"role", member.getRole()
				))
				.setIssuedAt(new Date())
				.setExpiration(Date.from(Instant.now().plus(1,ChronoUnit.DAYS)))
				.compact(); // 토근 생성기
	}
	
	public Member validate(String token) {
		Claims claims = Jwts
							.parser()
							.setSigningKey(secretKey)
							.parseClaimsJws(token)
							.getBody();
		return Member.builder()
				.id((String)claims.get("id"))
				.name((String)claims.get("name"))
				.role((String)claims.get("role"))
				.build();
	}
	
}
