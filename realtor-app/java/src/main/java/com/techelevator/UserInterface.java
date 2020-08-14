package com.techelevator;

import java.util.List;
import java.util.Scanner;

import com.techelevator.domain.Home;

/**
 * The purpose of this class to to print menus and collect user responses. You
 * do not implement business functionality here, just the menu and user input.
 * 
 * @author Java Green Class
 *
 */

public class UserInterface {

	// Create Scanner object to capture user input and return choice
	private Scanner scanner = new Scanner(System.in);

	/*
	 * 1. Display available homes for sale
	 * 2. List a new home for sale
	 * 3. Add a new real estate agent
	 * 3. Exit Program
	 */
	public String printMainMenu() {

		// Add code that lists our main menu options
		System.out.println("************** Realtor App 3000 ****************\n" );
		System.out.println("\n");
		System.out.println("1. Display Available Homes For Sale");
		System.out.println("2. List a New Home For Sale");
		System.out.println("3. Add A New Real Estate Agent");
		System.out.println("4. Exit Program");
		
       
		return scanner.nextLine();

	}


	public String printListAHomeSubMenu() {

		// Add code that lists our main menu options
		System.out.println("************** List a New Home For Sale ****************\n" );
		System.out.println("\n");
		System.out.println("What would you like to do today?\n");
		System.out.println("1. Single Family Home");
		System.out.println("2. Rental Home");
		System.out.println("3. Multi-Family Home");
		System.out.println("4. Return to Previous Menu");
		
       
		return scanner.nextLine();

	}
	
	
	
	public void printListOfHomes(List<Home> homesList) {
		
		for (Home home: homesList) {
			System.out.println("MLS: " + home.getMlsListingId());
			System.out.println("Asking Price: " + home.getAskingPrice());
			System.out.println("Address: " + home.getAddress().getAddressLine1() + " " + home.getAddress().getCity() + " " + home.getAddress().getState() + " " + home.getAddress().getZip());
			System.out.println("Specifications: \n");
			System.out.println("Number of bedrooms: " + home.getSpecs().getNumberOfBedrooms());
			
			//TODO: print out the rest...
		}
	}
	
	

		

}
