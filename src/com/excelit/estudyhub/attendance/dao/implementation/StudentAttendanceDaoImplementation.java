package com.excelit.estudyhub.attendance.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.attendance.dao.StudentAttendanceDaoInterface;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;

@Repository
public class StudentAttendanceDaoImplementation implements StudentAttendanceDaoInterface {
	private Session session;

	@Override
	public List<StudentProfileBean> getStudentAccountDetailsDaoImplementation(SessionFactory sessionFactory) {

		session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentProfileBean> studentProfileBean = (List<StudentProfileBean>) session
				.createCriteria(StudentProfileBean.class).list();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return studentProfileBean;
	}
}