package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assumptions.assumeFalse;
//import static org.junit.jupiter.api.Assumptions.assumeTrue;
//import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

//import java.util.Arrays;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;

import com.ger.calculator.Calculator;

class CalculatorTest {
	
	Calculator calc = new Calculator();

//	@Test
//	void additionTest() {
//		assertEquals(20, calc.add(10, 10));
//	}
//
//	@Test
//	void assertNullTest() {
//		String testString = null;
//		assertNull(testString);
//	}
//	
//	@Test
//	void assertNotNullTest() {
//		String testString = "Spring Boot";
//		assertNotNull(testString);
//	}
//	
//	@Test
//	void assertFalseTest() {
//		int expected = Arrays.asList("x", "y", "z").size();
//		
//		int result = Arrays.asList("a", "b", "c", "d").size();
//		
//		assertFalse(expected > result);
//	}
//	
//	@Disabled("disabled for learning purposes")
//	@Test
//	void assumeTrueTest() {
//		int x = 100, y = 0;
//		
//		assumeTrue(y > 0);
//		assertEquals(5, calc.add(x, y));
//	}
//	
//	@Test
//	void assumeFalseTest() {
//		int x = 100, y = 10;
//		assumeFalse(y > 0);
//		assertEquals(10, calc.add(x, y));
//	}
//	
//	@Test
//	void assumeTrueOSTest() {
//		assumeTrue(System.getProperty("os.name").startsWith("Mac"));
//		assertEquals(5, calc.divide(100, 20));
//	}
//	
//	@Test
//	void assumingThatTest() {
//		int x = 100, y = 10;
//		
//		assumingThat(y > 0, () -> {
//			assertEquals(10, calc.add(x, y));
//			assertNotEquals(100, calc.add(x, y));
//			assertEquals(100, calc.add(x, y));
//		});
//	}
	/*
	 * Exception Testing
	 */
//	@Test
//	void divisionValidTest() {
//	    assertEquals(2, calc.divide(10, 5));
//	}
//	
//	@Test
//	void divisionInvalidTest() {
//	    Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
//	    assertEquals("/ by zero", exception.getMessage());
//	}
    /*
     * Timeout Testing w/ @Timeout annotation
     */
	
    @Timeout(3) // Timeout after 3 seconds
    @Test
    void timeoutDelayValidTest() throws InterruptedException {
        calc.delay(2); // Delay for 2 seconds
    }
    
    @Timeout(value = 3, unit = TimeUnit.NANOSECONDS) // Timeout after 3 nanoseconds
    @Test
    void timeoutDelayInvalidTest() throws InterruptedException {
        calc.delay(2); // Delay for 2 seconds
    }
    
    /*
     * Timeout Testing w/ assertTimeout() method
     */
    
    @Test
    void assertDelayValidTest() throws InterruptedException {
        Executable executable = () -> calc.delay(2); // Delay for 2 seconds
        assertTimeout(Duration.of(3,  ChronoUnit.SECONDS), executable); // Timeout after 3 seconds
    }
    
    @Test
    void assertDelayInvalidTest() throws InterruptedException {
        Executable executable = () -> calc.delay(2); // Delay for 2 seconds
        assertTimeout(Duration.ofNanos(3), executable); // Timeout after 3 seconds
    }
    
    /*
     * Timeout Testing w/ assertTimeoutPreemptively() method
     */
    
    @Test
    void assertPreemptivelyDelayValidTest() throws InterruptedException {
        Executable executable = () -> calc.delay(2); // Delay for 2 seconds
        assertTimeoutPreemptively(Duration.ofSeconds(3), executable); // Timeout after 3 seconds
    }
    
    @Test
    void assertPreemptivelyDelayInvalidTest() throws InterruptedException {
        Executable executable = () -> calc.delay(2); // Delay for 2 seconds
        assertTimeoutPreemptively(Duration.of(3, ChronoUnit.NANOS), executable); // Timeout after 3 seconds
    }
    
}
