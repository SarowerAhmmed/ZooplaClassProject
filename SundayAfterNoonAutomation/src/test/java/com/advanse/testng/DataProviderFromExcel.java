package com.advanse.testng;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DataProviderFromExcel {

	
	
	  String url;
	  String user;
	  String pass;

	@Factory(dataProvider = "Excel", dataProviderClass = DataProvideExcel.class)
	public  DataProviderFromExcel( String url,  String user,  String pass) {
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	@Test()
	public void testMethod() {
		
		System.out.println("Data is: " + url + ": == :" + user + ": == :" + pass);

	}
}
