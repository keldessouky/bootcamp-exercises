package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	private WordCount wordcount;

	@Before
	public void setUp() {
		wordcount = new WordCount();
	}

	@Test
	public void testGetCount() {
		String[] testArray = new String[] { "a", "b", "a", "c" };
		Integer object = new Integer(2);
		Assert.assertEquals(object, wordcount.getCount(testArray).get("a"));

		String[] testArray2 = new String[] { "ba", "ba", "black", "sheep" };
		Integer object2 = new Integer(2);
		Assert.assertEquals(object2, wordcount.getCount(testArray2).get("ba"));

	}
}
