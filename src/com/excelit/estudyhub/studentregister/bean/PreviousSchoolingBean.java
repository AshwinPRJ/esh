package com.excelit.estudyhub.studentregister.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

/**
 * @author        : POOJA J
 * @created on    : 26/6/2017   
 * this bean class used for Student PreviousSchooling information
 */
@Entity
@Table(name = "esh_psi", schema = DBconstants.SCHEMA_NAME)
public class PreviousSchoolingBean implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "psi_slno")
	private Integer serialNumber;
	
	@Column(name = "psi_schoolname", length = 80)
	private String schoolName;
	
	@Column(name = "psi_categoryofschool", length = 1)
	private String categoryofSchool;

	@Column(name = "psi_schoolgrade", length = 1)
	private String schoolGrade;
	
	@Column(name = "psi_firstname", length = 3,precision=3)
	private BigDecimal gradePercentileOrMarks;

	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "spd_registrationid")
       private StudentProfileBean studentRegistrationId;
	
	 


	/**
	 * @return the serialNumber
	 */
	public Integer getSerialNumber() {
		return serialNumber;
	}




	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}




	/**
	 * @return the studentRegistrationId
	 */
	public StudentProfileBean getStudentRegistrationId() {
		return studentRegistrationId;
	}




	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}




	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}




	/**
	 * @return the categoryofSchool
	 */
	public String getCategoryofSchool() {
		return categoryofSchool;
	}




	/**
	 * @param categoryofSchool the categoryofSchool to set
	 */
	public void setCategoryofSchool(String categoryofSchool) {
		this.categoryofSchool = categoryofSchool;
	}




	/**
	 * @return the schoolGrade
	 */
	public String getSchoolGrade() {
		return schoolGrade;
	}




	/**
	 * @param schoolGrade the schoolGrade to set
	 */
	public void setSchoolGrade(String schoolGrade) {
		this.schoolGrade = schoolGrade;
	}




	/**
	 * @return the gradePercentileOrMarks
	 */
	public BigDecimal getGradePercentileOrMarks() {
		return gradePercentileOrMarks;
	}




	/**
	 * @param gradePercentileOrMarks the gradePercentileOrMarks to set
	 */
	public void setGradePercentileOrMarks(BigDecimal gradePercentileOrMarks) {
		this.gradePercentileOrMarks = gradePercentileOrMarks;
	}




	/**
	 * @param studentRegistrationId the studentRegistrationId to set
	 */
	public void setStudentRegistrationId(StudentProfileBean studentRegistrationId) {
		this.studentRegistrationId = studentRegistrationId;
	}

	/**
	 * @param studentRegistrationId the studentRegistrationId to set
	 */
	
	

}
