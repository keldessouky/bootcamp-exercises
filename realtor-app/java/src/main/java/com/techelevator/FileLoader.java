package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.domain.Address;
import com.techelevator.domain.Home;
import com.techelevator.domain.MultiFamilyHome;
import com.techelevator.domain.RentalHome;
import com.techelevator.domain.SingleFamilyHome;
import com.techelevator.domain.Specifications;

public class FileLoader {
	
	private String fileName = null;
	private final String SINGLE_FAMILY_HOME = "S";
	private final String MULTI_FAMILY_HOME = "M";
	private final String RENTAL_HOME = "R";
	
	public FileLoader(String fileName) {
		this.fileName = fileName;
	}
	
	
	public List<Home> loadData() throws InvalidFileException {
		
		List<Home> homeList = new ArrayList<Home>();
		
		try(Scanner scanner = new Scanner(new File(fileName))) {
			
			scanner.nextLine();  // this line reads and discards the first line which just 
			                     //describes the record layout
			
			//loop through while there are more records in the file
			while(scanner.hasNextLine()) {
				
				//grab row of file
				String record = scanner.nextLine();
				
				//record is pipe delimited so we need to escape the pipe character
				String[] fields = record.split("\\|");
				
				String houseType = fields[0];
				
				//build the appropriate sub-class based on the record type
				if (houseType.equals(SINGLE_FAMILY_HOME)) {     
                   homeList.add(buildSingleFamilyHome(fields));
				}
				else if (houseType.equals(RENTAL_HOME)) {
	               homeList.add(buildRentalProperty(fields));
				}				
			    else if (houseType.equals(MULTI_FAMILY_HOME)) {
	               homeList.add(buildMultiFamilyHome(fields));
				}	
				else {
					//let's tell our caller method that we have an invalid file type
			        throw new InvalidFileException(fileName + " has an invalid record type: " + houseType, fileName);
				}
			
	         }
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	  return homeList;	
		
	}
	
	
	private Home buildRentalProperty(String[] fields) {
		
		Address address = populateAddress(fields);
		Specifications specs = populateSpecifications(fields);
		
		Home home = new RentalHome(specs, address);
		home.setAskingPrice(Double.parseDouble(fields[7]));
		home.setMlsListingId(fields[1]);

		return home;
		
	}
	
	private Home buildSingleFamilyHome(String[] fields) {
		
		Address address = populateAddress(fields);
		Specifications specs = populateSpecifications(fields);
		
		Home home = new SingleFamilyHome(specs, address);
		home.setAskingPrice(Double.parseDouble(fields[7]));
		home.setMlsListingId(fields[1]);
		
		return home;		
	}
	
	private Home buildMultiFamilyHome(String[] fields) {
		
		Address address = populateAddress(fields);
		Specifications specs = populateSpecifications(fields);
		
		Home home = new MultiFamilyHome(specs, address);
		home.setAskingPrice(Double.parseDouble(fields[7]));
		home.setMlsListingId(fields[1]);
		
		return home;		
	}	
	
	private Address populateAddress(String[] fields) {
		
		Address address = new Address();
		
		address.setAddressLine1(fields[8]);
		address.setCity(fields[9]);
		address.setState(fields[10]);
		address.setZip(fields[11]);

		return address;
		
	}
	
	private Specifications populateSpecifications(String[] fields) {
		Specifications specs = new Specifications();
		
		specs.setNumberOfBedrooms(Integer.parseInt(fields[2]));
		specs.setGarageSize(Integer.parseInt(fields[3]));
		specs.setNumberOfBathrooms(Double.parseDouble(fields[4]));
		specs.setSquareFootage(Double.parseDouble(fields[5]));
		specs.setYearBuilt(Integer.parseInt(fields[6]));
		
		return specs;
		
	}


}
