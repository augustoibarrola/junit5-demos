package com.ger;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ger.calculator.Calculator;

public class Client {
	
	private static final Logger logger = Logger.getLogger(Client.class.toString());
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int sum = calc.add(10, 10);
		
		logger.log(Level.INFO, "SUM: {0}", sum);
	}

}
 