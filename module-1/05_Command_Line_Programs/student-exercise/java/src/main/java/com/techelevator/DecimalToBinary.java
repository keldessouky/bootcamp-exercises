package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String[] numbersFromUser = input.nextLine().split(" ");

		// ----------------------------------------------------------------

		for (int i = 0; i < numbersFromUser.length; i++) {

			int inputInt = Integer.parseInt(numbersFromUser[i]);
			String binaryString = "";

			if (inputInt == 0) {
				binaryString = "0";
			}
			while (inputInt > 0) {
				binaryString = (inputInt % 2) + binaryString;
				inputInt = inputInt / 2;
			}
			System.out.println(numbersFromUser[i] + " in binary is " + binaryString);
		} // this is a much simpler way to create the conversion without having to worry
			// about placing the values in an array then flipping that array backwards to
			// display the values properly

		input.close();

	}

}



//
//Write a command line program which prompts the user for a series of decimal integer values separated by spaces. Each decimal integer is displayed along with its equivalent binary value.
//
//Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
//
//460 in binary is 111001100
//8218 in binary is 10000000011010
//1 in binary is 1
//31313 in binary is 111101001010001
//987654321 in binary is 111010110111100110100010110001
