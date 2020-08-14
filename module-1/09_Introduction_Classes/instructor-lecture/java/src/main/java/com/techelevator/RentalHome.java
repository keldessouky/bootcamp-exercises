package com.techelevator;

public class RentalHome extends House{
	
	
	public RentalHome(Specifications specs, Address address) {
		super(specs, address);
		
	}

	private int leaseDurationInMonths;
	private boolean allowsPets;

	public int getLeaseDurationInMonths() {
		return leaseDurationInMonths;
	}

	public void setLeaseDurationInMonths(int leaseDurationInMonths) {
		this.leaseDurationInMonths = leaseDurationInMonths;
	}

	public boolean isAllowsPets() {
		return allowsPets;
	}

	public void setAllowsPets(boolean allowsPets) {
		this.allowsPets = allowsPets;
	}

}
