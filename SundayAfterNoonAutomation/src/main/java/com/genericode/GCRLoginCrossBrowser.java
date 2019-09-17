package com.genericode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.Configuration;

public class GCRLoginCrossBrowser {
	WebDriver driver;
	MasterPageFactory pf;

	@BeforeTest
	public void setup(ITestContext context) throws InterruptedException {
		String browserselected = context.getCurrentXmlTest().getParameter("browser");
		System.out.println("Browser started ::" + browserselected);
		// test01

		if (browserselected.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();// upcasting
			driver.manage().window().maximize(); // mazimize window

			
		} else if (browserselected.contains("ie")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting", true);
			caps.setCapability("nativeEvents", false);
			driver = new InternetExplorerDriver(caps);// upcasting
		}

		
	}

	@Test
	@Parameters("browser")
	public void test1(String whichBrowser) throws InterruptedException {

		driver.get("http://www.gcrit.com/build3/");
		Thread.sleep(5000);
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
		System.out.println("Test Finished for Client ::" + client);
		driver.quit();
	}

}