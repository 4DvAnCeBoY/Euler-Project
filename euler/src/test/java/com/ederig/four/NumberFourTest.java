package com.ederig.four;

import org.junit.Test;

public class NumberFourTest {

	private int biggest = -1;

	@Test
	public void whoIsTheBiggest() {

		for (int n1 = 999; n1 > 0; n1--) {
			for (int n2 = 999; n2 > 0; n2--) {
				int candidate = n1 * n2;
				if (PalindromicNumber.isPalindromic(candidate)) {
					if (candidate > biggest) {
						biggest = candidate;
					}

				}

			}
		}

		System.out.println(biggest);
	}
}
