package com.advanse.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SameClassFactory {
	
	String email;
	String pass;
	
	@Factory(dataProvider = "alamin")
    public SameClassFactory(String email,String pass) {
        this.email = email;
        this.pass = pass;

    }
 
	@DataProvider(name = "alamin")
    public static Object[][] dataMethod() {
        return new Object[][] { { "gmail", "student"} ,
        						{ "yahoo", "teache"} ,
        						{ "facebook", "social"}
        					};
    }
	
	@Test
	public void testMethod() {
		System.out.println("Data is: " + email);
		System.out.println("Data is: " + pass);
	}
}