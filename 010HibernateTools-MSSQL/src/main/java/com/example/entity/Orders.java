package com.example.entity;
// Generated 25 Nov, 2020 6:52:26 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", schema = "sales", catalog = "crm")
public class Orders implements java.io.Serializable {

	private int orderId;
	private Customers customers;
	private Staffs staffs;
	private Stores stores;
	private byte orderStatus;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private Set<OrderItems> orderItemses = new HashSet<OrderItems>(0);

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
			Date requiredDate, Date shippedDate, Set<OrderItems> orderItemses) {
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

	@Id

	@Column(name = "order_id", unique = true, nullable = false)
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_id", nullable = false)
	public Staffs getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Staffs staffs) {
		this.staffs = staffs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id", nullable = false)
	public Stores getStores() {
		return this.stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	@Column(name = "order_status", nullable = false)
	public byte getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(byte orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "order_date", nullable = false, length = 10)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "required_date", nullable = false, length = 10)
	public Date getRequiredDate() {
		return this.requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "shipped_date", length = 10)
	public Date getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<OrderItems> getOrderItemses() {
		return this.orderItemses;
	}

	public void setOrderItemses(Set<OrderItems> orderItemses) {
		this.orderItemses = orderItemses;
	}

}