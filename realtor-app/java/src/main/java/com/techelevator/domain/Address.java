package com.techelevator.domain;

/**
 * This class represents an Address
 * 
 * @author JavaGreen class
 *
 */
public class Address {

	/*
	 * Class instance (member) variables, aka class attributes, aka class properties
	 */
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;

	/*
	 * This is a DEFAULT constructor. Every class has a default constructor and
	 * typing it is optional. Contructors are always called at object creation
	 */
	public Address() {

	}

	/*
	 * Getters and setters
	 */

	public String getCity() {
		return city;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
