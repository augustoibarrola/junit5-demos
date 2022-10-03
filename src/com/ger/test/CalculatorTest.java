package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.ger.client.Calculator;

class CalculatorTest {
	
	Calculator calc = new Calculator();

	@Test
	void additionTest() {
		assertEquals(20, calc.addition(10, 10));
	}

	@Test
	void assertNullTest() {
		String testString = null;
		assertNull(testString);
	}
	
	@Test
	void assertNotNullTest() {
		String testString = "Spring Boot";
		assertNotNull(testString);
	}
	
	@Test
	void assertFalseTest() {
		int expected = Arrays.asList("x", "y", "z").size();
		
		int result = Arrays.asList("a", "b", "c", "d").size();
		
		assertFalse(expected > result);
	}
	
	@Disabled("disabled for learning purposes")
	@Test
	void assumeTrueTest() {
		int x = 100, y = 0;
		
		assumeTrue(y > 0);
		assertEquals(5, calc.addition(x, y));
	}
	
	@Test
	void assumeFalseTest() {
		int x = 100, y = 10;
		assumeFalse(y > 0);
		assertEquals(10, calc.addition(x, y));
	}
	
	@Test
	void assumeTrueOSTest() {
		assumeTrue(System.getProperty("os.name").startsWith("Mac"));
		assertEquals(5, calc.division(100, 20));
	}
	
	@Test
	void assumingThatTest() {
		int x = 100, y = 10;
		
		assumingThat(y > 0, () -> {
			assertEquals(10, calc.addition(x, y));
			assertNotEquals(100, calc.addition(x, y));
			assertEquals(100, calc.addition(x, y));
		});
	}
	

}
