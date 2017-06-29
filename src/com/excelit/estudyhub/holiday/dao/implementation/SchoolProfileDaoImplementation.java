package com.excelit.estudyhub.holiday.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;
import com.excelit.estudyhub.holiday.bean.SchoolProfileBean;
import com.excelit.estudyhub.holiday.dao.SchoolProfileDaoInterface;

@Repository
public class SchoolProfileDaoImplementation implements SchoolProfileDaoInterface {
	private Session session;

	public SchoolProfileBean setSchoolProfilingDao(SessionFactory sessionFactory,
			SchoolProfileBean schoolProfileBean) {
		System.out.println("student name : "+schoolProfileBean.getEvent());
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(schoolProfileBean);
		session.getTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return schoolProfileBean;
	}

	public ApplyLeaveBean setApplyLeaveDao(SessionFactory sessionFactory,
			ApplyLeaveBean applyLeaveBean) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(applyLeaveBean);
		session.getTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return applyLeaveBean;
	}


	
}
