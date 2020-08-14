package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	private KataFizzBuzz katafizzbuzz;
	
	@Before
	public void setUp() {
		katafizzbuzz = new KataFizzBuzz();
	}
	
	@Test
	public void testNotNull() {
		Assert.assertNotNull(katafizzbuzz);
	}
	
	@Test
	public void testDivisibleByThree() {
		Assert.assertEquals("Test is not divisible by 3", "Fizz", katafizzbuzz.fizzBuzz(3));
		Assert.assertEquals("Test is not divisible by 3", "Fizz", katafizzbuzz.fizzBuzz(9));
		Assert.assertEquals("Test is not divisible by 3", "4", katafizzbuzz.fizzBuzz(4));
	}
	
	@Test
	public void testDivisibleByFive() {
		Assert.assertEquals("Test is not divisible by 5", "Buzz", katafizzbuzz.fizzBuzz(5));
		Assert.assertEquals("Test is not divisible by 5", "Buzz", katafizzbuzz.fizzBuzz(25));
		Assert.assertEquals("Test is not divisible by 5", "19", katafizzbuzz.fizzBuzz(19));
	}
	
	@Test
	public void testDivisibleByThreeAndFive() {
		Assert.assertEquals("Test is not divisible by 3 and 5", "FizzBuzz", katafizzbuzz.fizzBuzz(15));
		Assert.assertEquals("Test is not divisible by 3 and 5", "FizzBuzz", katafizzbuzz.fizzBuzz(90));
		Assert.assertEquals("Test is not divisible by 3 and 5", "44", katafizzbuzz.fizzBuzz(44));
	}
	
	@Test
	public void testAllOtherNumbersInRange() {
		Assert.assertEquals("Test is not divisible by 3 and 5 in range", "77", katafizzbuzz.fizzBuzz(77));
		Assert.assertEquals("Test is not divisible by 3 and 5 in range", "22", katafizzbuzz.fizzBuzz(22));
		Assert.assertEquals("Test is not divisible by 3 and 5 in range", "88", katafizzbuzz.fizzBuzz(88));
	}
	
	@Test
	public void testAllOtherNumbersNotInRange() {
		Assert.assertEquals("Test is not divisible by 3 and 5 not in range", "", katafizzbuzz.fizzBuzz(0));
		Assert.assertEquals("Test is not divisible by 3 and 5 not in range", "", katafizzbuzz.fizzBuzz(-4));
		Assert.assertEquals("Test is not divisible by 3 and 5 not in range", "", katafizzbuzz.fizzBuzz(105));
	}
	
	@Test
	public void testContainsAThree() {
		Assert.assertEquals("Test is not contains 3", "Fizz", katafizzbuzz.fizzBuzz(73));
		Assert.assertEquals("Test is not contains 3", "Fizz", katafizzbuzz.fizzBuzz(43));
		Assert.assertEquals("Test is not contains 3", "Fizz", katafizzbuzz.fizzBuzz(13));
		
	}
	
	@Test
	public void testContainsAFive() {
		Assert.assertEquals("Test is not contains 5", "Buzz", katafizzbuzz.fizzBuzz(56));
		Assert.assertEquals("Test is not contains 5", "Buzz", katafizzbuzz.fizzBuzz(59));
		
	}
	@Test
	public void testContainsAThreeAndFive() {
		Assert.assertEquals("Test is not contains 3 and 5", "FizzBuzz", katafizzbuzz.fizzBuzz(53));
		
		
	}
}
