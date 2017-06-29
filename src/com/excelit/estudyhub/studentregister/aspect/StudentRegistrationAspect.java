package com.excelit.estudyhub.studentregister.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.excelit.estudyhub.studentregister.bean.PreviousSchoolingBean;
import com.excelit.estudyhub.studentregister.request.StudentRegistrationRequest;
import com.excelit.estudyhub.studentregister.service.StudentRegistrationService;

/**
 * 
 * @author POOJA J
 * @since 27/6/2017
 *
 */
@Aspect
@Component
public class StudentRegistrationAspect {
	@Autowired
	private StudentRegistrationService studentRegistrationService;

	StudentRegistrationRequest studentRegistrationRequest = new StudentRegistrationRequest();

	/**
	 * this method used to send request to saveStudentPreviousSchoolling()
	 * service method
	 * 
	 * @param joinpoint
	 * @return
	 */
	/*@After("execution(* com.excelit.estudyhub.studentregister.controller.StudentRegistrationController.saveStudentInformation(..))")
	public Object saveStudentPreviousSchoolling(JoinPoint joinpoint) {
		StudentRegistrationRequest studentRegistrationRequest = new StudentRegistrationRequest();
		Object PreviousSchoolling[] = joinpoint.getArgs();
		for (Object arguments : PreviousSchoolling) {
			if (arguments instanceof StudentRegistrationRequest) {
				studentRegistrationRequest = (StudentRegistrationRequest) arguments;
				if (studentRegistrationRequest.getPreviousSchoolingRequest() != null) {
					studentRegistrationService.savePreviousSchoolingInformation(studentRegistrationRequest);
				}

			}
		}
		return PreviousSchoolling;
	}*/

	/**
	 * this method used to send request to saveStudentFamilyInformation()
	 * service method
	 * 
	 * @param joinpoint
	 * @return
	 */
	/*@After("execution(* com.excelit.estudyhub.studentregister.controller.StudentRegistrationController.saveStudentInformation(..))")
	public Object saveStudentFamilyInformation(JoinPoint joinpoint) {

		Object familyInformation[] = joinpoint.getArgs();
		for (Object arguments : familyInformation) {
			if (arguments instanceof StudentRegistrationRequest) {
				studentRegistrationRequest = (StudentRegistrationRequest) arguments;
				if (studentRegistrationRequest.getFamilyInformation() != null) {
					studentRegistrationService.saveStudentFamilyInformation(studentRegistrationRequest);
				}

			}
		}
		return familyInformation;
	}*/

	/**
	 * this method used to send request to saveStudentEmergencyContacts()
	 * service method
	 * 
	 * @param joinpoint
	 * @return
	 */
	/*@After("execution(* com.excelit.estudyhub.studentregister.controller.StudentRegistrationController.saveStudentInformation(..))")
	public Object saveStudentEmergencyContacts(JoinPoint joinpoint) {
		StudentRegistrationRequest studentRegistrationRequest = new StudentRegistrationRequest();
		Object emergencyContacts[] = joinpoint.getArgs();
		for (Object arguments : emergencyContacts) {
			if (arguments instanceof StudentRegistrationRequest) {
				studentRegistrationRequest = (StudentRegistrationRequest) arguments;
				if (studentRegistrationRequest.getStudentEmergencyContacts() != null) {
					studentRegistrationService.saveStudentEmergencyContacts(studentRegistrationRequest);
				}

			}
		}
		return emergencyContacts;
	}
*/
}
