package com.usa.student.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class LoginFunction {
	 WebDriver driver ;

  @BeforeTest
   public void setup() {
	  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize(); //
	  driver.get("https://www.google.com/");
  }
	@Test
	public void Test01() {
		//user name
		//pass
		//click button
		
		System.out.println(driver.getTitle());
		Assert.assertEquals("", "");
		

	}
@AfterTest
public void closesetup() {
	driver.quit();
}
}