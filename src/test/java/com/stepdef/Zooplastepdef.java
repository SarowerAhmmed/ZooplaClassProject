/*
 * package com.stepdef;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.PageFactory; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * import com.zoopla.MasterPagefactory;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class Zooplastepdef {
 * 
 * WebDriver driver; MasterPagefactory pf;
 * 
 * @Given("^User able to open the browser$") public void
 * user_able_to_open_the_browser() throws Throwable {
 * System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * 
 * }
 * 
 * @Given("^Go to the \"([^\"]*)\" login page$") public void
 * go_to_the_login_page(String url) throws Throwable { driver.get(url);
 * 
 * }
 * 
 * @Given("^Accept the cookies button$") public void accept_the_cookies_button()
 * throws Throwable { pf = PageFactory.initElements(driver,
 * MasterPagefactory.class); pf.getCookiesAcceptance().get(0).click();
 * 
 * }
 * 
 * @When("^User able to login to the portal by Sign in Button$") public void
 * user_able_to_login_to_the_portal_by_Sign_in_Button() throws Throwable {
 * pf.getSigninbuttonofzoopla().get(0).click();
 * 
 * }
 * 
 * @When("^pass the \"([^\"]*)\"$") public void pass_the(String Email) throws
 * Throwable { pf.getZooplaEmail().get(0).sendKeys(Email);
 * 
 * }
 * 
 * @When("^Put  the \"([^\"]*)\"$") public void put_the(String password) throws
 * Throwable { pf.getZooplaPassword().get(0).sendKeys(password);
 * 
 * }
 * 
 * @When("^Hit the login button$") public void hit_the_login_button() throws
 * Throwable { pf.getIDcredentialSubmitt().get(0).click(); }
 * 
 * @When("^Select the For Sale option$") public void
 * select_the_For_Sale_option() throws Throwable {
 * pf.getSelectSale().get(0).click(); }
 * 
 * @When("^Go to the search box and put the \"([^\"]*)\"$") public void
 * go_to_the_search_box_and_put_the(String Location) throws Throwable {
 * pf.getLocationSearchBox().get(0).sendKeys(Location);
 * 
 * }
 * 
 * @When("^Hit the search button$") public void hit_the_search_button() throws
 * Throwable { pf.getClicksearchbtn().get(0).click();
 * 
 * }
 * 
 * @When("^Select the dropdown to sort the list$") public void
 * select_the_dropdown_to_sort_the_list() throws Throwable {
 * pf.getDropdown().get(0).click();
 * 
 * }
 * 
 * @When("^Select in highest to lowest$") public void
 * select_in_highest_to_lowest() throws Throwable {
 * 
 * }
 * 
 * @When("^Print the list$") public void print_the_list() throws Throwable {
 * 
 * }
 * 
 * @When("^select the fifth property in descending order$") public void
 * select_the_fifth_property_in_descending_order() throws Throwable {
 * pf.getDropDownAllOption().get(4).click();
 * 
 * }
 * 
 * @When("^Verify logo,name and telephone number of agent$") public void
 * verify_logo_name_and_telephone_number_of_agent() throws Throwable {
 * 
 * }
 * 
 * @When("^Log out from the portal$") public void log_out_from_the_portal()
 * throws Throwable {
 * 
 * }
 * 
 * @Then("^close the browser$") public void close_the_browser() throws Throwable
 * {
 * 
 * driver.quit(); }
 * 
 * }
 */