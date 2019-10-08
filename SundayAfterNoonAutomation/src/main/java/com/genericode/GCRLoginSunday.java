package com.genericode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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

import com.db.util.connect.DatabaseList;
import com.excelFactory.ExcelColumn;

public class GCRLoginSunday  {
	WebDriver driver;
	MasterPageFactory pf;
	String path = "./TestData/ConfigData.xlsx";
	String query = "select * from employees";

	@Test
	public void setup(ITestContext context) throws Throwable {
		String client = context.getCurrentXmlTest().getParameter("clientNumber");
		System.out.println("Test started for Client ::" + client);
		// test01
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize(); // mazimize window
		

		//driver.get(getConfigProperty("URL"));
		driver.get("");
		// DatabaseList.getDataTableColumn(query, "first_name");
	}

	@Test
	public void test1() throws Throwable {

		 pf = PageFactory.initElements(driver, MasterPageFactory.class);

		pf.getMyAccount().get(0).click();

		// put email

		// pf.getGcrEmail().get(0).sendKeys("sarowerny@gmail.com");
		// pf.getGcrEmail().get(0).sendKeys(BaseConfig.getConfigProperty("UserName"));
		pf.getGcrEmail().get(0).sendKeys(ExcelColumn.columnValue(path, 1).get(1));
		// DatabaseList.getDataTableColumn(query, "last_name");
		// put password

		// pf.getGcrPassword().get(0).sendKeys(BaseConfig.getConfigProperty("pass"));
		pf.getGcrPassword().get(0).sendKeys(ExcelColumn.columnValue(path, 1).get(2));
		// DatabaseList.getDataTableColumn(query, "email");
		// click sign in button

		pf.getGcrSignin().get(0).click();

		// login will be successful

		Assert.assertTrue(pf.getGcrLogout().get(0).isDisplayed());

	}

	@AfterTest
	public void teardown(ITestContext context) {
		String client = context.getCurrentXmlTest().getParameter("clientNumber");
		System.out.println("Test Finished for Client ::" + client);
		driver.quit();
	}

}