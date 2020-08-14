package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {

	private NonStart nonstart;

	@Before
	public void setUp() {
		nonstart = new NonStart();
	}

	@Test
	public void testGetPartialString() {

		Assert.assertEquals(nonstart.getPartialString("Hello", "There"), "ellohere");
		Assert.assertEquals(nonstart.getPartialString("java", "code"), "avaode");
		Assert.assertEquals(nonstart.getPartialString("shotl", "java"), "hotlava");
		Assert.assertEquals(nonstart.getPartialString("", "java"), "ava");
		Assert.assertEquals(nonstart.getPartialString("shotl", ""), "hotl");
		
		

	}
}

