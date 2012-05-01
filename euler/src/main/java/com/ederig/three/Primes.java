package com.ederig.three;

import java.util.ArrayList;
import java.util.List;

import com.ederig.exceptions.NotAPrimeException;

public class Primes {

	private Long actualMaxPrime = 2l;

	private List<Long> primesBelowMaxPrime = new ArrayList<Long>();
	
	public void findThePrimeByOrder(long orderOfPrime){
		for (int i = 1; i < orderOfPrime; i++) {
			findNextPrime();		
		}
	}

	public void findNextPrime() {
		Long candidate = actualMaxPrime + 1;
		while (!isPrime(candidate)) {
			candidate = candidate + 1;
		}
		primesBelowMaxPrime.add(actualMaxPrime);
		actualMaxPrime = candidate;
	}

	public static Boolean isPrime(Long n) {
		boolean prime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2){
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if ((n % 2 != 0 && prime && n > 2) || n == 2) {
			return true;
		} else {
			return false;
		}
	}

	public Long actualPrime() {
		return actualMaxPrime;
	}

	public void findSpecificPrime(Long desiredPrime) throws NotAPrimeException {
		while (desiredPrime != actualMaxPrime) {
			findNextPrime();
			if (actualMaxPrime > desiredPrime) {
				throw new NotAPrimeException();
			}
		}
	}

	public void findAllPrime(Long desiredPrime) {
		while (desiredPrime != actualMaxPrime) {
			findNextPrime();
			if (actualMaxPrime > desiredPrime) {
				removeLastPrime();
				break;
			}
		}
	}

	private void removeLastPrime() {
		Long unusedPrime = primesBelowMaxPrime.get(primesBelowMaxPrime.size() - 1);
		primesBelowMaxPrime.remove(primesBelowMaxPrime.size() - 1);
		actualMaxPrime = unusedPrime;
	}

	public List<Long> getPrimes() {
		return primesBelowMaxPrime;
	}

	public long sumAllPrimes() {
		long sum = 0;
		for (Long prime : primesBelowMaxPrime) {
			sum = sum + prime;
		}
		sum = sum + actualMaxPrime;
		return sum;
	}

}
