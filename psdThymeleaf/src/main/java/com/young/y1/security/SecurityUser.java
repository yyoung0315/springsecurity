package com.young.y1.security;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.young.y1.login.LoginVO;

//  User 는 폼의 username 과 password 와 자동매칭 진행 
public class SecurityUser  extends  User {
	
	private static final long serialVersionUID = 1L;
	
	// SecurityUserDetailsService 에서 넘어온 
	// table의 username 과 password
	// 를 비교하고 있다고 이해를 하면된다.!!!
	
	public SecurityUser( LoginVO vo ) {
		
		super(vo.getUsername() , "{noop}"+vo.getPassword(),
			 AuthorityUtils.createAuthorityList(vo.getRole().toString()));
		
	}

}
