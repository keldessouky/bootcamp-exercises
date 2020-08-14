package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
	private StringBits stringbits;

	@Before
	public void setUp() {
		stringbits = new StringBits();
	}

	@Test
	public void testGetBits() {
		Assert.assertEquals(stringbits.getBits("Hello"), "Hlo");
		Assert.assertEquals(stringbits.getBits("Hi"), "H");
		Assert.assertEquals(stringbits.getBits("Heeololeo"), "Hello");

	}
}
