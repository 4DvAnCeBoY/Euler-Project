package com.ederig.seven;

public class Seven {
	
	private  int numberOfNumbers;
	
	private  long result;
	
	public Seven(int i) {
		numberOfNumbers=i;
	}

	public void solve() {
		result =  squareOfSum()-squareEachNumber();
	}

	private Long squareEachNumber() {
		long sum100SquareEachNaturalNumbers=0l;
		for (int i = 1; i <= numberOfNumbers; i++) {
			sum100SquareEachNaturalNumbers = sum100SquareEachNaturalNumbers + i*i;
		}
		return sum100SquareEachNaturalNumbers;
	}

	private Long squareOfSum() {

		long sumNaturalNumbers=0l;
		for (int i = 1; i <= numberOfNumbers; i++) {
			sumNaturalNumbers = sumNaturalNumbers + i;
		}
		 
		return sumNaturalNumbers*sumNaturalNumbers;
	}
	
	public Long getResult() {
		return result;
	}
}
