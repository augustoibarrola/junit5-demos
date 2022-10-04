# Timeout Testing

Writing test methods with input parameters such that they result in the failure of test methods due to timeout. 

JUnit5 provides three ways to implement Timeout Testing: 

| # | Implementation | Description |
| --- | --- | --- |
| 1 | `@Timeout` | Declares that a `@Test`/`@TestFactory`/Test Template/Life Cycle method will fail if the implemented timeout is exceeded. The value is in seconds. If applied at the class level, `@Timeout` will apply to all the test methods within the annotated test class. |
| 2 | `assertTimeout()` | Used within the method body of a given `@Test` method. It takes a method to be tested as an `Executable` object and time needs to be provided using `Duration` and `ChronoUnit` libraries. Execution will **not** be aborted if timeout is exceeded.|
| 3 | `assertTimeoutPreemptively()` | used within the method body of a given `@Test` method. It takes a method to be tested as an `Executable` object and time needs to be provided using `Duration` and `ChronoUnit` libraries. Execution **will** be aborted if timeout is exceeded.|

## Example

```java
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
```
```java
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
```
```java
package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;

import com.ger.calculator.Calculator;

class CalculatorTest {
	
	Calculator calc = new Calculator();

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

```

