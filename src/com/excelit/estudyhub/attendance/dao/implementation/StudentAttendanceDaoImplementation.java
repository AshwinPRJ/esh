package com.excelit.estudyhub.attendance.dao.implementation;


import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.attendance.dao.StudentAttendanceDaoInterface;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;

@Repository
public class StudentAttendanceDaoImplementation implements StudentAttendanceDaoInterface {
	private Session session;

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentProfileBean> getStudentAccountDetailsDaoImplementation(SessionFactory sessionFactory) {
		List<StudentProfileBean> studentProfileBean =Collections.EMPTY_LIST;
		session = sessionFactory.openSession();
		studentProfileBean =session.createCriteria(StudentProfileBean.class).list();
		System.err.println(">>>>>>>>>>>>>"+studentProfileBean.size());
		for(StudentProfileBean studentProfileBean2 : studentProfileBean ){
			System.err.println(">>>>>>>>>>>>>"+studentProfileBean2.getStudentRegistrationId());
		}
		if (session != null && session.isOpen()) {
			session.close();
		}
		
	
		return studentProfileBean;
	}
}