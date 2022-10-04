package com.ger.calculator;

public class Calculator {
	
	public int add(int x, int y) {
		return y + x;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		
		return x * y;
	}
	
	public int divide(int x, int y) {
		
		return x / y;
	}
	
	public void delay(long time) throws InterruptedException {
	    Thread.sleep(time * 1000);
	}

}
