package com.example.pojo;
// Generated 25 Nov, 2020 6:42:43 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Offices generated by hbm2java
 */
public class Offices implements java.io.Serializable {

	private String officeCode;
	private String city;
	private String phone;
	private String addressLine1;
	private String addressLine2;
	private String state;
	private String country;
	private String postalCode;
	private String territory;
	private Set employeeses = new HashSet(0);

	public Offices() {
	}

	public Offices(String officeCode, String city, String phone, String addressLine1, String country, String postalCode,
			String territory) {
		this.officeCode = officeCode;
		this.city = city;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
	}

	public Offices(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state,
			String country, String postalCode, String territory, Set employeeses) {
		this.officeCode = officeCode;
		this.city = city;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
		this.employeeses = employeeses;
	}

	public String getOfficeCode() {
		return this.officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTerritory() {
		return this.territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public Set getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set employeeses) {
		this.employeeses = employeeses;
	}

}
