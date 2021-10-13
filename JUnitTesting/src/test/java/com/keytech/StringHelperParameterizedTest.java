package com.keytech;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutPuts[][] = { { "AACD", "CD" }, { "ACD", "CD" },
										{"CDEF", "CDEF"}, {"CDAA", "CDAA"}};
		return Arrays.asList(expectedOutPuts);
	}

	@Test
	public void testTruncateAInFirstTwoPositions_AInFirstTwoPositions() {
		// AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		assertEquals(expectedOutput, helper.truncateAInFirstTwoPositions(input));

		// expected, actual-->this are the arguments above;
	}

	@Test
	public void testTruncateAInFirstTwoPositions2_AInTheFirstPositionOnly() {
		assertEquals(expectedOutput, helper.truncateAInFirstTwoPositions(input));
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
