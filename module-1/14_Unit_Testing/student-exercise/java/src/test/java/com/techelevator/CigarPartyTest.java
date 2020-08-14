package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

	private CigarParty party;

	@Before
	public void setUp() {
		party = new CigarParty();
	}

	@Test
	public void testHaveParty() {
		Assert.assertEquals(party.haveParty(30, false), false);
		Assert.assertEquals(party.haveParty(50, false), true);
		Assert.assertEquals(party.haveParty(60, false), true);
		Assert.assertEquals(party.haveParty(70, true), true);
		Assert.assertEquals(party.haveParty(70, false), false);

	}

}


