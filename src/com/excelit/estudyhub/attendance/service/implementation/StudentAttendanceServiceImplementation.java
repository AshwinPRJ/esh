package com.excelit.estudyhub.attendance.service.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelit.estudyhub.attendance.dao.StudentAttendanceDaoInterface;
import com.excelit.estudyhub.attendance.service.StudentAttendanceServiceInterface;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.resource.HibernateUtil;
@Service
public class StudentAttendanceServiceImplementation implements StudentAttendanceServiceInterface{
	@Autowired
	private StudentAttendanceDaoInterface studentAttendanceDaoInterface;
	private SessionFactory sessionFactory;
	
	public StudentAttendanceServiceImplementation() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}

	public List<StudentProfileBean> getStudentAttendanceDetailsService() {
	
		return studentAttendanceDaoInterface.getStudentAccountDetailsDaoImplementation(sessionFactory);
	}
}
