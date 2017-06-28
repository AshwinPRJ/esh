package com.excelit.estudyhub.studentregister.service;

import com.excelit.estudyhub.studentregister.bean.FamilyInformationBean;
import com.excelit.estudyhub.studentregister.bean.PreviousSchoolingBean;
import com.excelit.estudyhub.studentregister.bean.StudentEmergencyContactsBean;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.estudyhub.studentregister.request.StudentRegistrationRequest;

public interface StudentRegistrationService {
	/**
	 * @author POOJA this service method definition used to save student profile   information
	 * @param studentRegistrationRequest
	 * @return
	 */
public StudentProfileBean saveStudentProfileDetails(StudentRegistrationRequest studentRegistrationRequest);
/**
 * @author POOJA 
 * this service method definition used to save student previous schooling information
 * @param studentRegistrationRequest
 * @return
 */
public PreviousSchoolingBean savePreviousSchoolingInformation(StudentRegistrationRequest studentRegistrationRequest);
/**
 * @author POOJA
 * @param sessionFactory
 * @param studentRegisterId
 * @return 
 * this service method definition used to retrieve student registration  details
 */
public StudentProfileBean getStudentProfileInformation(String studentRegisterId);

/**
 * @author POOJA
 * @param sessionFactory
 * @param familyInformation
 * @return 
 * this service method definition used to save student family details
 */
public FamilyInformationBean saveStudentFamilyInformation(StudentRegistrationRequest studentRegistrationRequest);

/**
 * @author POOJA
 * @param sessionFactory
 * @param familyInformation
 * @return 
 * this service method definition used to save student emergency contacts details
 */
public StudentEmergencyContactsBean saveStudentEmergencyContacts(StudentRegistrationRequest studentRegistrationRequest);
}
