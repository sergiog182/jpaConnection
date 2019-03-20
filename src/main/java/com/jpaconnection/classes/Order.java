package com.jpaconnection.classes;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=10)
	private String accepted;

	@Column(nullable=false, length=50)
	private String comments;

	@Column(nullable=false, length=10)
	private String country;

	@Column(nullable=false)
	private int itemsQuantity;

	@Column(nullable=false, length=50)
	private String name;

	@Column(nullable=false)
	private int processed;

	@Column(nullable=false, length=10)
	private String total;

	public Order() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccepted() {
		return this.accepted;
	}

	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getItemsQuantity() {
		return this.itemsQuantity;
	}

	public void setItemsQuantity(int itemsQuantity) {
		this.itemsQuantity = itemsQuantity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProcessed() {
		return this.processed;
	}

	public void setProcessed(int processed) {
		this.processed = processed;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}