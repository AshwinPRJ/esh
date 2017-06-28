package com.excelit.estudyhub.faculty.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.excelit.estudyhub.constants.DBconstants;

@Entity
@Table(name = "esh_facultysalary", schema = DBconstants.FACULTY)
public class FacultySalaryBean {
	@Id
	@Column(name = "facultysalary_ctcsalary", length = 30)
	private String ctcSalary;
	@Column(name = "facultysalary_year", length = 30)
	private String year;
	@Column(name = "facultysalary_percentageincrement", length = 30)
	private String percentageIncrement;
	@Column(name = "facultysalary_currency", length = 30)
	private String currency;

	/**
	 * @return the ctcSalary
	 */
	public String getCtcSalary() {
		return ctcSalary;
	}

	/**
	 * @param ctcSalary
	 *            the ctcSalary to set
	 */
	public void setCtcSalary(String ctcSalary) {
		this.ctcSalary = ctcSalary;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the percentageIncrement
	 */
	public String getPercentageIncrement() {
		return percentageIncrement;
	}

	/**
	 * @param percentageIncrement
	 *            the percentageIncrement to set
	 */
	public void setPercentageIncrement(String percentageIncrement) {
		this.percentageIncrement = percentageIncrement;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
