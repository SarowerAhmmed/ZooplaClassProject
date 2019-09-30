package com.genericode;

import java.util.ArrayList;
import java.util.List;

public class ReturnMethod {
	
	
	static List<String> getsalary(){
		
		List<String> value = new ArrayList<>();
		value.add("URL");
		value.add("email");
		value.add("pass");
		return value;
	}

	
	public static void main(String[] args) {
		
		System.out.println(ReturnMethod.getsalary().get(2));
		
		
	}
}
