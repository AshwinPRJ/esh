package com.excelit.estudyhub.studentregister.request;

import java.util.List;

import com.excelit.estudyhub.studentregister.bean.FamilyInformationBean;
import com.excelit.estudyhub.studentregister.bean.PreviousSchoolingBean;
import com.excelit.estudyhub.studentregister.bean.StudentEmergencyContactsBean;
import com.excelit.estudyhub.studentregister.bean.StudentHealthInformationBean;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;

public class StudentRegistrationRequest {
private StudentProfileBean studentProfileRequest;
private List<PreviousSchoolingBean> PreviousSchoolingRequest;
private List<FamilyInformationBean> familyInformation;
private List<StudentEmergencyContactsBean> studentEmergencyContacts;
private StudentHealthInformationBean studentHealthInformationBean;


/**
 * @return the studentHealthInformationBean
 */
public StudentHealthInformationBean getStudentHealthInformationBean() {
	return studentHealthInformationBean;
}
/**
 * @param studentHealthInformationBean the studentHealthInformationBean to set
 */
public void setStudentHealthInformationBean(StudentHealthInformationBean studentHealthInformationBean) {
	this.studentHealthInformationBean = studentHealthInformationBean;
}
/**
 * @return the studentEmergencyContacts
 */
public List<StudentEmergencyContactsBean> getStudentEmergencyContacts() {
	return studentEmergencyContacts;
}
/**
 * @param studentEmergencyContacts the studentEmergencyContacts to set
 */
public void setStudentEmergencyContacts(List<StudentEmergencyContactsBean> studentEmergencyContacts) {
	this.studentEmergencyContacts = studentEmergencyContacts;
}
/**
 * @return the familyInformation
 */
public List<FamilyInformationBean> getFamilyInformation() {
	return familyInformation;
}
/**
 * @param familyInformation the familyInformation to set
 */
public void setFamilyInformation(List<FamilyInformationBean> familyInformation) {
	this.familyInformation = familyInformation;
}

/**
 * @return the studentProfileRequest
 */
public StudentProfileBean getStudentProfileRequest() {
	return studentProfileRequest;
}
/**
 * @param studentProfileRequest the studentProfileRequest to set
 */
public void setStudentProfileRequest(StudentProfileBean studentProfileRequest) {
	this.studentProfileRequest = studentProfileRequest;
}
/**
 * @return the previousSchoolingRequest
 */
public List<PreviousSchoolingBean> getPreviousSchoolingRequest() {
	return PreviousSchoolingRequest;
}
/**
 * @param previousSchoolingRequest the previousSchoolingRequest to set
 */
public void setPreviousSchoolingRequest(List<PreviousSchoolingBean> previousSchoolingRequest) {
	PreviousSchoolingRequest = previousSchoolingRequest;
}


}
