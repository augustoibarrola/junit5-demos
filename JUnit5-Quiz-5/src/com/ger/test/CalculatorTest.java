package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
		
	@AfterAll
	public static void before() {
		System.out.println("completed");
		
	}
	
    @Test
    public void test1(){
        System.out.println("test1");
        assertEquals(1, 1);
    }

    @Test
    public void test2(){
        System.out.println("test2");
        assertEquals(2, 1);
    }
	
}

/*
 * CONSOLE OUTPUT:
 * 
 * 	test1
 * 	test2
 * 	completed
 * 
 */
