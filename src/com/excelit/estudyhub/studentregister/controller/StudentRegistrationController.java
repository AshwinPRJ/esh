package com.excelit.estudyhub.studentregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.estudyhub.studentregister.request.StudentRegistrationRequest;
import com.excelit.estudyhub.studentregister.response.StudentRegistrationResponse;
import com.excelit.estudyhub.studentregister.service.StudentRegistrationService;
import com.excelit.utils.EStudyHubConstant;

/**
 * this controller class used for student registration details
 * 
 * @author POOJA J
 * @since 24/6/2017
 *
 */
@Controller
public class StudentRegistrationController {
	@Autowired
	private StudentRegistrationService studentRegistrationService;

	/**
	 * this method used to send request to saveStudentProfileDetails() service
	 * method
	 * 
	 * @param studentRegistrationRequest
	 * @return
	 */
	@RequestMapping(value = "/save_student_registration_details", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public StudentRegistrationResponse saveStudentInformation(
			@RequestBody StudentRegistrationRequest studentRegistrationRequest) {
		StudentRegistrationResponse studentRegistrationResponse = new StudentRegistrationResponse();
		StudentProfileBean studentProfileResponse = studentRegistrationService
				.saveStudentProfileDetails(studentRegistrationRequest);
		if (studentProfileResponse != null) {
			studentRegistrationResponse.setStudentProfileBean(studentProfileResponse);
			studentRegistrationResponse.setResponseCode(EStudyHubConstant.SUCCESS);
		}
		return studentRegistrationResponse;
	}

	/**
	 * this method use to get student registration details for student admission process
	 * @param studentRegistrationId
	 * @return
	 */
	public StudentRegistrationResponse getStudentRegistrationDetails(@RequestParam("studentRegistrationId")String studentRegistrationId){
		StudentRegistrationResponse studentRegistrationResponse = new StudentRegistrationResponse();
		StudentProfileBean studentRegistration=studentRegistrationService.getStudentProfileInformation(studentRegistrationId);
		if (studentRegistration != null) {
			studentRegistrationResponse.setStudentProfileBean(studentRegistration);
			studentRegistrationResponse.setResponseCode(EStudyHubConstant.SUCCESS);
		}
		return studentRegistrationResponse;
	}
	
}
