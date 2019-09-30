
package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.excelFactory.ExcelColumn;
import com.genericode.MasterPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GCRStepDef {
	WebDriver driver;
	MasterPageFactory pf;
	String path = "./TestData/ConfigData.xlsx";
	String query = "select * from employees";


	
	@Given("^User need to open a browser$")
	public void user_need_to_open_a_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize(); // mazimize window

	}

	@Given("^Pass the URL$")
	public void pass_the_URL() throws Throwable {
		// driver.get("dfsffsf"); //driver.get(getConfigProperty("URL"));
		driver.get(ExcelColumn.columnValue(path, 1).get(0)); //
		//DatabaseList.getDataTableColumn(query, "first_name");
	}

	@When("^Click my account$")
	public void click_my_account() throws Throwable {
		pf = PageFactory.initElements(driver, MasterPageFactory.class);

		pf.getMyAccount().get(0).click();

	}

	@When("^put email$")
	public void put_email() throws Throwable {
		pf.getGcrEmail().get(0).sendKeys(ExcelColumn.columnValue(path, 1).get(1));
	}

	@When("^put password$")
	public void put_password() throws Throwable {
		pf.getGcrPassword().get(0).sendKeys(ExcelColumn.columnValue(path, 1).get(2));

	}

	@When("^click sign in button$")
	public void click_sign_in_button() throws Throwable {
		pf.getGcrSignin().get(0).click();
	}

	@Then("^login will be successful$")
	public void login_will_be_successful() throws Throwable {
		Assert.assertTrue(pf.getGcrLogout().get(0).isDisplayed());
	}

}
