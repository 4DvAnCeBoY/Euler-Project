package com.ederig.six;

import junit.framework.Assert;

import org.junit.Test;

public class SixTest {

	private Six six;
	
	@Test
	public void givenTest() {
		givenAMaxNaturalNumber(10);
		whenITryToSolveTheProblem();
		thenTheDifferenceIs(2640l);
	}
	
	@Test
	public void solveTheProblem() {
		givenAMaxNaturalNumber(100);
		whenITryToSolveTheProblem();
		thenTheDifferenceIs(25164150);
	}

	private void thenTheDifferenceIs(long i) {
	 Assert.assertEquals(new Long(i), six.getResult());		
	}
	
	private void whenITryToSolveTheProblem() {
		six.solve();		
	}

	private void givenAMaxNaturalNumber(int i) {
		six = new Six(i);
		
	}
}
