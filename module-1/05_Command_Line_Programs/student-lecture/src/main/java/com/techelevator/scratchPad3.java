package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class scratchPad3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean areWeThere = false;
		while (!areWeThere) {
			System.out.println("Are We There Yet? Enter (Y) for Yes, (N) for No");
			String answer = scanner.nextLine();

			if (answer.equalsIgnoreCase("Y")) {
				areWeThere = true;
			} else {
				System.out.println("Eat my shorts!!!");
			}

		}
		System.out.println("Finally!");

		String myString = "The big bad wolf";
		boolean isFound = myString.contains("big");
		System.out.println(isFound);
		isFound = myString.contains("car");
		System.out.println(isFound);

		if (myString.contains("big")) {
			System.out.println("Word found!");
		}

		if (myString.startsWith("Bob")) {
			System.out.println("Starts with Bob!");
		}

		myString = myString.replace("bad", "good");
		System.out.println(myString);

		String trimExample = "  Steve    ";
		String trimmedValue = trimExample.trim();

		String boolValueAsAString = String.valueOf(true);
		System.out.println(boolValueAsAString);

		char[] myCharArray = new char[] { 's', 't', 'e', 'v', 'e' };

		String nameUsingChar = new String(myCharArray);

		List<String> hobbits = new ArrayList<String>();

		hobbits.add("Bilbo"); // now we can add items to the list
		hobbits.add("Frodo");
		hobbits.add("Matty");
		hobbits.add("Brian");

		hobbits.add(1, "Pippen"); // this would add Pippen at index 1, making Frodo
		// hold index 2 and shifting everything else after as well.
		// hobbits.add(1, "George"); //this adds george at index 1 and shifts everything
		// else by one, including pippen

		hobbits.remove(1); // this removes the object in index 1.
		String matty = hobbits.get(2); // this would get the value of the object in
		// index 2

		for (int i = 0; i < hobbits.size(); i++) {
			System.out.println(hobbits.get(i));
		} // this is how you get the value of the objects in the list
		for (String hobbit : hobbits) {
			System.out.println(hobbit);
		} // this is called a for each loop. it will look through the entire
			// list and check for the object i need
			// for each loop only moves forward
			// looks at every element , so always one at a time. not able to do backwards or
			// other
			// scenarios like for loop. so its an enhanced loop for the basic "check
			// everything in the list
		// one at a time" method.
		boolean inList = hobbits.contains("Samwise");
		if (inList) {
			System.out.println("Samwise is in the list of names");
		}
		int foundIndex = hobbits.indexOf("Brian");
		System.out.println(hobbits.get(foundIndex));

		hobbits.set(2, "Matty the new guy");
		// this will replace the element in that index with a new element

		List<Integer> numbers = new ArrayList<Integer>();
		int x = 7;
		Integer xAsIntegerObject = new Integer(x); // now you can do .equals . convert etc
		// to xAsIntegerObject

		double doubleVal = xAsIntegerObject.doubleValue();

		List<Long> longs = new ArrayList<Long>();
		List<Boolean> booleans = new ArrayList<Boolean>();
		// <Object> = <Object> basically telling it to create a list of objects

		// List<Students> studentList = new ArrayList<Students>();
		// List<Something> somethingList = new ArrayList<Something>();
		// List<Dog> listOfDogs = new ArrayList<Dog>();
		// List<Object> nameOfList = new ArrayList<Object>();

		Queue<String> myTasks = new LinkedList<String>();
		myTasks.offer("Task 1");
		myTasks.offer("Task 2");
		myTasks.offer("Task 3");
		myTasks.offer("Task 4");

		while (!myTasks.isEmpty()) {
			System.out.println(myTasks.poll());

		}

		Stack<String> myStackOfStuff = new Stack<String>();
		myStackOfStuff.push("Stuff 1");
		myStackOfStuff.push("Stuff 2");
		myStackOfStuff.push("Stuff 3");
		myStackOfStuff.push("Stuff 4");

		while (!myStackOfStuff.isEmpty()) {
			System.out.println(myStackOfStuff.pop());
		}

		Map<String, String> stateCodes = new HashMap<String, String>();
		stateCodes.put("OH", "Ohio");
		stateCodes.put("TX", "Texas");
		stateCodes.put("FL", "Florida");
		stateCodes.put("NY", "New York");

		String myState = stateCodes.get("OH");
		System.out.println(myState);

		String newState = stateCodes.get("AK");
		System.out.println(newState);
		// this is a good way to check if there is something in the map

		if (newState == null) {
			System.out.println("not found!");
		}

		if (stateCodes.containsKey("TX")) { // it will check to see if that key exists, doesn't tell
			System.out.println("found!"); // if there are duplicates though.
		}

		Set<String> keys = stateCodes.keySet();
		for (String key : keys) { // for each key in the set of keys (I declared the variable here)
			System.out.println(key); // this would print out each key.
			// do something
			System.out.println("hello" + stateCodes.get(key));

			if (stateCodes.get(key).equals("New York")) {
				System.out.println("We found NY!");
			}

		}

		Map<String, Integer> filingStatus = new HashMap<String, Integer>();

		filingStatus.put("OH", new Integer(1000));
		filingStatus.put("PA", 1000);

		// Map<String, Bird> birds = new HashMap<String, Bird>();
		// birds.put("Sesame Street", new Bird()); //this is an example of using a
		// different class as
		// a value instead of simple stuff.

		Map<String, int[]> scores = new HashMap<String, int[]>();

		int[] student1Scores = new int[] { 1, 2, 3, 4, 5 };
		int[] student2Scores = new int[] { 4, 5, 6, 7, 8 };

		scores.put("123", student1Scores);
		scores.put("456", student2Scores);

		int[] tempArray = scores.get("123");
		int y = tempArray[0];

		Set<String> mySet = new HashSet<String>();

		// HashSet is unordered. BUT it ignores duplicates and doesnt add them!

		// Map<String, Boolean> filingStatus = new HashMap<String, Boolean>();

		int earned = 5;
		int possible = 10;

		double z = (double) earned / possible;
		System.out.println(z);

	}

}
