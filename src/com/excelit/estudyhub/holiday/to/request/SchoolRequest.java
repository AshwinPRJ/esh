package com.excelit.estudyhub.holiday.to.request;

import com.excelit.estudyhub.holiday.bean.SchoolProfileBean;
import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;

public class SchoolRequest {
	
	private SchoolProfileBean schoolProfileBean;
	private ApplyLeaveBean applyLeaveBean;
	/**
	 * @return the schoolProfileBean
	 */
	public SchoolProfileBean getSchoolProfileBean() {
		return schoolProfileBean;
	}
	/**
	 * @param schoolProfileBean the schoolProfileBean to set
	 */
	public void setSchoolProfileBean(SchoolProfileBean schoolProfileBean) {
		this.schoolProfileBean = schoolProfileBean;
	}
	/**
	 * @return the applyLeaveBean
	 */
	public ApplyLeaveBean getApplyLeaveBean() {
		return applyLeaveBean;
	}
	/**
	 * @param applyLeaveBean the applyLeaveBean to set
	 */
	public void setApplyLeaveBean(ApplyLeaveBean applyLeaveBean) {
		this.applyLeaveBean = applyLeaveBean;
	}
	
	
	
}
