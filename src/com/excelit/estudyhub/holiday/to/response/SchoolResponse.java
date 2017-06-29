package com.excelit.estudyhub.holiday.to.response;

import com.excelit.estudyhub.holiday.bean.SchoolProfileBean;
import com.excelit.utils.EStudyHubResponse;

public class SchoolResponse extends EStudyHubResponse {
	private SchoolProfileBean schoolProfileBean;

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


}
