package com.techelevator;

public class InvalidFileException extends Exception {
	
	private String fileName;
	
	public InvalidFileException(String message, String fileName) {
		super(message);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}	
	
}
