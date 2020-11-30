package com.example.pojo;
// Generated 25 Nov, 2020 7:31:27 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private int orderId;
	private Customers customers;
	private Staffs staffs;
	private Stores stores;
	private byte orderStatus;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private Set orderItemses = new HashSet(0);

	public Orders() {
	}

	public Orders(int orderId, Staffs staffs, Stores stores, byte orderStatus, Date orderDate, Date requiredDate) {
		this.orderId = orderId;
		this.staffs = staffs;
		this.stores = stores;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
	}

	public Orders(int orderId, Customers customers, Staffs staffs, Stores stores, byte orderStatus, Date orderDate,
			Date requiredDate, Date shippedDate, Set orderItemses) {
		this.orderId = orderId;
		this.customers = customers;
		this.staffs = staffs;
		this.stores = stores;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.orderItemses = orderItemses;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
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

	public byte getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(byte orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return this.requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Set getOrderItemses() {
		return this.orderItemses;
	}

	public void setOrderItemses(Set orderItemses) {
		this.orderItemses = orderItemses;
	}

}
