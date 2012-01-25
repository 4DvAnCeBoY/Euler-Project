package com.ederig.three;

import junit.framework.Assert;

import org.junit.Test;

import com.ederig.three.Number;

public class NumberTest {

	private Number number;
	
	@Test
	public void firstExample() {
		givenANumber(13195l);
		whenICalcThePrimeFactors();
		thenTheMaxPrimeFactorIs(13195l);
	}

	private void thenTheMaxPrimeFactorIs(Long expected) {
		Assert.assertEquals(expected, number.getLargestPrimeFactor());
	}

	private void whenICalcThePrimeFactors() {
		number.findMaxPrimeFactor();
		
	}

	private void givenANumber(Long i) {
		number = new Number(i);		
	};

}
