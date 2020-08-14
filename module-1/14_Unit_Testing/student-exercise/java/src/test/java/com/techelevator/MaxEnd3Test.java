package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {

	private MaxEnd3 maxend3;

	@Before
	public void SetUp() {
		maxend3 = new MaxEnd3();
	}

	@Test
	public void testMakeArray() {
		Assert.assertArrayEquals(maxend3.makeArray(new int[] { 1, 2, 3 }), maxend3.makeArray(new int[] { 3, 3, 3 }));
		Assert.assertArrayEquals(maxend3.makeArray(new int[] { 11, 5, 9 }),maxend3.makeArray(new int[] { 11, 11, 11 }));
		Assert.assertArrayEquals(maxend3.makeArray(new int[] { 2, 11, 3 }), maxend3.makeArray(new int[] { 3, 3, 3 }));

		
	}

}
