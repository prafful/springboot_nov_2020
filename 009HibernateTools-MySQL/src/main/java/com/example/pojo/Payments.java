package com.example.pojo;
// Generated 25 Nov, 2020 6:42:43 PM by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Payments generated by hbm2java
 */
public class Payments implements java.io.Serializable {

	private PaymentsId id;
	private Customers customers;
	private Date paymentDate;
	private BigDecimal amount;

	public Payments() {
	}

	public Payments(PaymentsId id, Customers customers, Date paymentDate, BigDecimal amount) {
		this.id = id;
		this.customers = customers;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public PaymentsId getId() {
		return this.id;
	}

	public void setId(PaymentsId id) {
		this.id = id;
	}

	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
