package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz(int i) {

		boolean hasThree = false;
		boolean hasFive = false;
		String numbers = String.valueOf(i);

		if (i >= 1 && i <= 100) {

			if (numbers.contains("3")) {
				hasThree = true;
			}
			if (numbers.contains("5")) {
				hasFive = true;
			}

			if (i % 3 == 0 && i % 5 == 0 || (hasThree && hasFive)) {
				return "FizzBuzz";
			}

			else if (i % 3 == 0 || hasThree) {
				return "Fizz";
			} else if (i % 5 == 0 || hasFive) {
				return "Buzz";

			} else {

				return String.valueOf(i);
			}

		} else {
			return "";
		}
	}
}

// FizzBuzz is a program that interviewers will often have developers they are
// interviewing with write or discuss during the interview process. We
// will use this opportunity to practice solving this problem.
//
// Your job will be to create a method called fizzBuzz, that will accept an int,
// and returns a String. The string that is returned is based on the
// following requirements:
//
//
// If the number is divisible by 3, convert the number to the string, "Fizz".