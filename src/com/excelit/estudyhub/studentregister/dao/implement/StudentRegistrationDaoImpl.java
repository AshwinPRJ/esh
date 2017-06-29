package com.excelit.estudyhub.studentregister.dao.implement;
import java.util.List;

/**
 * @author  		:POOJA J
 *@since	:24/6/2017
 * this DAO implementation class used for student registration details
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.estudyhub.studentregister.bean.FamilyInformationBean;
import com.excelit.estudyhub.studentregister.bean.PreviousSchoolingBean;
import com.excelit.estudyhub.studentregister.bean.StudentEmergencyContactsBean;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.estudyhub.studentregister.dao.StudentRegistrationDao;
@Repository
public class StudentRegistrationDaoImpl implements StudentRegistrationDao {

	/**
	 *session variable used to get connection with database
	 */
	private Session session;

	/**
	 * @author pooja
	 * @since 27/6/2017
	 * @param sessionFactory
	 * @param studentRegisterId
	 * @return studentProfileInformation this method used to get student
	 *         registration details
	 */
	@Override
	public List<StudentProfileBean> getStudentProfileInformation(SessionFactory sessionFactory) {
		session = sessionFactory.openSession();
		@SuppressWarnings({ "unused", "unchecked" })
		List<StudentProfileBean> studentProfileInformation = (List<StudentProfileBean>) session
				.createCriteria(StudentProfileBean.class).list();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return studentProfileInformation;
		
	}

	/**
	 * @author POOJA J
	 * @since 26/6/2017
	 * @param sessionFactory
	 * @param studentProfileBean
	 * @return studentProfileBean this method used to save Student Profile
	 *         Information
	 */
	@Override
	public StudentProfileBean saveStudentProfileInformation(SessionFactory sessionFactory,
			StudentProfileBean studentProfileBean) {
		session = sessionFactory.openSession();
		session.save(studentProfileBean);
		session.beginTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return studentProfileBean;
	}

	/**
	 * @author POOJA J
	 * @since 26/6/2017
	 * @param sessionFactory
	 * @param previousSchoolingBean
	 * @return previousSchoolingDetails this method used to save student
	 *         previous schooling information
	 */
	@Override
	public PreviousSchoolingBean savePreviousSchoolingInformation(SessionFactory sessionFactory,
			PreviousSchoolingBean previousSchoolingDetails) {
		session = sessionFactory.openSession();
		session.save(previousSchoolingDetails);
		session.beginTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return previousSchoolingDetails;

	}
	/**
	 * @author POOJA
	 * @param sessionFactory
	 * @param familyInformation
	 * @return 
	 * this DAO method  used to save student family details
	 */
	@Override
	public FamilyInformationBean saveStudentFamilyInformation(SessionFactory sessionFactory,
			FamilyInformationBean familyInformation) {
		session = sessionFactory.openSession();
		session.save(familyInformation);
		session.beginTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return familyInformation;

	}
	/**
	 * @author POOJA
	 * @param sessionFactory
	 * @param familyInformation
	 * @return 
	 * this DAO method  used to save student emergency contacts details
	 */
	@Override
	public StudentEmergencyContactsBean saveStudentEmergencyContacts(SessionFactory sessionFactory,
			StudentEmergencyContactsBean studentEmergencyContacts) {
		session = sessionFactory.openSession();
		session.save(studentEmergencyContacts);
		session.beginTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return studentEmergencyContacts;

	}
	
	

}
