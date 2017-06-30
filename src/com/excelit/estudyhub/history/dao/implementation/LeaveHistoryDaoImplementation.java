package com.excelit.estudyhub.history.dao.implementation;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.history.dao.LeaveHistoryDaoInterface;
import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;

@Repository
public class LeaveHistoryDaoImplementation implements LeaveHistoryDaoInterface{
	
	
	private Session session;

	@SuppressWarnings("unchecked")
	@Override
	public List<ApplyLeaveBean> getLeaveHistoryDetailsDaoImplementation(SessionFactory sessionFactory) {
		List<ApplyLeaveBean> applyLeaveBean =Collections.EMPTY_LIST;
		session = sessionFactory.openSession();
		applyLeaveBean =session.createCriteria(ApplyLeaveBean.class).list();
		System.err.println(">>>>>>>>>>>>>"+applyLeaveBean.size());
		for(ApplyLeaveBean applyLeaveBean2 : applyLeaveBean ){
			System.err.println(">>>>>>>>>>>>>"+applyLeaveBean2.getStudentName());
		}
		if (session != null && session.isOpen()) {
			session.close();
		}
		
	
		return applyLeaveBean;
	}

}
