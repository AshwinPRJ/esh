package com.excelit.estudyhub.holiday.dao;

import org.hibernate.SessionFactory;

import com.excelit.estudyhub.holiday.bean.SchoolProfileBean;
import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;

public interface SchoolProfileDaoInterface {

	public SchoolProfileBean setSchoolProfilingDao(SessionFactory sessionFactory,
			SchoolProfileBean schoolProfileBean);

	public ApplyLeaveBean setApplyLeaveDao(SessionFactory sessionFactory,
			ApplyLeaveBean applyLeaveBean);


}
