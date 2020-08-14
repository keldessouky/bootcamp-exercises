package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KarimsRealtorApp {

	public static void main(String[] args) {
KarimsHouse house = new KarimsHouse();
		
		house.setNumberOfBedrooms(4);
		house.setGarageSize(3);
		house.setNumberOfBathrooms(5);
		house.setSquareFootage(12000);
		house.setYearBuilt(2020);
		house.setPrice("1000000");
		
//		System.out.println("This house has " + house.getNumberOfBedrooms() + " bedrooms.");
//		System.out.println("This house has " + house.getGarageSize() + " car garage.");
//		System.out.println("This house has " + house.getNumberOfBathrooms() + " bathrooms.");
//		System.out.println("This house has " + house.getSquareFootage() + " sq ft..");
//		System.out.println("This house was built in " + house.getYearBuilt() );
		
		
		KarimsHouse house2 = new KarimsHouse();
		
		house2.setNumberOfBedrooms(6);
		house2.setGarageSize(4);
		house2.setNumberOfBathrooms(6);
		house2.setSquareFootage(6000);
		house2.setYearBuilt(2018);
		house2.setPrice("1000000");
		
//		System.out.println("This house2 has " + house2.getNumberOfBedrooms() + " bedrooms.");
//		System.out.println("This house2 has " + house2.getGarageSize() + " car garage.");
//		System.out.println("This house2 has " + house2.getNumberOfBathrooms() + " bathrooms.");
//		System.out.println("This house2 has " + house2.getSquareFootage() + " sq ft..");
//		System.out.println("This house2 was built in " + house2.getYearBuilt() );
		
		
		KarimsBuyer buyer = new KarimsBuyer();
		buyer.setFirstName("Joe");
		buyer.setLastName("Smith");
		
		KarimsAgent agent = new KarimsAgent();
		agent.setFirstName("Bob");
		agent.setLastName("Vance");
		agent.setAgentId(1);
		
		
		List<KarimsHouse> homesForSale = new ArrayList<KarimsHouse>();
		homesForSale.add(house);
		homesForSale.add(house2);
		
		Map<Integer, List<KarimsHouse>> homeInventoryMap = new HashMap<Integer, List<KarimsHouse>>();
		homeInventoryMap.put(1, homesForSale);
		
		
		//find the list of homes for agent 1
		List<KarimsHouse> agentOnesList = homeInventoryMap.get(1);
		
		for(KarimsHouse h : agentOnesList) {
			System.out.println("Garage size: " + h.getGarageSize() + ", ");
			System.out.println("Bedrooms: " + h.getNumberOfBedrooms() + ", ");
			System.out.println("Bathrooms: " + h.getNumberOfBathrooms() + ", ");
			System.out.println("Price: $" + h.getPrice() + ", ");
		
			System.out.println("_________________________________");
			
			
		
		
		}
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
