package com.stacy.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "house")
public class House {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="beds")
	private Integer beds;
	
	@Column(name="baths")
	private Integer baths;
	
	@Column(name="square_feet")
	private Integer squareFeet;
	
	@Column(name = "is_on_market")
	private Boolean isOnMarket;
	
	@Column(name = "date_posted")
	private Date datePosted;
	
	@Column(name = "street_number")
	private String street_number;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getBeds() {
		return beds;
	}

	public void setBeds(Integer beds) {
		this.beds = beds;
	}

	public Integer getBaths() {
		return baths;
	}

	public void setBaths(Integer baths) {
		this.baths = baths;
	}

	public Integer getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(Integer squareFeet) {
		this.squareFeet = squareFeet;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public Boolean getIsOnMarket() {
		return isOnMarket;
	}

	public void setIsOnMarket(Boolean isOnMarket) {
		this.isOnMarket = isOnMarket;
	}

	public Date getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}

	public String getStreet_number() {
		return street_number;
	}

	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}

	
		
}
