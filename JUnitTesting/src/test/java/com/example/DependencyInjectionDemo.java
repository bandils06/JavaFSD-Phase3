package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class DependencyInjectionDemo {
	
	public DependencyInjectionDemo(TestInfo info) {
		System.out.println(info.getDisplayName());
		System.out.println("DependencyInjectionDemo");
	}
	
	@Test
	@DisplayName("My Method")
	public void myTest(TestInfo info) {
		
		assertEquals("My Method", info.getDisplayName());
		System.out.println("myTest");
	}

	@Test
	@DisplayName("My Method")
	@Tag("mytag")
	public void myTest1(TestInfo info) {
		
		assertEquals("My Method", info.getDisplayName());
		assertTrue(info.getTags().contains("mytag"));
		System.out.println("myTest1");
	}

}