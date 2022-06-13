package com.suzy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class Product {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    
    @Column(name="name")
    private String name;

    @Column(name="category")
    private String category;

    @Column(name="cost")
    private Double cost;

    @Column(name="quantity")
    private String quantity;



    public Integer getId() {
        return id;     
    }
    @Override
    public String toString() {
        return "Product [category=" + category + ", cost=" + cost + ", id=" + id + ", name=" + name + ", quantity="
                + quantity + "]";
    }
    public Product() {
    }
    public Product(Integer id, String name, String category, Double cost, String quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.quantity = quantity;
    }
    public void getId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    

    
}
