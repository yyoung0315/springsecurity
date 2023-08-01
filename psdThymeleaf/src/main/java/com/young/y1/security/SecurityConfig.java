package com.young.y1.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 시큐리티에서 사용하는 데 필요한 수많은 객체를 생성한다.
public class SecurityConfig  {

	SecurityConfig(){
		System.out.println("===> 0. SecurityConfig 생성자 확인 ");
	}
	
	@Autowired
	SecurityUserDetailsService  securityUserDetail;

	@Bean
	SecurityFilterChain filterChain( HttpSecurity http ) throws Exception {
		
	    http.authorizeHttpRequests(authorize -> authorize
	              .requestMatchers("/guestbook/**").authenticated()
	              .requestMatchers("/manager/**").hasRole("MANAGER")
	              .requestMatchers("/admin/**").hasRole("ADMIN")
	              .anyRequest().permitAll());
				
		http.csrf().disable();
		
		http.formLogin().loginPage("/login.do").defaultSuccessUrl("/loginSuccess.do", true);
		http.exceptionHandling().accessDeniedPage("/accessDenied.do");
		http.logout().invalidateHttpSession(true).logoutSuccessUrl("/");		
		http.userDetailsService(securityUserDetail);
		
		return http.build(); 
		
	}
	
	@Bean
	PasswordEncoder  passwordEncoder() {		
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}		
}
