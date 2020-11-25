package com.example.pojo;
// Generated 25 Nov, 2020 6:51:44 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Staffs generated by hbm2java
 */
public class Staffs implements java.io.Serializable {

	private int staffId;
	private Staffs staffs;
	private Stores stores;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private byte active;
	private Set staffses = new HashSet(0);
	private Set orderses = new HashSet(0);

	public Staffs() {
	}

	public Staffs(int staffId, Stores stores, String firstName, String lastName, String email, byte active) {
		this.staffId = staffId;
		this.stores = stores;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.active = active;
	}

	public Staffs(int staffId, Staffs staffs, Stores stores, String firstName, String lastName, String email,
			String phone, byte active, Set staffses, Set orderses) {
		this.staffId = staffId;
		this.staffs = staffs;
		this.stores = stores;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.active = active;
		this.staffses = staffses;
		this.orderses = orderses;
	}

	public int getStaffId() {
		return this.staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public Staffs getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Staffs staffs) {
		this.staffs = staffs;
	}

	public Stores getStores() {
		return this.stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
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

}
