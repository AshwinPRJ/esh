package com.excelit.estudyhub.holiday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excelit.estudyhub.holiday.bean.SchoolProfileBean;
import com.excelit.estudyhub.holiday.service.SchoolProfileServiceInterface;
import com.excelit.estudyhub.holiday.to.request.SchoolRequest;
import com.excelit.estudyhub.holiday.to.response.SchoolResponse;
import com.excelit.utils.EStudyHubConstant;


@Controller
@RequestMapping("/holiday")
public class SchoolProfileController {
	@Autowired
	private SchoolProfileServiceInterface schoolProfileServiceInterface;
	
	
	@RequestMapping(value = "/schoolProfiling", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public SchoolResponse setSchoolProfilingController(@RequestBody SchoolRequest schoolRequest) {
		SchoolResponse schoolResponse = new SchoolResponse();
		SchoolProfileBean schoolProfileBean = new SchoolProfileBean();
	
		
		schoolProfileBean =	schoolProfileServiceInterface.setSchoolProfilingService(schoolRequest);
		
		
		
		
		if(schoolProfileBean != null){
			schoolResponse.setSchoolProfileBean(schoolProfileBean);
			schoolResponse.setResponseCode(EStudyHubConstant.OK);
			schoolResponse.setResponseMessage("School holiday list saved Sucessfully");
		} else {
			schoolResponse.setResponseCode(EStudyHubConstant.NO_CONTENT);
			schoolResponse.setResponseMessage("No Data Found");
		}
		return schoolResponse;
	}
}
