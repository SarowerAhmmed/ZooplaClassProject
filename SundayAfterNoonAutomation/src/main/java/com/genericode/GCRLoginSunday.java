package com.genericode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GCRLoginSunday {
	WebDriver driver;
	MasterPageFactory pf;

	@BeforeTest
	public void setup() {
		//test01
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize(); // mazimize window

		// test 02 =Go to GCR shop

		driver.get("http://www.gcrit.com/build3/");

	}

	@Test
	public void test1() {
//test03
		pf = PageFactory.initElements(driver, MasterPageFactory.class);

		pf.getMyAccount().get(0).click();

	}

	@Test
	public void test2() {
		// put email test 04

		pf.getGcrEmail().get(0).sendKeys("sarowerny@gmail.com");

	}

	@Test
	public void test3() {
		// put password test 05

		pf.getGcrPassword().get(0).sendKeys("student");

	}

	@Test
	public void test4() {
		// click sign in button test06

		pf.getGcrSignin().get(0).click();

	}

	@Test
	public void test5() {
		// login will be successful test 07

		Assert.assertTrue(pf.getGcrLogout().get(0).isDisplayed());

		System.out.println("Test done");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}