package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {

	private Lucky13 lucky13;

	@Before
	public void setUp() {
		lucky13 = new Lucky13();
	}

	@Test
	public void testGetLucky() {
		Assert.assertEquals(lucky13.getLucky(new int[] { 0, 2, 4 }), true);
		Assert.assertEquals(lucky13.getLucky(new int[] { 1, 2, 3 }), false);
		Assert.assertEquals(lucky13.getLucky(new int[] { 1, 2, 4 }), false);

	}

}
