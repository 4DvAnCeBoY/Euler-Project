package com.ederig.utils;

import org.apache.commons.lang.time.StopWatch;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
	
	private StopWatch timer = new StopWatch();
	
	@Before
	public void startTimer(){
		timer.start();
	}
	
	@After
	public void stopTimer(){
		timer.stop();
	}
	
	@After
	public void printTimeElapsed(){
		long seconds = timer.getTime()/1000;
		System.out.println("Time elapsed (s): " + seconds);
	}

}
