package com.excelit.estudyhub.studentregister.bean;
/**
 * @author 		:POOJA J
 * @createdOn	:27/6/2017
 * this bean used for student Emergency Contacts details
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
@Table(name = "esh_seci", schema = DBconstants.SCHEMA_NAME)
public class StudentEmergencyContactsBean implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seci_slno", length = 11)
	private String serialNumber;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "spd_registrationid")
	private StudentProfileBean studentRegistrationId;

	@Column(name = "seci_relationship", length = 50)
	private String relationship;

	@Column(name = "seci_name", length = 50)
	private String Name;
	
	@Column(name = "seci_landlinenumber", length = 20)
	private Integer landLine;

	@Column(name = "seci_documents", length = 20)
	private Integer mobileNumber;

	@Column(name = "seci_emailid", length = 20)
	private String emailId;

	
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
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
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the landLine
	 */
	public Integer getLandLine() {
		return landLine;
	}

	/**
	 * @param landLine the landLine to set
	 */
	public void setLandLine(Integer landLine) {
		this.landLine = landLine;
	}

	/**
	 * @return the mobileNumber
	 */
	public Integer getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	
	

}
