package com.keytech;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void Before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirstTwoPositions_AInFirstTwoPositions() {
		// AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirstTwoPositions("AACD"));

		// expected, actual-->this are the arguments above;
	}

	@Test
	public void testTruncateAInFirstTwoPositions2_AInTheFirstPositionOnly() {
		assertEquals("CD", helper.truncateAInFirstTwoPositions("ACD"));
	}

	@Test
	public void testTruncateAInNoPosition3_NoAinAnyPosition() {
		assertEquals("CDEF", helper.truncateAInFirstTwoPositions("CDEF"));
	}

	@Test
	public void testTruncateAInLastTwoPositions_AinLastTwoPositions() {
		assertEquals("CDAA", helper.truncateAInFirstTwoPositions("CDAA"));
	}
	
	//ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void areFirstAndLastTwoCharactersTheSame_basicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_basicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_WithTwoCharactersOnly() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_OneCharacterOnly() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	
	
	
	
	
	
	
	
	

}
