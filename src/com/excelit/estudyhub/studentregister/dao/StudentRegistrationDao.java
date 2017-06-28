package com.excelit.estudyhub.studentregister.dao;

import org.hibernate.SessionFactory;

import com.excelit.estudyhub.studentregister.bean.FamilyInformationBean;
import com.excelit.estudyhub.studentregister.bean.PreviousSchoolingBean;
import com.excelit.estudyhub.studentregister.bean.StudentEmergencyContactsBean;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;

/**
 * @author POOJA
 * @since 24/6/2016 
 * this interface used to retrieve or save student
 *            registration details
 */

public interface StudentRegistrationDao {
	/**
	 * @author POOJA this DAO method definition used to save student profile
	 *         information
	 * @param studentProfileBean
	 * @param sessionFactory
	 * @return
	 */
	public StudentProfileBean saveStudentProfileInformation(SessionFactory sessionFactory,
			StudentProfileBean studentProfileBean);

	/**
	 * @author POOJA this DAO method definition used to save student previous
	 *         schooling information
	 * @param previousSchoolingBean
	 * @param sessionFactory
	 * @return
	 */
	public PreviousSchoolingBean savePreviousSchoolingInformation(SessionFactory sessionFactory,
			PreviousSchoolingBean previousSchoolingBean);

	/**
	 * @author POOJA
	 * @param sessionFactory
	 * @param studentRegisterId
	 * @return this DAO method definition used to retrieve student registration
	 *         details
	 */
	public StudentProfileBean getStudentProfileInformation(SessionFactory sessionFactory, String studentRegisterId);
	
	/**
	 * @author POOJA
	 * @param sessionFactory
	 * @param familyInformation
	 * @return 
	 * this DAO method definition used to save student family details
	 */
	public FamilyInformationBean saveStudentFamilyInformation(SessionFactory sessionFactory,FamilyInformationBean familyInformation);
	
	/**
	 * @author POOJA
	 * @param sessionFactory
	 * @param familyInformation
	 * @return 
	 * this DAO method definition used to save student emergency contacts details
	 */
	public StudentEmergencyContactsBean saveStudentEmergencyContacts(SessionFactory sessionFactory,StudentEmergencyContactsBean studentEmergencyContacts);
	

}
