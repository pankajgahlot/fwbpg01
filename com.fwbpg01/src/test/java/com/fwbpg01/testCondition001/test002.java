package com.fwbpg01.testCondition001;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test002 {
	
	@Test
	public void Test002A() {
		System.out.println("Test002A is running");
	}
	
	@Test
	public void Test002B() {
		System.out.println("Test002B is running");
		
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Test002 Started");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Test002 Executed");
	}

}
