package com.excelit.estudyhub.history.to.request;

import java.util.List;

import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;


public class LeaveHistoryRequest {
	
	
	private List<ApplyLeaveBean> applyLeaveBean;

	/**
	 * @return the applyLeaveBean
	 */
	public List<ApplyLeaveBean> getApplyLeaveBean() {
		return applyLeaveBean;
	}

	/**
	 * @param applyLeaveBean the applyLeaveBean to set
	 */
	public void setApplyLeaveBean(List<ApplyLeaveBean> applyLeaveBean) {
		this.applyLeaveBean = applyLeaveBean;
	}

	
	
	
}
