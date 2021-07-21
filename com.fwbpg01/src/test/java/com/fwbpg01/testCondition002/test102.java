package com.fwbpg01.testCondition002;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test102 {
	
	
	@Test
	public void Test102A() {
		System.out.println("Test102A is running");
	}
	
	@Test
	public void Test102B() {
		System.out.println("Test102B is running");
		
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Test102 Started");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Test102 Executed");
	}

}
