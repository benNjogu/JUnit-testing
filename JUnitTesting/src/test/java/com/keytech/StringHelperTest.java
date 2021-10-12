package com.keytech;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

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

}
