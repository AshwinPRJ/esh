package com.excelit.estudyhub.attendance.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;

public interface StudentAttendanceDaoInterface{

	public List<StudentProfileBean> getStudentAccountDetailsDaoImplementation(SessionFactory sessionFactory);
	
}
