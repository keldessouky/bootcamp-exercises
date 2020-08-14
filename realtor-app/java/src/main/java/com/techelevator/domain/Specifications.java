package com.techelevator.domain;

public class Specifications {

	private boolean hasPool;
	private double acreage;
	private int numberOfBedrooms;
	private double squareFootage;
	private double numberOfBathrooms;
	private boolean hasBasement;
	private int garageSize;
	private int yearBuilt;

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public double getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(double squareFootage) {
		this.squareFootage = squareFootage;
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

	public void setNumberOfBathrooms(double numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public double getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public boolean isHasPool() {
		return hasPool;
	}

	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}

	public double getAcreage() {
		return acreage;
	}

	public void setAcreage(double acreage) {
		this.acreage = acreage;
	}

}
