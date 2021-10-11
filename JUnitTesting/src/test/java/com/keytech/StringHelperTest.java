package com.keytech;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		//AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		StringHelper helper = new StringHelper();
		String actualValue = helper.truncateAInFirstTwoPositions("AACD");
		String expectedValue = "CD";
		
		assertEquals(expectedValue, actualValue);
		//expected, actual-->this are the arguments above;
	}

}
