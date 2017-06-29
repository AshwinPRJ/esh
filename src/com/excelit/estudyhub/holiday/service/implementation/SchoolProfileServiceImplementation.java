package com.excelit.estudyhub.holiday.service.implementation;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelit.estudyhub.holiday.bean.SchoolProfileBean;
import com.excelit.estudyhub.holiday.dao.SchoolProfileDaoInterface;
import com.excelit.estudyhub.holiday.service.SchoolProfileServiceInterface;
import com.excelit.estudyhub.holiday.to.request.SchoolRequest;
import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;
import com.excelit.resource.HibernateUtil;

@Service
public class SchoolProfileServiceImplementation implements SchoolProfileServiceInterface {
	@Autowired
	private SchoolProfileDaoInterface schoolProfileDaoInterface;
	private SessionFactory sessionFactory;
	public SchoolProfileServiceImplementation() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}

	@Transactional
	public SchoolProfileBean setSchoolProfilingService(SchoolRequest schoolRequest) {

		SchoolProfileBean schoolProfileBean = schoolRequest.getSchoolProfileBean();
		
		ApplyLeaveBean applyLeaveBean = schoolRequest.getApplyLeaveBean();
		
		
		schoolProfileDaoInterface.setSchoolProfilingDao(sessionFactory, schoolProfileBean);
		schoolProfileDaoInterface.setApplyLeaveDao(sessionFactory, applyLeaveBean);
		return schoolProfileBean;
	}

	
	
}
