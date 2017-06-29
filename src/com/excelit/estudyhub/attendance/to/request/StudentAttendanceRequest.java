package com.excelit.estudyhub.attendance.to.request;

import java.util.List;

import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;

public class StudentAttendanceRequest {
	private List<StudentProfileBean> studentProfileBean;

	/**
	 * @return the studentProfileBean
	 */
	public List<StudentProfileBean> getStudentProfileBean() {
		return studentProfileBean;
	}

	/**
	 * @param studentProfileBean
	 *            the studentProfileBean to set
	 */
	public void setStudentProfileBean(List<StudentProfileBean> studentProfileBean) {
		this.studentProfileBean = studentProfileBean;
	}

}
