package com.young.y1.teacher;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherDao {
	List<TeacherVO> teacherList(TeacherVO vo);
}
