package com.ger.test.subtract;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ger.calculator.Calculator;

class CalculatorSubtractionTest {
	
	Calculator calc = new Calculator();

	@Test
	void subtracttionValidTest() {
		assertEquals(20, calc.subtract(40, 20));
	}

}
