package com.example.pojo;
// Generated 25 Nov, 2020 6:51:44 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Categories generated by hbm2java
 */
public class Categories implements java.io.Serializable {

	private int categoryId;
	private String categoryName;
	private Set productses = new HashSet(0);

	public Categories() {
	}

	public Categories(int categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Categories(int categoryId, String categoryName, Set productses) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.productses = productses;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

}