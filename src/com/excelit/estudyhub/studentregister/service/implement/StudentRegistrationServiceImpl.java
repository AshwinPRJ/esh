package com.excelit.estudyhub.studentregister.service.implement;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.excelit.estudyhub.studentregister.bean.FamilyInformationBean;
import com.excelit.estudyhub.studentregister.bean.PreviousSchoolingBean;
import com.excelit.estudyhub.studentregister.bean.StudentEmergencyContactsBean;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.estudyhub.studentregister.dao.StudentRegistrationDao;
import com.excelit.estudyhub.studentregister.request.StudentRegistrationRequest;
import com.excelit.estudyhub.studentregister.service.StudentRegistrationService;
import com.excelit.resource.HibernateUtil;

/**
 * @author POOJA J
 * @since 26/6/2017 this service implementation class used for storing and
 *        retrieving student registration information
 */
@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	/**
	 * this variable used to call studentRegistrationDao method
	 */
	@Autowired
	private StudentRegistrationDao studentRegistrationDao;
	private SessionFactory sessionFactory;

	public StudentRegistrationServiceImpl() {
		/**
		 * getting SessionFactory from Hibernate Util
		 */
		this.sessionFactory = HibernateUtil.getSessionFactory();

	}

	/**
	 * @author POOJA J
	 * @since 26/6/2017
	 * @param studentRegistrationRequest
	 * @return this method used to store student profile information
	 */
	@Override
	public StudentProfileBean saveStudentProfileDetails(StudentRegistrationRequest studentRegistrationRequest) {
		return studentRegistrationDao.saveStudentProfileInformation(sessionFactory,
				studentRegistrationRequest.getStudentProfileRequest());
	}

	/**
	 * @author POOJA J
	 * @since 26/6/2017
	 * @param studentRegistrationRequest
	 * @return this method used to store student previous school information
	 */
	@Override
	public PreviousSchoolingBean savePreviousSchoolingInformation(
			StudentRegistrationRequest studentRegistrationRequest) {
		PreviousSchoolingBean previousSchooling = new PreviousSchoolingBean();
		for (PreviousSchoolingBean previousSchoolingInfo : studentRegistrationRequest.getPreviousSchoolingRequest()) {
			previousSchooling = studentRegistrationDao.savePreviousSchoolingInformation(sessionFactory,previousSchoolingInfo);
		}
		return previousSchooling;

	}

	/**
	 * @author POOJA J
	 * @since 27/6/2017
	 * @param studentRegisterId
	 * @return this method used to retrieve student registration details
	 */
	@Override
	public StudentProfileBean getStudentProfileInformation(String studentRegisterId) {
		return studentRegistrationDao.getStudentProfileInformation(sessionFactory, studentRegisterId);
	}

	/**
	 * @author POOJA J
	 * @since 27/6/2017
	 * @param studentRegistrationRequest
	 * @return this method used to save student family details
	 */
	@Override
	public FamilyInformationBean saveStudentFamilyInformation(StudentRegistrationRequest studentRegistrationRequest) {
		FamilyInformationBean familyInformation = new FamilyInformationBean();
		for (FamilyInformationBean familyInformationBean : studentRegistrationRequest.getFamilyInformation()) {
			familyInformation = studentRegistrationDao.saveStudentFamilyInformation(sessionFactory,familyInformationBean);
		}
		return familyInformation;
	}

	/**
	 * @author POOJA J
	 * @since 27/6/2017
	 * @param studentRegistrationRequest
	 * @return this method used to save student emergency contacts details
	 */
	@Override
	public StudentEmergencyContactsBean saveStudentEmergencyContacts(
			StudentRegistrationRequest studentRegistrationRequest) {
		StudentEmergencyContactsBean studentEmergencyContactsBean = new StudentEmergencyContactsBean();
		for (StudentEmergencyContactsBean studentEmergencyContacts : studentRegistrationRequest
				.getStudentEmergencyContacts()) {
			studentEmergencyContactsBean = studentRegistrationDao.saveStudentEmergencyContacts(sessionFactory,studentEmergencyContacts);
		}
		return studentEmergencyContactsBean;

	}
}
