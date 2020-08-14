//package com.techelevator;
//
//import java.util.Scanner;
//
//public class HumanDogYears {
//
//	public static void main(String[] args) {
//		
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println("Enter a series of human ages separated by commas: ");
//		String ageInput = myScanner.nextLine();
//		String[] ages = ageInput.split(",");
//		
//		for (int i = 0; i < ages.length; i++) {
//			
//			String tempAge = ages[i];
//			int ageAsInt = Integer.parseInt(tempAge);
//			
//			System.out.println("Your age in dog years is: " + ageAsInt * 7);
//			
//		}
//		
//		System.out.println("You are done");
//		
//			}
//
//}
//-------------------------------------------------------------------------------------
////Scanner myScanner = new Scanner(System.in);   HOW TO DO IT PARSE
////
////System.out.println("How old are you, human?");
////
////String age = myScanner.nextLine();
////int ageAsInteger = Integer.parseInt(age);
////
////
////System.out.println("Age of human: " + age);
////
////int dogYears = ageAsInteger * 7;
////
////System.out.println("Age in dog years: " + dogYears);
////
////System.out.println("What is your name?");
////String name = myScanner.nextLine();
////
////System.out.print(" Your name is " + name);
//-------------------------------------------------------------------------------------
//
//
////Scanner myScanner = new Scanner(System.in);  HOW TO DO IT WITH NEXT LINE
////
////System.out.println("How old are you, human?");
////
////int age = myScanner.nextInt();
////myScanner.nextLine();
////
////System.out.println("Age of human: " + age);
////
////System.out.println("What is your name?");
////String name = myScanner.nextLine();
////
////System.out.print(" Your name is " + name);