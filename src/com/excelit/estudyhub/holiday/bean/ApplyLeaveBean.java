package com.excelit.estudyhub.holiday.bean;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "esh_applyleave")
public class ApplyLeaveBean {
	@Id
	@Column(name = "applyleave_studentName", length = 60)
	private String studentName;

	@Column(name = "applyleave_leavetype", length = 11)
	private String leavetype;

	@Column(name = "applyleave_leaveBalance", length = 11)
	private BigInteger leaveBalance;

	@Column(name = "applyleave_fromDate", length = 60)
	private Date fromDate;

	@Column(name = "applyleave_toDate")
	private Date toDate;
	
	@Column(name = "applyleave_daysOfLeave", length = 60)
	private BigInteger daysOfLeave;
	
	@Column(name = "applyleave_approver", length = 60)
	private String approver;
	
	@Column(name = "applyleave_remarks", length = 60)
	private String remarks;
	
	@Column(name = "applyleave_email", length = 60)
	private String email;

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the leavetype
	 */
	public String getLeavetype() {
		return leavetype;
	}

	/**
	 * @param leavetype the leavetype to set
	 */
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	/**
	 * @return the leaveBalance
	 */
	public BigInteger getLeaveBalance() {
		return leaveBalance;
	}

	/**
	 * @param leaveBalance the leaveBalance to set
	 */
	public void setLeaveBalance(BigInteger leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the daysOfLeave
	 */
	public BigInteger getDaysOfLeave() {
		return daysOfLeave;
	}

	/**
	 * @param daysOfLeave the daysOfLeave to set
	 */
	public void setDaysOfLeave(BigInteger daysOfLeave) {
		this.daysOfLeave = daysOfLeave;
	}

	/**
	 * @return the approver
	 */
	public String getApprover() {
		return approver;
	}

	/**
	 * @param approver the approver to set
	 */
	public void setApprover(String approver) {
		this.approver = approver;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


}
