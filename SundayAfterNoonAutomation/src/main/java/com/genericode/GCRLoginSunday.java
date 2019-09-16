package com.genericode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GCRLoginSunday {
	WebDriver driver;
	MasterPageFactory pf;

	@BeforeTest
	public void setup(ITestContext context) {
		String client = context.getCurrentXmlTest().getParameter("clientNumber");
		System.out.println("Test started for Client ::"+client);
		// test01
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize(); // mazimize window

		driver.get("http://www.gcrit.com/build3/");

	}

	@Test
	public void test1() throws InterruptedException {
		
		
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

		
	}
	@BeforeSuite
	public void BeforeAll() throws InterruptedException {
		
		
	}
	@AfterSuite
	public void AfterAll() throws InterruptedException {
		
		
	}

	@AfterTest
	public void teardown(ITestContext context) {
		String client = context.getCurrentXmlTest().getParameter("clientNumber");
		System.out.println("Test Finished for Client ::"+client);
		driver.quit();
	}

}