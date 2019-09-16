package com.usa.student.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {



	@Test
	@Parameters("browser") // browser =fire,chrom,safari
	public void getbrowser(String a) {

		System.out.println(a);

	}

}
