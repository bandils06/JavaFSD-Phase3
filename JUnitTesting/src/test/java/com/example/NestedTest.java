package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class NestedTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All from OUTER");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All from OUTER");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each from OUTER");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each from OUTER");
	}

	@Test
	@DisplayName("Outer Test from OUTER")
	void testOuter() {
		System.out.println("Test Cases from OUTER");
	}
	
	@Nested
	class Inner{
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each from INNER");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each from INNER");
		}

		@Test
		@DisplayName("Inner Test")
		void testInner() {
			System.out.println("Test Cases from INNER");
		}
		@Nested
		class Whenx{
			
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each from WHENX");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each from WHENX");
			}

			@Test
			@DisplayName("Inner Test")
			void testWhenX() {
				System.out.println("Test Cases from WHENX");
			}
			
		}
		
	}

}