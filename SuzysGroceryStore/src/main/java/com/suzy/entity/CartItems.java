package com.suzy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartItems")
public class CartItems {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    @Column(name="quantityOfProduct")
    private String quantityOfProduct;

    public CartItems() {
    }

    public CartItems(Integer id, String quantityOfProduct) {
        this.id = id;
        this.quantityOfProduct = quantityOfProduct;
    }

    @Override
    public String toString() {
        return "CartItems [id=" + id + ", quantityOfProduct=" + quantityOfProduct + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(String quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

  


}