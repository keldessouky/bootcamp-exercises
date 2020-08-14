package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	private Map<Long, KarimsHouse> homeInventory = new HashMap<Long, KarimsHouse>();
	
	//not adding getters and setters because I dont want someone else being able 
	//to access all the inventory and loop through it all at once.
	
	public void addHouseToInventory(KarimsHouse house) {
		homeInventory.put(house.getMlsListingNumber(), house);
		
	}
	
	public void removeHouseFromInventory(Long MlsListingNumber) {
		homeInventory.remove(MlsListingNumber);
		
	}
	
	public KarimsHouse retrieveHouseByMLSNumber(Long MlsListingNumber) {
		return homeInventory.get(MlsListingNumber);
	}
	
	//TODO
//	public KarimsHouse retrieveHouseByAddress(Address address) {
//		return null;
//	}
	
	
	
}
