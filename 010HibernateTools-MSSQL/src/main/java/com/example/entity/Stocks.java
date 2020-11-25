package com.example.entity;
// Generated 25 Nov, 2020 6:52:26 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Stocks generated by hbm2java
 */
@Entity
@Table(name = "stocks", schema = "production", catalog = "crm")
public class Stocks implements java.io.Serializable {

	private StocksId id;
	private Products products;
	private Stores stores;
	private Integer quantity;

	public Stocks() {
	}

	public Stocks(StocksId id, Products products, Stores stores) {
		this.id = id;
		this.products = products;
		this.stores = stores;
	}

	public Stocks(StocksId id, Products products, Stores stores, Integer quantity) {
		this.id = id;
		this.products = products;
		this.stores = stores;
		this.quantity = quantity;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "storeId", column = @Column(name = "store_id", nullable = false)),
			@AttributeOverride(name = "productId", column = @Column(name = "product_id", nullable = false)) })
	public StocksId getId() {
		return this.id;
	}

	public void setId(StocksId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id", nullable = false, insertable = false, updatable = false)
	public Stores getStores() {
		return this.stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}