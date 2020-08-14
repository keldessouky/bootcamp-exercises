package com.techelevator.calculator;

public class Calculator {

	
	public Calculator() {
		
	}
	private int result;

	public int getResult() {
		return result;
	}
	
	public int add(int addend) {
		result = addend + result;
		return result;
	}
	public int multiply(int multiplier) {
		result = result * multiplier;
		return result;
	}
	
	public int power(int exponent) {
		result = (int) Math.pow(result, exponent);
		return result;
	}
	
	public void reset() {
		result = 0;
	}
	
	public int subtract(int subtrahend) {
		result = result - subtrahend;
		return result;
	}
	
	
}
