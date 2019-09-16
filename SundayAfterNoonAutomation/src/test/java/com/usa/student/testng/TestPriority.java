package com.usa.student.testng;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority= 3)
	public void firstTest() {
		System.out.println("This is First Test");
	}
	@Test(priority= 1)
	public void secondTest() {
		System.out.println("This is Second Test");
	}
	@Test(priority= 0)
	public void thirdtest() {
		System.out.println("This is Third Test");
	}

}
