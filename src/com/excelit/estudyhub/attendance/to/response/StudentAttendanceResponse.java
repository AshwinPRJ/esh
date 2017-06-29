package com.excelit.estudyhub.attendance.to.response;

import java.util.List;

import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.utils.EStudyHubResponse;

public class StudentAttendanceResponse extends EStudyHubResponse{
	private List<StudentProfileBean> studentProfileListBean;

	/**
	 * @return the studentProfileListBean
	 */
	public List<StudentProfileBean> getStudentProfileListBean() {
		return studentProfileListBean;
	}

	/**
	 * @param studentProfileListBean the studentProfileListBean to set
	 */
	public void setStudentProfileListBean(List<StudentProfileBean> studentProfileListBean) {
		this.studentProfileListBean = studentProfileListBean;
	}
}
