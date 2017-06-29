package com.excelit.estudyhub.studentregister.bean;
/**
 * @author 			:POOJA J
 * @createdOn		:27/6/2017
 * this bean class used for  student Family Information
 */
import java.io.File;
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
@Entity
@Table(name="esh_sfamilyinfo",schema = DBconstants.SCHEMA_NAME)
public class FamilyInformationBean  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sfamilyinfo_slno")
	private Integer serialNumber;

	
	@Column(name = "sfamilyinfo_relationship", length = 20)
	private String relationship;
	
	@Column(name = "sfamilyinfo_custodyofchild", length = 1)
	private String legalCustodyOfChild;
	
	@Column(name = "sfamilyinfo_documents")
	private File custodyOfChildDocuments;
	
	@Column(name = "sfamilyinfo_firstname", length = 20)
	private String firstName;
	
	@Column(name = "sfamilyinfo_middlename", length = 20)
	private String middleName;
	
	@Column(name = "sfamilyinfo_lastname", length = 20)
	private String lastName;
	
	@Column(name = "sfamilyinfo_profession", length = 40)
	private String profession; 
	
	@Column(name = "sparentsinfo_homelanguage", length = 1)
	private String homeLanguage; 
	
	@Column(name = "sfamilyinfo_addressline1", length = 50)
	private String addressLine1;

	@Column(name = "sfamilyinfo_addressline2", length = 50)
	private String addressLine2;

	@Column(name = "sfamilyinfo_addressline3", length = 50)
	private String addressLine3;

	@Column(name = "sfamilyinfo_city", length = 50)
	private String cityOrTown;

	@Column(name = "sfamilyinfo_district", length = 60)
	private String district;

	@Column(name = "sfamilyinfo_state", length = 50)
	private String state;

	@Column(name = "sfamilyinfo_country", length = 50)
	private String country;

	@Column(name = "sfamilyinfo_postal_code", length = 15)
	private Integer postalOrZipCode;
	
	@Column(name = "sfamilyinfo_phonenumber", length = 15)
	private Integer phoneNumber;
	
	@Column(name = "sfamilyinfo_sibling", length = 30)
	private String Sibling;

	@Column(name = "sfamilyinfo_siblingsname", length = 70)
	private String siblingsName;
	
	@Column(name = "sfamilyinfo_siblingschool", length = 15)
	private String school;
	
	@Column(name = "sfamilyinfo_siblingsgrade", length=5,precision=2)
	private BigDecimal siblingsGrade;

	
	  
	@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "sfamilyinfo_registrationid",referencedColumnName="studnetprofile_registrationid")
	   private StudentProfileBean studentProfileBean;
	
 
	    /**
	 * @return the studentProfileBean
	 */
	public StudentProfileBean getStudentProfileBean() {
		return studentProfileBean;
	}

	/**
	 * @param studentProfileBean the studentProfileBean to set
	 */
	public void setStudentProfileBean(StudentProfileBean studentProfileBean) {
		this.studentProfileBean = studentProfileBean;
	}

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
	 * @return the legalCustodyOfChild
	 */
	public String getLegalCustodyOfChild() {
		return legalCustodyOfChild;
	}

	/**
	 * @param legalCustodyOfChild the legalCustodyOfChild to set
	 */
	public void setLegalCustodyOfChild(String legalCustodyOfChild) {
		this.legalCustodyOfChild = legalCustodyOfChild;
	}

	/**
	 * @return the custodyOfChildDocuments
	 */
	public File getCustodyOfChildDocuments() {
		return custodyOfChildDocuments;
	}

	/**
	 * @param custodyOfChildDocuments the custodyOfChildDocuments to set
	 */
	public void setCustodyOfChildDocuments(File custodyOfChildDocuments) {
		this.custodyOfChildDocuments = custodyOfChildDocuments;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the homeLanguage
	 */
	public String getHomeLanguage() {
		return homeLanguage;
	}

	/**
	 * @param homeLanguage the homeLanguage to set
	 */
	public void setHomeLanguage(String homeLanguage) {
		this.homeLanguage = homeLanguage;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}

	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	/**
	 * @return the cityOrTown
	 */
	public String getCityOrTown() {
		return cityOrTown;
	}

	/**
	 * @param cityOrTown the cityOrTown to set
	 */
	public void setCityOrTown(String cityOrTown) {
		this.cityOrTown = cityOrTown;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the postalOrZipCode
	 */
	public Integer getPostalOrZipCode() {
		return postalOrZipCode;
	}

	/**
	 * @param postalOrZipCode the postalOrZipCode to set
	 */
	public void setPostalOrZipCode(Integer postalOrZipCode) {
		this.postalOrZipCode = postalOrZipCode;
	}

	/**
	 * @return the phoneNumber
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the sibling
	 */
	public String getSibling() {
		return Sibling;
	}

	/**
	 * @param sibling the sibling to set
	 */
	public void setSibling(String sibling) {
		Sibling = sibling;
	}

	/**
	 * @return the siblingsName
	 */
	public String getSiblingsName() {
		return siblingsName;
	}

	/**
	 * @param siblingsName the siblingsName to set
	 */
	public void setSiblingsName(String siblingsName) {
		this.siblingsName = siblingsName;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the siblingsGrade
	 */
	public BigDecimal getSiblingsGrade() {
		return siblingsGrade;
	}

	/**
	 * @param siblingsGrade the siblingsGrade to set
	 */
	public void setSiblingsGrade(BigDecimal siblingsGrade) {
		this.siblingsGrade = siblingsGrade;
	}
	

	
}
