//package com.ger.test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.logging.Logger;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInfo;
//
//import com.ger.calculator.Calculator;
//
//class TestFixtureDemo {
//    
//    static final Logger logger = Logger.getLogger(TestFixtureDemo.class.getName());
//    
//    int a, b, actual;
//    
//    Calculator calc = new Calculator();
//    
//
//    @BeforeAll
//    static void setUpBeforeClass(TestInfo test) throws Exception {
//        logger.info("Inside BeforeAll annotated method : " + test.getDisplayName());
//    }
//
//    @AfterAll
//    static void tearDownAfterClass(TestInfo test) throws Exception {
//        logger.info("Inside AfterAll annotated method : " + test.getDisplayName());
//
//    }
//
//    @BeforeEach
//    void setUp(TestInfo test) throws Exception {
//        a = 20; 
//        b = 30;
//        logger.info("Before Test: " + test.getDisplayName());
//        
//    }
//
//    @AfterEach
//    void tearDown(TestInfo test) throws Exception {
//        a = 0; 
//        b = 0;
//        logger.info("Before Test: " + test.getDisplayName());
//    }
//
//    @Test
//    void additionSuccessTest() {
//        actual = calc.add(a, b);
//        assertEquals(50, actual);
//    }
//    
//    @Test
//    void additionFailureTest() {
//        actual = calc.add(a, b);
//        assertEquals(40, actual);
//    }
//    
//    @Test
//    void multiplicationSuccessTest() {
//        actual = calc.multiply(a, b);
//        assertEquals(600, actual);
//    }
//    
//    @Test
//    void multiplicationFailureTest() {
//        actual = calc.multiply(a, b);
//        assertEquals(400, actual);
//    }
//
//}
//
///* OUTPUT: 
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo setUpBeforeClass
//INFO: Inside BeforeAll annotated method : TestFixtureDemo
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo setUp
//INFO: Before Test: additionFailureTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo tearDown
//INFO: Before Test: additionFailureTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo setUp
//INFO: Before Test: additionSuccessTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo tearDown
//INFO: Before Test: additionSuccessTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo setUp
//INFO: Before Test: multiplicationFailureTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo tearDown
//INFO: Before Test: multiplicationFailureTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo setUp
//INFO: Before Test: multiplicationSuccessTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo tearDown
//INFO: Before Test: multiplicationSuccessTest()
//Oct 03, 2022 11:53:07 AM com.ger.test.TestFixtureDemo tearDownAfterClass
//INFO: Inside AfterAll annotated method : TestFixtureDemo
//*/