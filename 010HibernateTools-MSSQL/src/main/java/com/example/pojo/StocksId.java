package com.example.pojo;
// Generated 25 Nov, 2020 7:31:27 PM by Hibernate Tools 5.2.12.Final

/**
 * StocksId generated by hbm2java
 */
public class StocksId implements java.io.Serializable {

	private int storeId;
	private int productId;

	public StocksId() {
	}

	public StocksId(int storeId, int productId) {
		this.storeId = storeId;
		this.productId = productId;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StocksId))
			return false;
		StocksId castOther = (StocksId) other;

		return (this.getStoreId() == castOther.getStoreId()) && (this.getProductId() == castOther.getProductId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStoreId();
		result = 37 * result + this.getProductId();
		return result;
	}

}
