package com.GH.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;

	@Column(name="cost")
	private Double cost;
	
	@Column(name="category")
	private String category;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@ManyToMany(cascade = {
	        CascadeType.ALL
	    })
	@JoinTable(
	  name = "cart_items", 
	  joinColumns = @JoinColumn(name = "product_id", referencedColumnName="id"), 
	  inverseJoinColumns = @JoinColumn(name = "cart_id", referencedColumnName="id")
	)
	List<CartItems> cartItems;

	public List<CartItems> getCartItems() {
		return cartItems;
	}


	public void addCartItem(CartItems cartItem) {
		cartItems.add(cartItem);
	}


	public Product() {
		
	}
	
	
	public Product(String name, Double cost, String category, Integer quantity) {
		this.name = name;
		this.cost = cost;
		this.category = category;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", category=" + category + ", quantity="
				+ quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}
	
	
	
	
}
