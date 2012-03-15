package com.ederig.seven;

import junit.framework.Assert;

import org.junit.Test;

import com.ederig.three.Primes;

public class SevenTest {

	private long orderOfPrimes;
	private Primes primes = new Primes();

	@Test
	public void givenTest() {
		givenADesiredPrime(6);
		whenITryToFindThisPrime();
		thenThePrimeIs(13l);
	}
	
	@Test
	public void problemTest() {
		givenADesiredPrime(10001);
		whenITryToFindThisPrime();
		thenThePrimeIs();
	}

	private void thenThePrimeIs() {
		System.out.println(primes.actualPrime());	
	}

	private void thenThePrimeIs(Long l) {
		Assert.assertEquals(primes.actualPrime(), l);
	}

	private void whenITryToFindThisPrime() {
		primes.findThePrimeByOrder(orderOfPrimes);

	}

	private void givenADesiredPrime(long i) {
		orderOfPrimes = i;

	}
}
