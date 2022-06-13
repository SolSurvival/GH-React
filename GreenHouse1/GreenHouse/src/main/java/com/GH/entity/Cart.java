package com.GH.entity;

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
@Table(name="cart")
public class Cart {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany(cascade = {
	        CascadeType.ALL
	    })
	@JoinTable(
			name="cart_items",
	  joinColumns = {@JoinColumn(name = "cart_id", referencedColumnName="id")}, 
	  inverseJoinColumns = {@JoinColumn(name = "product_id", referencedColumnName="id")}
	)
	private List<CartItems> cartItems;
	
	public Cart() {
		
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public List<CartItems> getCartItems() {
		return cartItems;
	}

	public void addCartItem(CartItems cartItem) {
		this.cartItems.add(cartItem);
	}
	
	

	
	
}
