package com.example.entity;
// Generated 25 Nov, 2020 6:52:26 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Brands generated by hbm2java
 */
@Entity
@Table(name = "brands", schema = "production", catalog = "crm")
public class Brands implements java.io.Serializable {

	private int brandId;
	private String brandName;
	private Set<Products> productses = new HashSet<Products>(0);

	public Brands() {
	}

	public Brands(int brandId, String brandName) {
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public Brands(int brandId, String brandName, Set<Products> productses) {
		this.brandId = brandId;
		this.brandName = brandName;
		this.productses = productses;
	}

	@Id

	@Column(name = "brand_id", unique = true, nullable = false)
	public int getBrandId() {
		return this.brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	@Column(name = "brand_name", nullable = false)
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brands")
	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

}