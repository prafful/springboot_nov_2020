package com.example.pojo;
// Generated 25 Nov, 2020 7:31:27 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Stores generated by hbm2java
 */
public class Stores implements java.io.Serializable {

	private int storeId;
	private String storeName;
	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private Set staffses = new HashSet(0);
	private Set orderses = new HashSet(0);
	private Set stockses = new HashSet(0);

	public Stores() {
	}

	public Stores(int storeId, String storeName) {
		this.storeId = storeId;
		this.storeName = storeName;
	}

	public Stores(int storeId, String storeName, String phone, String email, String street, String city, String state,
			String zipCode, Set staffses, Set orderses, Set stockses) {
		this.storeId = storeId;
		this.storeName = storeName;
		this.phone = phone;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.staffses = staffses;
		this.orderses = orderses;
		this.stockses = stockses;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Set getStaffses() {
		return this.staffses;
	}

	public void setStaffses(Set staffses) {
		this.staffses = staffses;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getStockses() {
		return this.stockses;
	}

	public void setStockses(Set stockses) {
		this.stockses = stockses;
	}

}
