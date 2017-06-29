package com.excelit.estudyhub.studentregister.bean;
/**
 * @author				:POOJA J
 * @createdOn			:27/6/2017
 * this bean class used for  Student Health Information
 */
import java.io.Serializable;

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
@Entity
@Table(name="esh_shealthinfo",schema = DBconstants.SCHEMA_NAME)
public class StudentHealthInformationBean implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shealthinfo_slno")
	private Integer serialNumber;
	
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "shealthinfo_registrationid",referencedColumnName="studnetprofile_registrationid")
     private StudentProfileBean studentRegistrationId;
	
	@Column(name = "shealthinfo_allergies", length = 20)
	private String Allergies;
	
	@Column(name = "shealthinfo_immunization", length = 20)
	private String Immunization;
	
	@Column(name = "shealthinfo_specialneeds", length = 20)
	private String specialNeeds;

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
	 * @param studentRegistrationId the studentRegistrationId to set
	 */
	public void setStudentRegistrationId(StudentProfileBean studentRegistrationId) {
		this.studentRegistrationId = studentRegistrationId;
	}

	/**
	 * @return the allergies
	 */
	public String getAllergies() {
		return Allergies;
	}

	/**
	 * @param allergies the allergies to set
	 */
	public void setAllergies(String allergies) {
		Allergies = allergies;
	}

	/**
	 * @return the immunization
	 */
	public String getImmunization() {
		return Immunization;
	}

	/**
	 * @param immunization the immunization to set
	 */
	public void setImmunization(String immunization) {
		Immunization = immunization;
	}

	/**
	 * @return the specialNeeds
	 */
	public String getSpecialNeeds() {
		return specialNeeds;
	}

	/**
	 * @param specialNeeds the specialNeeds to set
	 */
	public void setSpecialNeeds(String specialNeeds) {
		this.specialNeeds = specialNeeds;
	}

	

}