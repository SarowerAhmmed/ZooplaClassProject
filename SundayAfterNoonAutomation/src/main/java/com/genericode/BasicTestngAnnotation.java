package com.genericode;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestngAnnotation {
	@AfterSuite
	public void aftersuite() {
		System.out.println("this is after suite");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("this is before suite");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("this is after class");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("this is before class");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("this is after method");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("this is before method");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("this is after test");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test");
	}
	@Test
	public void getsalary() {
		System.out.println("This is test");
	}
	

	
}
