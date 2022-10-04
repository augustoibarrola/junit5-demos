package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

@Test
public void testMethod(){
    String string = "Ger";
    assertEquals("Geryon", string.concat("yon"));
}
}
