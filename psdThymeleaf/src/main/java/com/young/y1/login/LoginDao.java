package com.young.y1.login;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
	LoginVO  loginOK(LoginVO vo);
}
