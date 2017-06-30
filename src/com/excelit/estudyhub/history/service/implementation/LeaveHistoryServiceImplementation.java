package com.excelit.estudyhub.history.service.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelit.estudyhub.history.dao.LeaveHistoryDaoInterface;
import com.excelit.estudyhub.history.service.LeaveHistoryServiceinterface;
import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;
import com.excelit.resource.HibernateUtil;
@Service
public class LeaveHistoryServiceImplementation implements LeaveHistoryServiceinterface{

	@Autowired
	private LeaveHistoryDaoInterface leaveHistoryDaoInterface;
	private SessionFactory sessionFactory;
	
	public LeaveHistoryServiceImplementation() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}

	@Override
	public List<ApplyLeaveBean> getLeaveHistoryDetailsService() {
		// TODO Auto-generated method stub
		return leaveHistoryDaoInterface.getLeaveHistoryDetailsDaoImplementation(sessionFactory);
	}

	

}
