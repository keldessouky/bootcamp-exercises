package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the length: ");
		String input = in.nextLine();
		float inputAsFloat = Float.parseFloat(input);

		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String metersOrFeet = in.nextLine();

		if (metersOrFeet.equalsIgnoreCase("M")) {
			float metersToFeet = inputAsFloat * 3.2808399F;
			System.out.printf("%.2f", inputAsFloat);
			System.out.print("m is ");
			System.out.printf("%.2f", metersToFeet);
			System.out.print("f. ");

//			Please enter the length: 58
//			Is the measurement in (m)eter, or (f)eet? f
//			58f is 17m.

		} else if (metersOrFeet.equalsIgnoreCase("F")) {
			float feetToMeters = inputAsFloat * 0.3048F;
			System.out.printf("%.2f", inputAsFloat);
			System.out.print("f is ");
			System.out.printf("%.2f", feetToMeters);
			System.out.print("m. ");
			// m = f * 0.3048
			// f = m * 3.2808399
	}
	
		in.close();
	}

}
