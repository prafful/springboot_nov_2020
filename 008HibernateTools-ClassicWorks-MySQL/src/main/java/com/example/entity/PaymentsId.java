package com.example.entity;
// Generated 25 Nov, 2020 6:03:27 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PaymentsId generated by hbm2java
 */
@Embeddable
public class PaymentsId implements java.io.Serializable {

	private int customerNumber;
	private String checkNumber;

	public PaymentsId() {
	}

	public PaymentsId(int customerNumber, String checkNumber) {
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
	}

	@Column(name = "customerNumber", nullable = false)
	public int getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Column(name = "checkNumber", nullable = false, length = 50)
	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaymentsId))
			return false;
		PaymentsId castOther = (PaymentsId) other;

		return (this.getCustomerNumber() == castOther.getCustomerNumber())
				&& ((this.getCheckNumber() == castOther.getCheckNumber())
						|| (this.getCheckNumber() != null && castOther.getCheckNumber() != null
								&& this.getCheckNumber().equals(castOther.getCheckNumber())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCustomerNumber();
		result = 37 * result + (getCheckNumber() == null ? 0 : this.getCheckNumber().hashCode());
		return result;
	}

}
