package com.techelevator.locations;


import org.springframework.web.client.RestTemplate;


public class App {
	
  private UserInterface ui;

  public static void main(String[] args) {
	App app = new App();  
    app.run();
  }

  private void run() {
	  
  	ui = new UserInterface();

    boolean isFinished = false;
    String menuSelection;
	  
    while(!isFinished) {
    	  
        menuSelection = ui.printGreeting();
        
        
        if (menuSelection.equals("1")) {
            System.out.println("Not implemented");
        } 
        else if (menuSelection.equals("2")) {
            isFinished = true;
        } 
        else {
            System.out.println("Invalid Selection");
        }

    }
    
    System.out.println("Goodbye!");        
             
  }



}
