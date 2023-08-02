package com.young.y1.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherDao dao;

	@Override
	public List<TeacherVO> teacherList(TeacherVO vo) {
		// TODO Auto-generated method stub
		return dao.teacherList(vo);
	}


}
