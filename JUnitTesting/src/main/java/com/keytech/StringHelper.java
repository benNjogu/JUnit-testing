package com.keytech;

public class StringHelper {

	//AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
	public String truncateAInFirstTwoPositions(String str) {
		if (str.length() <= 2)
			return str.replace("A", "");

		String first2Chars = str.substring(0, 2);
		String StringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") + StringMinusFirst2Chars;

	}

	//ABCD => false, ABAB => true, AB => true, A => false
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {
		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String firstTwoChars = str.substring(0, 2);
		String lastTwoChars = str.substring(str.length() - 2);
		return firstTwoChars.equals(lastTwoChars);

	}

}
