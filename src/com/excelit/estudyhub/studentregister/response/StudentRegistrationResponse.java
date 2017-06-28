package com.excelit.estudyhub.studentregister.response;


import com.excelit.estudyhub.studentregister.bean.PreviousSchoolingBean;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.utils.EStudyHubResponse;

public class StudentRegistrationResponse extends EStudyHubResponse {
	private StudentProfileBean studentProfileBean;
	private PreviousSchoolingBean previousSchoolingBean;
	
	
	

	public PreviousSchoolingBean getPreviousSchoolingBean() {
		return previousSchoolingBean;
	}

	public void setPreviousSchoolingBean(PreviousSchoolingBean previousSchoolingBean) {
		this.previousSchoolingBean = previousSchoolingBean;
	}

	/**
	 * @return the studentProfileBean
	 */
	public StudentProfileBean getStudentProfileBean() {
		return studentProfileBean;
	}

	/**
	 * @param studentProfileBean the studentProfileBean to set
	 */
	public void setStudentProfileBean(StudentProfileBean studentProfileBean) {
		this.studentProfileBean = studentProfileBean;
	}
	
	
	

}
