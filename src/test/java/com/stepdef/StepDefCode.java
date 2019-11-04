package com.stepdef;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.SeleniumWait;
import com.zoopla.MasterPagefactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.emory.mathcs.backport.java.util.Collections;

public class StepDefCode {
	WebDriver driver;
	MasterPagefactory pf;
	List<Integer> list = new ArrayList<>();// upcasting poly

	@Given("^User able to open the browser$")
	public void user_able_to_open_the_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^Go to the \"([^\"]*)\" login page$")
	public void go_to_the_login_page(String url) throws Throwable {

		driver.get(url);

	}

	@When("^User able to login with \"([^\"]*)\" , \"([^\"]*)\" and submit login button$")
	public void user_able_to_login_with_and_submit_login_button(String user, String pass) throws Throwable {

		pf = PageFactory.initElements(driver, MasterPagefactory.class);
		pf.getCookiesAcceptance().get(0).click();

		SeleniumWait.getExplicitwait(driver, pf.getSigninbuttonofzoopla().get(0));

		pf.getSigninbuttonofzoopla().get(0).click();

		try {

			SeleniumWait.getSleep(pf.getZooplaEmail().get(0));
			pf.getZooplaEmail().get(0).sendKeys(user);
		} catch (Exception e) {

		}

		pf.getZooplaPassword().get(0).sendKeys(pass);
		pf.getIDcredentialSubmitt().get(0).click();

	}

	@Then("^verify the page title$")
	public void verify_the_page_title() throws Throwable {

		if (driver.getTitle().contains("Zoopla")) {
			System.out.println("Got my title");

		} else {
			System.out.println("Test failed");

		}

		Assert.assertTrue(driver.getTitle().contains("Zoopla"));

	}

	@When("^Go to the search box and put the \"([^\"]*)\"$")
	public void go_to_the_search_box_and_put_the(String location) throws Throwable {

		try {
			SeleniumWait.getExplicitwait(driver, pf.getLocationSearchBox().get(0));
		} catch (Exception e) {

		}
		pf.getLocationSearchBox().get(0).sendKeys(location);
		pf.getLocationSearchBox().get(0).submit();

	}

	@When("^Print all price in descending order$")
	public void print_all_price_in_descending_order() throws Throwable {

		try {
			SeleniumWait.getExplicitwait(driver, pf.getAllPrice().get(0));
		} catch (Exception e) {

		}

		for (int i = 0; i < pf.getAllPrice().size(); i++) {

			int price = Integer.parseInt(pf.getAllPrice().get(i).getText().replaceAll("\\D", ""));

			list.add(price);

		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

	@When("^select the fifth property from the list$")
	public void select_the_fifth_property_from_the_list() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(pf.getAllPrice().get(4));
		try {
			SeleniumWait.getExplicitwait(driver, pf.getAllPrice().get(4));
			pf.getAllPrice().get(4).click();
		} catch (Exception e) {

		}
		

		try {
			SeleniumWait.getExplicitwait(driver, pf.getLastCookies().get(1));
		} catch (Exception e) {

		}

	}

	@Then("^Verify logo,name and telephone number of the agent$")
	public void verify_logo_name_and_telephone_number_of_the_agent() throws Throwable {
		try {
			SeleniumWait.getExplicitwait(driver, pf.getClientlogo().get(0));
		} catch (Exception e) {

		}
		System.out.println(pf.getClientlogo().get(0).getAttribute("alt"));
		System.out.println(pf.getClientName().get(0).getText());

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String content=(String) js.executeScript("return document.getElementsByClassName('agent_phone').value;");
		System.out.println(content);

	}

	@When("^Log out from the portal$")
	public void log_out_from_the_portal() throws Throwable {

	}

	@When("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

}
