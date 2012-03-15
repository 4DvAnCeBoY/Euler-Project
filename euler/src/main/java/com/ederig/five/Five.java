package com.ederig.five;

public class Five {

	public static Long solve() {

		long candidate = 20;
		boolean allDivisible = false;
		boolean divisible = false;

		while (allDivisible == false) {
			candidate = candidate+1;
			allDivisible = isAllDivisible(candidate, divisible);
		}
		return candidate;
	}

	private static boolean isAllDivisible(long candidate, boolean divisible) {
		for (int i = 1; i <= 20; i++) {
			if (candidate % i == 0) {
				divisible = true;
			} else {
				divisible = false;
				break;
			}
		}
		return divisible;
	}

	public static void main(String[] args) {
		System.out.println(Five.solve());
	}

}
