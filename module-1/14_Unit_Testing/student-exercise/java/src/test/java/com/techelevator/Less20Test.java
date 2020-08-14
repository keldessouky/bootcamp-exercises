package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {
	private Less20 less20;

	@Before
	public void setUp() {
		less20 = new Less20();
	}

	@Test
	public void testIsLessThanMultipleOf20() {
		Assert.assertEquals(less20.isLessThanMultipleOf20(18), true);
		Assert.assertEquals(less20.isLessThanMultipleOf20(19), true);
		Assert.assertEquals(less20.isLessThanMultipleOf20(20), false);
	}
}
