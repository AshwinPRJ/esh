package com.excelit.estudyhub.faculty.dao;

import org.hibernate.SessionFactory;

import com.excelit.estudyhub.faculty.bean.FacultyDesignationBean;
import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.faculty.bean.FacultyQualificationBean;
import com.excelit.estudyhub.faculty.bean.FacultySalaryBean;
import com.excelit.estudyhub.faculty.bean.FacultySkillSetsBean;

public interface FacultyProfileDaoInterface {

	public FacultyProfileBean setFacultyProfilingDao(SessionFactory sessionFactory,
			FacultyProfileBean facultyProfileBean);

	public FacultyQualificationBean setFacultyQualificationDao(SessionFactory sessionFactory,
			FacultyQualificationBean facultyQualificationBean);

	public FacultyDesignationBean setFacultyDesignationDao(SessionFactory sessionFactory,
			FacultyDesignationBean facultyDesignationBean);

	public FacultySkillSetsBean setFacultySkillSetsDao(SessionFactory sessionFactory, FacultySkillSetsBean facultySkillSetsBean);

	public FacultySalaryBean setFacultySalaryDao(SessionFactory sessionFactory, FacultySalaryBean facultySalaryBean);
}
