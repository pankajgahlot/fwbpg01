package com.fwbpg01.testCondition001;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class test001 {
	
	
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Test001 Started");
	}
	
	@AfterTest
	public void AfterTest() {
		
				
		System.out.println("Test001 Executed");
	}
	@Test
	public void Test001A() {
		System.out.println("Test001A is running");
		
	}
	
	@Test
	public void Test001B() {
		System.out.println("Test001B is running");
		
	}

}
