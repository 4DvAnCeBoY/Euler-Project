package com.ederig.three;

import java.util.ArrayList;
import java.util.List;

import com.ederig.exceptions.NotAPrimeException;

public class Primes {

	private Long actualMaxPrime = 2l;

	private List<Long> primes = new ArrayList<Long>();

	public void findNextPrime() {
		Long candidate = actualMaxPrime + 1;
		while (!isPrime(candidate)) {
			candidate = candidate + 1;
		}
		primes.add(actualMaxPrime);
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
		Long unusedPrime = primes.get(primes.size() - 1);
		primes.remove(primes.size() - 1);
		actualMaxPrime = unusedPrime;
	}

	public List<Long> getPrimes() {
		return primes;
	}

}
