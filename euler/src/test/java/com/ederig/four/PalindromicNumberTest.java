package com.ederig.four;

import junit.framework.Assert;

import org.junit.Test;

import com.ederig.four.PalindromicNumber;

public class PalindromicNumberTest {

	private int palindromicCandidate;
	private boolean isPalindromic;

	@Test
	public void isPalindromicTest() {
		givenPalindromicCandidate(1331);
		whenICheckIfIsPalindromic();
		thenTheNumberIsPalindromic();

		givenPalindromicCandidate(1313);
		whenICheckIfIsPalindromic();
		thenTheNumberIsnotPalindromic();
	}

	private void thenTheNumberIsPalindromic() {
		Assert.assertTrue(isPalindromic);
	}

	private void thenTheNumberIsnotPalindromic() {
		Assert.assertFalse(isPalindromic);
	}

	private void whenICheckIfIsPalindromic() {
		isPalindromic = PalindromicNumber.isPalindromic(palindromicCandidate);
	}

	private void givenPalindromicCandidate(int l) {
		palindromicCandidate = l;
	}

}
