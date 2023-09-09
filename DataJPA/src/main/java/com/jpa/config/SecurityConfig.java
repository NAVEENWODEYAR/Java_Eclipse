package com.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class SecurityConfig 
{
	@Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
    {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/student/testMsg").permitAll()
                .requestMatchers("/car").authenticated()

                .and().formLogin()
                .and().httpBasic();

        return http.build();
    }
}
