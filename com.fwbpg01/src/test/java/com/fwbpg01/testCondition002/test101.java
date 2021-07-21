package com.fwbpg01.testCondition002;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test101 {

	
	@Test
	public void Test101A() {
		System.out.println("Test101A is running");
		
	}
	
	@Test
	public void Test101B() {
		System.out.println("Test101B is running");
		
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Test101 Started");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Test101 Executed");
	}
}
