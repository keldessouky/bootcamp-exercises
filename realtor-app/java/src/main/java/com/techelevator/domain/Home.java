package com.techelevator.domain;

import java.math.BigDecimal;

public abstract class Home {

	/*
	 * Class instance (member) variables, aka class attributes, aka class properties
	 */

	private double askingPrice;
	private double sellingPrice;
	private String mlsListinId;

	private Address address;
	private Specifications specs;
	

	/*
	 * Custom constructor
	 * 
	 */
	public Home(Specifications specs, Address address) {
		this.specs = specs;
		this.address = address;
	}
	
	public abstract BigDecimal calculateAnnualPropertyTax(double taxRate);
	
		

	/*
	 * Getters and setters section is below
	 */
	public Address getAddress() {
		return address;
	}


	public double getAskingPrice() {
		return askingPrice;
	}

	public void setAskingPrice(double askingPrice) {
		this.askingPrice = askingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}


	public String getMlsListingId() {
		return mlsListinId;
	}

	public void setMlsListingId(String mlsListinId) {
		this.mlsListinId = mlsListinId;
	}

	public String getMlsListinId() {
		return mlsListinId;
	}

	public void setMlsListinId(String mlsListinId) {
		this.mlsListinId = mlsListinId;
	}

	public Specifications getSpecs() {
		return specs;
	}

	public void setSpecs(Specifications specs) {
		this.specs = specs;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
