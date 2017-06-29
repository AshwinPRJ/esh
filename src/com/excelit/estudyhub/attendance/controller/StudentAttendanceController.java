package com.excelit.estudyhub.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excelit.estudyhub.attendance.service.StudentAttendanceServiceInterface;
import com.excelit.estudyhub.attendance.to.response.StudentAttendanceResponse;
import com.excelit.estudyhub.studentregister.bean.StudentProfileBean;
import com.excelit.utils.EStudyHubConstant;

@Controller
@RequestMapping("/student")
public class StudentAttendanceController {

	@Autowired
	private StudentAttendanceServiceInterface studentAttendanceServiceInterface;

	@RequestMapping(value = "/studentAttendance", method = RequestMethod.POST)
	@ResponseBody
	public List<StudentProfileBean> getStudentAttendanceDetailsController() {
		StudentAttendanceResponse studentAttendanceResponse = new StudentAttendanceResponse();
		List<StudentProfileBean> studentProfileBean ;
		studentProfileBean = studentAttendanceServiceInterface.getStudentAttendanceDetailsService();
		
		if(studentProfileBean != null){
			studentAttendanceResponse.setStudentProfileListBean(studentProfileBean);
			studentAttendanceResponse.setResponseCode(EStudyHubConstant.OK);
			studentAttendanceResponse.setResponseMessage("Faculty Profile Saved Sucessfully");
		} else {
			studentAttendanceResponse.setResponseCode(EStudyHubConstant.NO_CONTENT);
			studentAttendanceResponse.setResponseMessage("No Data Found");
		}
		return studentProfileBean;
	}

}
