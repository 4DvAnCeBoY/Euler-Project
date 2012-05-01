package com.ederig.nine;


public class Nine {
	
	//http://en.wikipedia.org/wiki/Pythagorean_triple
	//Euclid's formula
	public static int solve(int s) {
	       for(int m = 2; m < Integer.MAX_VALUE; m++) {
	           for(int n = 1; n < m; n ++) {
	               int a = m*m - n*n;
	               int b = 2*m*n;        
	               int c = m*m + n*n;
	               if(s % (a+b+c) == 0) {
	                   int k = s / (a+b+c);
	                   return k*a * k*b * k*c;
	               }
	           }
	       }        
	       return -1;
	    }

	    public static void main(String[] args) {
	        System.out.println(solve(1000));
	    }

}
