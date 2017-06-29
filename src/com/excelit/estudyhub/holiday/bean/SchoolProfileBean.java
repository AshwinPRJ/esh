package com.excelit.estudyhub.holiday.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_schoolholiday", schema = DBconstants.SCHOOLLEAVES)
public class SchoolProfileBean {
	@Id
	@Column(name = "schoolholiday_date", length = 30)
	private Date date;
	
	@Column(name = "schoolholiday_event", length = 30)
	private String event;
	
	@Column(name = "schoolholiday_holidaytype", length = 30)
	private String holidaytype;
	
	@Column(name = "schoolholiday_reason", length = 30)
	private String reason;
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}
	/**
	 * @return the holidaytype
	 */
	public String getHolidaytype() {
		return holidaytype;
	}
	/**
	 * @param holidaytype the holidaytype to set
	 */
	public void setHolidaytype(String holidaytype) {
		this.holidaytype = holidaytype;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
}
