package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techelevator.domain.Address;
import com.techelevator.domain.Home;

/**
 * This class will manage the inventory of all homes on the market
 * 
 * @author Java Green Class
 */
public class Inventory {

	/*
	 * This map represents our entire home inventory
	 *  (Key - MLS Listing number,   Value - House object tied to that listing)
	 */
	private Map<String, Home> homeInventory = new HashMap<String, Home>();

	/*
	 * Let's add a constructor to load the inventory. For now we will create some
	 * test objects, but later we will load it from a file or database.
	 */
	public Inventory(String fileName) {
		
		//I chose to handle it an underlying 'checked' exception here, rather than pass all the way back out. I need to come back and 
		//think of how to best handle. If you look at the FileLoader you will notice that it throws a custom exception: InvalidFileException. 
		try {
			loadHomeData(fileName);
		} catch (InvalidFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	/*
	 * Public Methods = The following methods will be used buy other objects to get access or manpulate our home 
	 * inventory in some way.
	 */
	
	public List<Home> getAllAvailableHomes() {
		
		List<Home> homeList = new ArrayList<Home>();
		
		//get all homes from the map and put in a list to return. A list is much easier to wrk with.
		
		Set<String> keySet = homeInventory.keySet();
		for (String key : keySet) {
			homeList.add(homeInventory.get(key));
		}
		
		return homeList;
		
	}

	public void addHouseToInventory(Home home) {

		homeInventory.put(home.getMlsListingId(), home);

	}

	public void removeHouseFromInventory(Long mlsListingId) {
		homeInventory.remove(mlsListingId);
	}

	public Home retrieveHouseByMLSNumber(Long mlsListingId) {
		return homeInventory.get(mlsListingId);
	}

	// TODO - come back here to implement - going to wait until Module 2 when we can write queries to do this
	// instead of writing a bunch of compares and loops.
	public Home retrieveHouseByAddress(Address searchAddress) {

		// loop through all the items in map, pull out each House, look inside it at the
		// address fields and see if there is a match

		return null;
	}

	// TODO - come back here to implement - going to wait until Module 2 when we can write queries to do this
	// instead of writing a bunch of compares and loops.
	public List<Home> retrieveHomesByZipCode(String zipCode) {

		// loop through all the items in map, pull out each House, look inside it at the
		// address fields and see if there is a match

		return null;
	}
	
	
	
	/*
	 * Private Methods - The following are methods used internally by this class to keep code clean and concise
	 */
	
	
	
	/*
	 * This is just a temporary method that will load data into our map. It is called in the 
	 * constructor so we have some test house to work with.
	 *  TODO: Later, we will modify this to read from a file or database
	 */
	private void loadHomeData(String fileName) throws InvalidFileException {
		
		FileLoader fileLoader = new FileLoader(fileName);
		List<Home> homeList = fileLoader.loadData();
		
	    for (Home home : homeList) {
	    	//now let's add the house to this classes home inventory map
	    	this.homeInventory.put(home.getMlsListingId(), home);
	    }
		
		
		
	}

}
