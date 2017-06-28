package com.excelit.estudyhub.faculty.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.faculty.bean.FacultyDesignationBean;
import com.excelit.estudyhub.faculty.bean.FacultyProfileBean;
import com.excelit.estudyhub.faculty.bean.FacultyQualificationBean;
import com.excelit.estudyhub.faculty.bean.FacultySalaryBean;
import com.excelit.estudyhub.faculty.bean.FacultySkillSetsBean;
import com.excelit.estudyhub.faculty.dao.FacultyProfileDaoInterface;

@Repository
public class FacultyProfileDaoImplementation implements FacultyProfileDaoInterface {
	private Session session;

	@Override
	public FacultyProfileBean setFacultyProfilingDao(SessionFactory sessionFactory,
			FacultyProfileBean facultyProfileBean) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(facultyProfileBean);
		session.getTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return facultyProfileBean;
	}

	@Override
	public FacultyQualificationBean setFacultyQualificationDao(SessionFactory sessionFactory,
			FacultyQualificationBean facultyQualificationBean) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(facultyQualificationBean);
		session.getTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return facultyQualificationBean;
	}

	@Override
	public FacultyDesignationBean setFacultyDesignationDao(SessionFactory sessionFactory,
			FacultyDesignationBean facultyDesignationBean) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(facultyDesignationBean);
		session.getTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return facultyDesignationBean;
	}

	@Override
	public FacultySkillSetsBean setFacultySkillSetsDao(SessionFactory sessionFactory,
			FacultySkillSetsBean facultySkillSetsBean) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(facultySkillSetsBean);
		session.getTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return facultySkillSetsBean;
	}

	@Override
	public FacultySalaryBean setFacultySalaryDao(SessionFactory sessionFactory, FacultySalaryBean facultySalaryBean) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(facultySalaryBean);
		session.getTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return facultySalaryBean;
	}
}
