package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {

	private AnimalGroupName animals;

	@Before
	public void setUp() {
		animals = new AnimalGroupName();
	}

	@Test
	public void testGetHerd() {
		Assert.assertEquals(animals.getHerd("rhino"), "Crash");
		Assert.assertEquals(animals.getHerd("giraffe"), "Tower");
		Assert.assertEquals(animals.getHerd("elephant"), "Herd");
		Assert.assertEquals(animals.getHerd("lion"), "Herd");
		Assert.assertEquals(animals.getHerd("cat"), "unknown");
		Assert.assertEquals(animals.getHerd(""), "unknown");
		Assert.assertEquals(animals.getHerd(null), "unknown");
		Assert.assertEquals(animals.getHerd("pigeon"), "Kit");
	}

}
