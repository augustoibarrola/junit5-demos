package com.ger.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ger.calculator.Calculator;

public class CalculatorTestImpl implements CalculatorTest {

	private Calculator calc = new Calculator();
	
	@Test
	void additionValidTest() {
		assertEquals(2, calc.add(1, 1));
	}
	
	@Test
	void multiplicationValidTest() {
		assertEquals(1, calc.multiply(1, 1));
	}
}
