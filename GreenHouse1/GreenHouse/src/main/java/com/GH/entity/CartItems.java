package com.GH.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_items")
public class CartItems {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="quantityOfProduct")
	Integer quantityOfProduct;

	@Column(name="product_id")
	Integer productId;

	@Column(name="cart_id")
	Integer cartId;
	
	public CartItems() {}
	public Integer getProductId() {
		return productId;
	}
	
	public Integer getCartId() {
		return cartId;
	}
	
	public CartItems(Integer quantityOfProduct) {
		this.quantityOfProduct = quantityOfProduct;
	}

	public Integer getQuantityOfProduct() {
		return quantityOfProduct;
	}

	public void setQuantityOfProduct(Integer quantityOfProduct) {
		this.quantityOfProduct = quantityOfProduct;
	}

	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "CartItems [id=" + id + ", quantityOfProduct=" + quantityOfProduct + "]";
	}
}
