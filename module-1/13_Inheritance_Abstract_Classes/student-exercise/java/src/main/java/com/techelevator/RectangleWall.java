package com.techelevator;

public class RectangleWall extends Wall {
	private int length;
	private int height;

	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.height = height;
		this.length = length;
		
	}
	
	public RectangleWall() {
		
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	int area = 0;

	@Override
	public int getArea() {
		area = length * height;
		return area;
	}

	public String toString() {
		
		String result = getName() + " (" +  length + "x" + height + ") " + "rectangle";
		
		return result;
	}

}
