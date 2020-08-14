package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techelevator.domain.Home;

public class JGRealtorApp {

	private HomeController controller;
	private UserInterface ui;
	private final String DISPLAY_HOMES = "1";
	private final String ADD_A_NEW_LISTING = "2";
	private final String ADD_AGENT = "3";
	private final String EXIT_PROGRAM = "4";
	private final String LIST_A_SINGLE_FAMILY_HOME = "1";
	private final String LIST_A_RENTAL_HOME = "2";
	private final String LIST_A_MULTI_FAMILY_HOME = "3";
	private final String RETURN_TO_PREVIOUS_MENU = "4";

	public JGRealtorApp(String dateFile) {
		controller = new HomeController(dateFile);
		ui = new UserInterface();
	}

	public static void main(String[] args) {

		String dataFile = "inventory.txt";
		JGRealtorApp app = new JGRealtorApp(dataFile);
		app.run();

	}

	private void run() {

		boolean finished = false;

		// this is where we will create the main user interface and our main program
		// loop...

		while (!finished) {
			String response = ui.printMainMenu();
			// TODO: Add handlers for menu responses...
			if (response.equals(DISPLAY_HOMES)) {
				displayHomesHandler();
			} 
			else if (response.equals(ADD_A_NEW_LISTING)) {
				addANewListingHandler();
			} 
			else if (response.equals(ADD_AGENT)) {
				// call a handler method
			} 
			else if (response.equals(EXIT_PROGRAM)) {
				finished = true;
			} 
			else {
				System.out.println("Invalid Choice. Please try again!");
			}
		}

		System.out.println("Goodbye!");
	}

	private void displayHomesHandler() {
		List<Home> homes = controller.getListOfAvailableHomes();
		ui.printListOfHomes(homes);

	}

	private void addANewListingHandler() {
		

		boolean finished = false;

		while (!finished) {
			
			String response = ui.printListAHomeSubMenu();

			if (response.equals(LIST_A_SINGLE_FAMILY_HOME)) {
				System.out.println("You chose to list a single family home!");
				// TODO: call a handler method
			} 
			else if (response.equals(LIST_A_RENTAL_HOME)) {
				System.out.println("You chose to list a rental home!");
				// TODO: call a handler method
			} 
			else if (response.equals(LIST_A_MULTI_FAMILY_HOME)) {
				System.out.println("You chose to list a multi family home!");
				// TODO: call a handler method
			} 
			else if (response.equals(RETURN_TO_PREVIOUS_MENU)) {
				System.out.println("You chose to return to main menu");
				finished = true;
			} 
			else {
				System.out.println("Invalid Choice. Please try again!");
			}
		}

	}

}
