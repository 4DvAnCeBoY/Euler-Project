package com.ederig.three;

public class LargestPrimeFactor {

	private Primes primes = new Primes();
	private Long number;
	private Long maxFactor;

	public LargestPrimeFactor(Long number) {
		this.number = number;
	}

	public void searchMaxPrimeFactor() {
		searchFactor();
	}

	private void searchFactor() {
		if (numberIsPrimeItIsTheFactor()) {
			maxFactor = number;
		} else {
			factorMe();
		}
	}

	private Boolean numberIsPrimeItIsTheFactor() {
		return Primes.isPrime(number);
	}

	private void factorMe() {
		Long tempNumber = number;
		while (primes.actualPrime() <= tempNumber) {
			if (canFactorByActualPrime(tempNumber)) {
				tempNumber = factor(tempNumber);
			}
			else {
				primes.findNextPrime();
			}

		}

	}

	private Long factor(Long tempNumber) {
		maxFactor = primes.actualPrime();
		tempNumber = tempNumber / primes.actualPrime();
		return tempNumber;
	}

	private boolean canFactorByActualPrime(Long tempNumber) {
		return tempNumber % primes.actualPrime() == 0;
	}

	public Long maxPrimeFactor() {
		return maxFactor;
	}
}
