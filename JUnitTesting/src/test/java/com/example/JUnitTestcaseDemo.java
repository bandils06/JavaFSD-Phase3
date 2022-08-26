package com.example;

import org.junit.jupiter.api.*;

class JUnitTestcaseDemo {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}
	@Test
	public void testOne() {
		System.out.println("JUNIT Test-1");
	}
	@Test
	public void testtwo() {
		System.out.println("JUNIT Test-2");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
	
}
