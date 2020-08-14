package com.techelevator.domain;

/**
 * This class represents a real estate agent
 * 
 * @author JavaGreen class
 *
 */

public class Agent extends Party {

	/*
	 * Class instance (member) variables, aka class attributes, aka class properties
	 */

	private String companyName;
	private int agentId; // unique agent identifier

	// constructor
	public Agent(int agentId) {
		this.agentId = agentId;
	}

	
	

	/*
	 * Getters and Setters go in this section
	 */


	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
