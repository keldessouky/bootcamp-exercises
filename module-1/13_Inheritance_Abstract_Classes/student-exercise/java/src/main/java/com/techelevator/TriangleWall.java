package com.techelevator;

public class TriangleWall extends Wall{
	private int base;
	private int height;
	
	public TriangleWall(String name, String color, int base, int height) {
		super(name, color);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getArea() {
		int area = (base * height)/2;
		return area;
	}
	
	public String toString() {
		String result = getName() + " (" + base + "x" + height + ") " + "triangle";
		return result;
	}
	
	

}
