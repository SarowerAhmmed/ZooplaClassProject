package com.advanse.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {
	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { "sarower@gmail.com" , "student1234" },
			{ "ahmmed@gmail.com" , "smarttech" } };
	}

	@Test(dataProvider = "data-provider")
	public void testMethod(String email,String pass) {
		System.out.println("Data is: " + email);
		System.out.println("Data is: " + pass);
	}
}