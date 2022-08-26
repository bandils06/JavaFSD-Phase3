package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {
	
	
	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println(" This run on Windows OS");
		
	}

	@Test
	@DisabledOnOs({OS.MAC})
	public void notRunOnMac() {
		System.out.println(" Not Run on MAC OS");
		
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac() {
		System.out.println(" This run on MAC OS");
		
	}
	
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println(" This run on LINUX OS");
		
	}
	
	@Test
	@DisabledOnOs({OS.LINUX})
	public void notOnLinux() {
		System.out.println(" Not Run on LINUX OS");
		
	}
	 
}