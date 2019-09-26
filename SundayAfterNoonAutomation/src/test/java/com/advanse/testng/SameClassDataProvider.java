package com.advanse.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {
	@DataProvider(name = "alamin")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { 
			"sarower@gmail.com" , "student1234" },
			{ "ahmmed@gmail.com" , "smarttech" } };
	}

	@Test(dataProvider = "alamin")
	public void testMethod(String email,String pass) {
		System.out.println("Data is: " + email);
		System.out.println("Data is: " + pass);
	}
}