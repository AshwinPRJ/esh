package com.excelit.estudyhub.history.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.excelit.estudyhub.history.service.LeaveHistoryServiceinterface;
import com.excelit.estudyhub.history.to.response.LeaveHistoryResponse;
import com.excelit.estudyhub.holiday.bean.ApplyLeaveBean;
import com.excelit.utils.EStudyHubConstant;

@Controller
@RequestMapping("/leave")
public class LeaveHistoryController {
	
	
	@Autowired
	private LeaveHistoryServiceinterface leaveHistoryServiceinterface;
	
	@RequestMapping(value = "/leaveHistory", method = RequestMethod.POST)
	@ResponseBody
	public List<ApplyLeaveBean> getLeaveHistoryDetailsController()
	{
		System.out.println("controller");
		LeaveHistoryResponse leaveHistoryResponse = new LeaveHistoryResponse();
		List<ApplyLeaveBean> applyLeaveBean;
		applyLeaveBean = leaveHistoryServiceinterface.getLeaveHistoryDetailsService();
		
		if(applyLeaveBean != null){
			leaveHistoryResponse.setApplyleaveListBean(applyLeaveBean);
			leaveHistoryResponse.setResponseCode(EStudyHubConstant.OK);
			leaveHistoryResponse.setResponseMessage("data Saved Sucessfully");
		} else {
			leaveHistoryResponse.setResponseCode(EStudyHubConstant.NO_CONTENT);
			leaveHistoryResponse.setResponseMessage("No Data Found");
		}
		
		
		return applyLeaveBean;
		
	}

}
