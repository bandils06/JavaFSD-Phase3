package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class RepetedTestCaseDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each ");
	}
	@DisplayName("Repeated Test")
	@RepeatedTest(value = 5, name="Testcase:{displayName}the currentCount is"
			+ " {currentRepetition} out of {totalRepetitions}")
	void test() {
		assertEquals(8, 6+2);
		System.out.println("Test Executed");
	}
	
	 

}