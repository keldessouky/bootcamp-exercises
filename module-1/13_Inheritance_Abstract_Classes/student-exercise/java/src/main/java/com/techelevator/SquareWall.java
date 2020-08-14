package com.techelevator;

public class SquareWall extends RectangleWall{
	
	private String name;
	private String color;
	private int sideLength;
	
	
	public SquareWall(String name, String color, int sideLength) {
		this.name = name;
		this.color = color;
		this.sideLength = sideLength;
		
	}
	
	
	public String toString() {
		String result = getName() + " (" + sideLength + "x" + sideLength + ") " + "square"; 
		return result;
	}
	
	public int getArea() {
		int area = sideLength * sideLength;
		
		return area;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSideLength() {
		return sideLength;
	}


	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	
	
	
	
	

}
