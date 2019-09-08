package com.genericode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	static WebDriver driver;

	public static void main(String[] args) {

		// Test 01= User need to open a browser

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize(); // mazimize window

		// test 02 =Go to GCR shop

		driver.get("http://www.gcrit.com/build3/");

		// Click my account
		//MasterPageFactory obj = new MasterPageFactory();
		
		MasterPageFactory pf = PageFactory.initElements(driver, MasterPageFactory.class);
		

		pf.getMyAccount().get(0).click();

		// put email

		pf.getGcrEmail().get(0).sendKeys("sarowerny@gmail.com");

		// put password

		pf.getGcrPassword().get(0).sendKeys("student");

		// click sign in button

		pf.getGcrSignin().get(0).click();

		// login will be successful

		Assert.assertTrue(pf.getGcrLogout().get(0).isDisplayed());

		System.out.println("Test done");

		driver.quit();

	}

}
