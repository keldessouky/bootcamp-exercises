package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

	private FrontTimes frontTimes;

	@Before
	public void setUp() {
		frontTimes = new FrontTimes();
	}

	@Test
	public void testGenerateString() {
		Assert.assertEquals(frontTimes.generateString("Chocolate", 2), "ChoCho");
		Assert.assertEquals(frontTimes.generateString("Chocolate", 3), "ChoChoCho");
		Assert.assertEquals(frontTimes.generateString("Abc", 3), "AbcAbcAbc");
	}
}
