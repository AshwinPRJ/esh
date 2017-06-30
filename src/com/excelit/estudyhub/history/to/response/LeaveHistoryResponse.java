package com.excelit.estudyhub.history.to.response;

import java.util.List;

import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;
import com.excelit.utils.EStudyHubResponse;


public class LeaveHistoryResponse extends EStudyHubResponse{
	
	private List<ApplyLeaveBean> applyleaveListBean;
	
	/**
	 * @return the applyleaveListBean
	 */
	public List<ApplyLeaveBean> getApplyleaveListBean() {
		return applyleaveListBean;
	}

	/**
	 * @param applyleaveListBean the applyleaveListBean to set
	 */
	public void setApplyleaveListBean(List<ApplyLeaveBean> applyleaveListBean) {
		this.applyleaveListBean = applyleaveListBean;
	}

	
	
	
	

}
