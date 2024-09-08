package com.kh.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private JwtAuthenticationFilter	jwtFilter;
	
	// 특정 http 요청에 대한 웹 기반 보안 구성. 인증/인가 및 로그아웃 설정
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
				/*
				// 1. 이렇게 했을때 모든 권한을 다 풀어서 그냥 들어올수있음
				//  권한 설정
				.authorizeHttpRequests(authorize -> 
					 //허용관련 기준
					 authorize.anyRequest().permitAll() // 허용을 다 푼다는 느낌
				)
				.build();
				*/
				.csrf(csrf -> csrf.disable())
				.httpBasic(basic -> basic.disable())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authorizeHttpRequests(authorize -> 
					 authorize
					 	 // register에 인증된 사람만 오게 하고싶다?
						 .requestMatchers("/member").authenticated()// register로 요청했을때 / 인증된 사람만 오게끔
						 .requestMatchers("/admin").hasRole("ADMIN") // 권한이 ROLE_ADMIN인 경우만 들어울 수 있음
						 .anyRequest().permitAll()
				)
				.addFilterBefore(jwtFilter,UsernamePasswordAuthenticationFilter.class)
				.build();
	}
}












