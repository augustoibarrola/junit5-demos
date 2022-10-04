# Exception Testing

Writing test methods with input parameters such that they result in throwin exceptions is Exception Testing. 

`assertThrows()` asserts an exception type with their appropriate message. This can be used to assert both pre-defined and used-defined exceptions. It is used top assert the expected exception class and call service methods. 

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

}
```
```java
package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.ger.calculator.Calculator;

class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	void divisionValidTest() {
	    assertEquals(2, calc.divide(10, 5));
	}
	
	@Test
	void divisionInvalidTest() {
	    Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
	    assertEquals("/ by zero", exception.getMessage());
	}
}
```