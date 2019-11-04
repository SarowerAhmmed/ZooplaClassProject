package com.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.emory.mathcs.backport.java.util.Collections;

public class StringHandler {

	public static void main(String[] args) {

		/*
		 * String price = "$#400,00 offer";
		 * 
		 * int a = Integer.parseInt(price.replaceAll("\\D", ""));
		 * //System.out.println(a+100);
		 */
		
		List<Integer> list= new ArrayList<>();//upcasting poly
		list.add(20);
		list.add(10);
		list.add(30);
		
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
	}

}
