package com.techelevator;

public class KarimsHouse {
	private int numberOfBedrooms;
	private double squareFootage;
	private double numberOfBathrooms;
	private boolean hasBasement;
	private int garageSize;
	private int yearBuilt;
	private boolean termitesStatus;
	private boolean sold = false;
	private double price;
	private long MlsListingNumber;
	
	
	
	public void setPrice(String price) {		//method overloading which is giving it two options to do the same thing
		Double tempPrice = Double.valueOf(price);
		this.price = tempPrice.doubleValue();
	}
	
	public void setPrice(double price) {  //this is called method overriding
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isSold() {
		return sold;
	}

	
	public boolean getIsTermites() {
		return termitesStatus;
	}
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	
	public void setNumberOfBedrooms(int number) {
		numberOfBedrooms = number;
	}

	public double getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(double squareFootage) {
		this.squareFootage = squareFootage;
	}

	public double getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(double numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public boolean isHasBasement() {
		return hasBasement;
	}

	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}

	public int getGarageSize() {
		return garageSize;
	}

	public void setGarageSize(int garageSize) {
		this.garageSize = garageSize;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
	
	public long getMlsListingNumber() {
		return MlsListingNumber;
	}

	public void setMlsListingNumber(long mlsListingNumber) {
		MlsListingNumber = mlsListingNumber;
	}

	public String toString() {
		return toString();
		
	}


}
