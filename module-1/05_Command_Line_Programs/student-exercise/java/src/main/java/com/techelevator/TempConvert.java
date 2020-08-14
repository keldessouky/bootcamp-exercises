package com.techelevator;

import java.util.Scanner;


//Write a command line program which prompts a user to enter a temperature, 
//and whether it's in degrees (C)elsius or (F)ahrenheit. Convert the 
//temperature to the opposite degrees, and display the old and new 
//temperatures to the console.
//Tc = (Tf - 32) / 1.8
//Tf = Tc * 1.8 + 32
//Please enter the temperature: 58
//Is the temperature in (C)elsius, or (F)ahrenheit? F
//58F is 14C.

public class TempConvert {

	public static void main(String[] args) {
		
	
		
		
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		String userTemp = in.nextLine();
		float userTempAsFloat = Float.parseFloat(userTemp);

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String celsiusOrFahrenheit = in.nextLine();

		if (celsiusOrFahrenheit.equalsIgnoreCase("C")) {
			float convertingCelsToFahr = (userTempAsFloat * 1.8F) + 32F;
			System.out.printf("%.2f", userTempAsFloat);
			System.out.print("C is ");
			System.out.printf("%.2f", convertingCelsToFahr);
			System.out.print("F. ");
			// System.out.println(userTempAsFloat + "C is " + convertingCelsToFahr + "F.");
			// doesn't allow formatting on one line, or I don't know how to
		} else if (celsiusOrFahrenheit.equalsIgnoreCase("F")) {
			float fahrToCels = (userTempAsFloat - 32F) / 1.8F;
			System.out.printf("%.2f", userTempAsFloat);
			System.out.print("F is ");
			System.out.printf("%.2f", fahrToCels);
			System.out.print("C. ");
			// System.out.println(userTempAsFloat + "F is " + fahrToCels + "C."); doesn't
			// allow formatting on one line, or I don't know how to
	}
		in.close();
	}

}
