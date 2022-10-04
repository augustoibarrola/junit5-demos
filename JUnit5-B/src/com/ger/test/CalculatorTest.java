package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private final String first = "abc";
	private final String second = "abc";
	private final String third = new String("abc");
	private final String fourth = new String("abc");

	@Test
	public void stringAssertEqualv1(){
	    assertEquals(first, second);
	}
	
	@Test
	public void stringAssertEqualv2(){
	    assertEquals(third, fourth);
	}
	
	@Test
	public void stringAssertSamev1(){
	    assertSame(first, second);
	}
	
	@Test
	public void stringAssertSamev2(){
	    assertSame(third, fourth);
	}
	
}

/*
 * Three of the four above tests will pass; one 
 * will fail.  
 */
