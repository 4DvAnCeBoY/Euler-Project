package com.ederig.three;

import junit.framework.Assert;

import org.junit.Test;

import com.ederig.utils.BaseTest;

public class LargestPrimeFactorTest  extends BaseTest {

	private LargestPrimeFactor largestPrimeFactor;

	@Test
	 public void maxPrimeFactorOf13195(){
		 givenANumber(13195l);
		 whenISearchTheMaxPrimeFactor();
		 thenTheMaxPrimeFactorIs(29l);
	 }
	
	@Test
	 public void maxPrimeFactorOf600851475143(){
		 givenANumber(600851475143l);
		 whenISearchTheMaxPrimeFactor();
		 thenTheMaxPrimeFactorIs(6857l);
	 }

	private void thenTheMaxPrimeFactorIs(Long l) {
		Assert.assertEquals(l, largestPrimeFactor.maxPrimeFactor());
	}
	private void thenTheMaxPrimeFactorIs() {
		System.out.println(largestPrimeFactor.maxPrimeFactor());
	}

	private void whenISearchTheMaxPrimeFactor() {
		largestPrimeFactor.searchMaxPrimeFactor();
	}

	private void givenANumber(Long number) {
		largestPrimeFactor = new LargestPrimeFactor(number);
	}
}
