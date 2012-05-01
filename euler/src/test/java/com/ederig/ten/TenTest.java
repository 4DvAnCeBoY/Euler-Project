package com.ederig.ten;

import org.junit.Test;

import com.ederig.three.Primes;
import com.ederig.utils.BaseTest;

public class TenTest extends BaseTest {

	private long bigLong;
	private Primes primes = new Primes();

	@Test
	public void sumAllPrimesTest() {
		givenANumber(2000000l);
		whenITryToFindTheListOfPrimes();
		theTheSumOfAllPrimesIs();
	}

	private void theTheSumOfAllPrimesIs() {
		System.out.println(primes.sumAllPrimes());;

	}

	private void whenITryToFindTheListOfPrimes() {
		primes.findAllPrime(bigLong);

	}

	private void givenANumber(long l) {
		bigLong = l;

	}

}
