package com.ederig.three;

import junit.framework.Assert;

import org.junit.Test;

import com.ederig.exceptions.NotAPrimeException;

public class PrimesTest {

	private Primes primes;

	@Test
	public void findSecondPrime() {
		givenTheFirstPrime();
		whenISearchForTheNextPrime();
		thenTheNextPrimeIs(3l);
	}
	
	@Test
	public void findThirdPrime() {
		givenTheFirstPrime();
		whenISearchForTheNextPrime();
		whenISearchForTheNextPrime();
		thenTheNextPrimeIs(5l);
	}
	
	@Test
	public void find29Prime() throws NotAPrimeException{
		givenTheFirstPrime();
		whenISearchForASpecificPrime(29l);
		thenTheNextPrimeIs(29l);		
	}
	
	@Test (expected=NotAPrimeException.class) 
	public void Number30isNotAPrime() throws NotAPrimeException {
		givenTheFirstPrime();
		whenISearchForASpecificPrime(30l);
		//throw NotAPrimeException
	}
	
	@Test
	public void Number32maxPrime(){
		givenTheFirstPrime();
		whenISearchForAllPrime(32l);
		thenTheNextPrimeIs(31l);
	}

	private void whenISearchForAllPrime(long number) {
		primes.findAllPrime(number);
	}

	private void whenISearchForASpecificPrime(Long desiredPrime) throws NotAPrimeException {
		primes.findSpecificPrime(desiredPrime);
	}

	private void thenTheNextPrimeIs(Long number) {
		Assert.assertEquals(number, primes.actualPrime());
	}

	private void whenISearchForTheNextPrime() {
		primes.findNextPrime();
	}

	private void givenTheFirstPrime() {
		primes = new Primes();
	}
}
