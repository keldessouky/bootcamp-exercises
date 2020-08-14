package com.techelevator;

public class House implements Saleable {

	private double askingPrice;
	private double sellingPrice;
	private long mlsListingNumber;

	private Address address;
	private Specifications specs;

	public House(Specifications specs, Address address) {
		this.specs = specs;
		this.address = address;
	}

	@Override
	public Specifications listSpecifications() {

		return null;
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

	public long getMlsListingNumber() {
		return mlsListingNumber;
	}

	public void setMlsListingNumber(long mlsListingNumber) {
		this.mlsListingNumber = mlsListingNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Specifications getSpecs() {
		return specs;
	}

	public void setSpecs(Specifications specs) {
		this.specs = specs;
	}

}
