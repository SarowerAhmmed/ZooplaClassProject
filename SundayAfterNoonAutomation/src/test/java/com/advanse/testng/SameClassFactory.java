package com.advanse.testng;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		SoftAssert soft = new SoftAssert();//if else>>> soft assert
		soft.assertTrue(2==4);
		soft.assertAll();
		Assert.assertTrue(2==4);// Hard assert
		System.out.println("Data is: " + email);
		System.out.println("Data is: " + pass);
		System.out.println("---------------------------");
	}
	@Test
	public void testMethod2() {
		System.out.println("Data is: " + email);
		System.out.println("Data is: " + pass);
	}
}