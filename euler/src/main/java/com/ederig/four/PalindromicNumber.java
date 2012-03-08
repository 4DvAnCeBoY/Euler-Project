package com.ederig.four;

public class PalindromicNumber {

	public static Boolean isPalindromic() {

		return Boolean.FALSE;
	}

	public static boolean isPalindromic(int palindromicCandidate) {
		String regular = palindromicCandidate + "";
		String reverse = new StringBuffer(regular).reverse().toString();
		return regular.equals(reverse);
	}

}
