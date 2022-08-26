package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTestcases {
	Calculator calc;
	
	@BeforeEach
	void initialization() {
		calc = new Calculator();
	}
	@AfterEach
	void nullifyingObject() {
		calc = null;
	}

	@Test
	void testAdd() {
		assertEquals(2, calc.add(1, 1));
	}
	@Test
	void testSub() {
		assertEquals(0, calc.sub(1, 1));
	}
	@Test
	void testMul() {
		assertEquals(4, calc.mul(2, 2));
	}
	@Test
	void testDiv() {
		assertEquals(10, calc.div(100, 10));
	}

}
