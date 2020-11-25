package com.example.pojo;
// Generated 25 Nov, 2020 6:51:44 PM by Hibernate Tools 5.2.12.Final

/**
 * OrderItemsId generated by hbm2java
 */
public class OrderItemsId implements java.io.Serializable {

	private int orderId;
	private int itemId;

	public OrderItemsId() {
	}

	public OrderItemsId(int orderId, int itemId) {
		this.orderId = orderId;
		this.itemId = itemId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderItemsId))
			return false;
		OrderItemsId castOther = (OrderItemsId) other;

		return (this.getOrderId() == castOther.getOrderId()) && (this.getItemId() == castOther.getItemId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrderId();
		result = 37 * result + this.getItemId();
		return result;
	}

}
