package com.excelit.estudyhub.history.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;


public interface LeaveHistoryDaoInterface {
	
	public List<ApplyLeaveBean> getLeaveHistoryDetailsDaoImplementation(SessionFactory sessionFactory);

}
