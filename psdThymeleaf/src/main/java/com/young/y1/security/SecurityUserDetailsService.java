package com.young.y1.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.young.y1.login.LoginServiceImpl;
import com.young.y1.login.LoginVO;


@Service
public class SecurityUserDetailsService  implements UserDetailsService {

	SecurityUserDetailsService(){
		System.out.println("===> 1. SecurityUserDetailsService 실행");
	}
	
	@Autowired
	private LoginServiceImpl service; 
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		// formLogin().loginPage("/login/login.do") 에서
		// action 이 없으며 자동으로 이곳으로 넘어온다.
		
		System.out.println("===> 2.loadUserByUsername"); 

		LoginVO vo = new LoginVO();
		
		vo.setUsername(username);
		
		System.out.println("===> 2. SecurityUserDetailsService vo 확인: " + vo );
		
		LoginVO  user = service.loginOK(vo);
		System.out.println("--> 3. SecurityUserDetailsService user 확인: " + user );
		
		// 아이디가 존재하는 지를 확인하여 존재하면 
		// new SecurityUser(user) 객체 생성하여 값을 넘긴다.
		if ( user == null) {
			throw  new  UsernameNotFoundException (username +" 4.1 사용자 없음");
		} else {
			System.out.println("===> 4.2 new SecurityUser(user) 로 넘어간다.!! ");
			return new SecurityUser(user);
		}
		
	}
}