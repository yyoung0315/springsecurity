package com.young.y1.teacher;

import java.util.List;

public interface TeacherService {
	List<TeacherVO> teacherList(TeacherVO vo);
	void memberInsert(TeacherVO vo);
	
	List<TeacherVO> memberList(TeacherVO vo);
	
	List<TeacherVO> teacherMoney(TeacherVO vo);
}
