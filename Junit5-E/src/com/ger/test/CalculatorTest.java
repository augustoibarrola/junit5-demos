package com.ger.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface CalculatorTest {
	
	public static final Logger logger = Logger.getLogger(CalculatorTestImpl.class.getName());

	@BeforeAll
	default void beforeAllTests(TestInfo testInfo) {
		logger.info("Inside BeforeAllTests Test Method: " + testInfo.getDisplayName());
	}
	
	@BeforeEach
	default void beforeEachTest(TestInfo testInfo) {
		logger.info("Inside BeforeEachTest Test Method: " + testInfo.getDisplayName());
	}
	
	@AfterEach
	default void afterEachTest(TestInfo testInfo) {
		logger.info("Inside AfterEachTest Test Method: " + testInfo.getDisplayName());
	}
	
	@AfterAll
	default void afterAllTests(TestInfo testInfo) {
		logger.info("Inside AfterAllTests Test Method: " + testInfo.getDisplayName());
	}
	
}

