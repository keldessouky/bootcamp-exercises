package com.techelevator.domain;

import java.math.BigDecimal;

public class SingleFamilyHome extends Home {

	public SingleFamilyHome(Specifications specs, Address address) {
		super(specs, address);

	}

	@Override
	public BigDecimal calculateAnnualPropertyTax(double taxRate) {
		// TODO Auto-generated method stub
		return null;
	}



}
