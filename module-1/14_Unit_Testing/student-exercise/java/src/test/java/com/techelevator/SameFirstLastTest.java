package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
	private SameFirstLast samefirstlast;

	@Before
	public void setUp() {
		samefirstlast = new SameFirstLast();
	}

	@Test
	public void SameFirstLast() {
		Assert.assertEquals(samefirstlast.isItTheSame(new int[] { 1, 2, 3 }), false);
		Assert.assertEquals(samefirstlast.isItTheSame(new int[] { 1, 2, 3, 1 }), true);
		Assert.assertEquals(samefirstlast.isItTheSame(new int[] { 1, 2, 1 }), true);
		Assert.assertEquals(samefirstlast.isItTheSame(null), false);

	}

}


