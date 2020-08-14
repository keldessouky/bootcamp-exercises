package com.techelevator;

import java.util.List;

import com.techelevator.domain.Home;

public class HomeController {
	
	private Inventory inventory;
	
	public HomeController(String dateFile) {
		inventory = new Inventory(dateFile);
	}
	
	// This will contain any business logic or decisioning and interact with the back end code.
	
	public List<Home> getListOfAvailableHomes() {
		return inventory.getAllAvailableHomes();
	}
	
	

}
