package com.excelit.estudyhub.faculty.service.implementation;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelit.estudyhub.faculty.bean.FacultyDesignationBean;
import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.faculty.bean.FacultyQualificationBean;
import com.excelit.estudyhub.faculty.bean.FacultySalaryBean;
import com.excelit.estudyhub.faculty.bean.FacultySkillSetsBean;
import com.excelit.estudyhub.faculty.dao.FacultyProfileDaoInterface;
import com.excelit.estudyhub.faculty.service.FacultyProfileServiceInterface;
import com.excelit.estudyhub.faculty.to.request.FacultyRequest;
import com.excelit.resource.HibernateUtil;

@Service
public class FacultyProfileServiceImplementation implements FacultyProfileServiceInterface {
	@Autowired
	public FacultyProfileDaoInterface facultyProfileDaoInterface;
	private SessionFactory sessionFactory;

	public FacultyProfileServiceImplementation() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}

	@Override
	public FacultyProfileBean setFacultyProfilingService(FacultyRequest facultyRequest) {
		
		
		FacultyProfileBean facultyProfileBean = facultyRequest.getFacultyProfileBean();
		FacultyQualificationBean facultyQualificationBean = facultyRequest.getFacultyQualificationBean();
		FacultyDesignationBean facultyDesignationBean = facultyRequest.getFacultyDesignationBean();
		FacultySalaryBean facultySalaryBean = facultyRequest.getFacultySalaryBean();
		FacultySkillSetsBean facultySkillSetsBean = facultyRequest.getFacultySkillSetsBean();
		
		
		facultyProfileDaoInterface.setFacultyProfilingDao(sessionFactory, facultyProfileBean);
		facultyProfileDaoInterface.setFacultyQualificationDao(sessionFactory, facultyQualificationBean);
		facultyProfileDaoInterface.setFacultyDesignationDao(sessionFactory, facultyDesignationBean);
		facultyProfileDaoInterface.setFacultySalaryDao(sessionFactory, facultySalaryBean);
		facultyProfileDaoInterface.setFacultySkillSetsDao(sessionFactory, facultySkillSetsBean);
		
		
		return facultyProfileBean;
	}

}
