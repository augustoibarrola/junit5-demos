package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void assumeFalsev1() {
		
		int x = 100;
		int y = 100;
		
		assumeFalse(y > 0);
		assertSame(x, y);
		
	}
	
	@Test
	public void assumeFalsev2() {
		
		int x = 100;
		int y = 100;
		
		assumeFalse(y < 0);
		assertSame(x, y);
		
	}
	
	@Test
	public void assumeFalsev3() {
		
		int x = 100;
		int y = 100;
		
		assumeFalse(y > 0);
		assertNotSame(x, y);
		
	}
	
	@Test
	public void assumeFalsev4() {
		
		int x = 100;
		int y = 100;
		
		assumeFalse(y < 0);
		assertNotSame(x, y);
		
	}
	
	@Test
	public void assumeTruev1() {
		String a = "ger";
		String b = "Geryon";
		
		assumeTrue(a != null);
		assertNotSame(a, b);
	}
	
	@Test
	public void assumeTruev2() {
		String a = "ger";
		String b = "Geryon";
		
		assumeTrue(a == null);
		assertNotSame(a, b);
	}
	
	@Test
	public void assumeTruev3() {
		String a = "ger";
		String b = "Geryon";
		
		assumeTrue(a != null);
		assertSame(a, b);
	}
	
	@Test
	public void assumeTruev4() {
		String a = "ger";
		String b = "Geryon";
		
		assumeTrue(a == null);
		assertSame(a, b);
	}
	
}

