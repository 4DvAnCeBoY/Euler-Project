package com.ederig.eight;

import java.util.ArrayList;
import java.util.List;

public class GreatestProductOfNDigits {

	private int numberOfDigits;
	private long candidate = -1;
	private List<Integer> fiveNumbersList = new ArrayList<Integer>(5);
	private String number;

	// 1 2 3 4 5

	public GreatestProductOfNDigits(int pnumberOfDigits,String pnumber) {
		this.numberOfDigits = pnumberOfDigits;
		this.number = pnumber;
		setupList();
	}

	public void findGreatestProduct() {
		for (int i = 5; i < number.length(); i++) {
			System.out.println("it: "+i);
			addToList(new Integer((number.charAt(i)+"")));
			checkProduct();
		}
	}

	private void checkProduct() {
		long itCandidate = 1;
		for (Integer number : fiveNumbersList) {
			itCandidate = itCandidate*number;
		}
		if (itCandidate > candidate) {
			System.out.println(itCandidate);
			candidate = itCandidate;
		}
	}

	private void setupList() {
		for (int i = 0; i < numberOfDigits; i++) {
			String element = number.charAt(i)+"";
			fiveNumbersList.add(new Integer(element));
		}
	}

	private void addToList(Integer newNumber) {
		if (fiveNumbersList.size()>0) {
			fiveNumbersList.remove(0);
			fiveNumbersList.add(newNumber);
		}

	}

	public List<Integer> getLista() {
		return fiveNumbersList;
	}

	public void greatestProductIs() {
		System.out.println(candidate);
	}
}
