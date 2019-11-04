package com.zoopla;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPagefactory {

	@FindBy(xpath = "//*[@class='button button--tertiary-dark account-link__text']")
	private List<WebElement> signinbuttonofzoopla;

	@FindBy(xpath = "//*[contains(@type,'email')]")
	private List<WebElement> zooplaEmail;

	@FindBy(xpath = "//*[@id='signin_password']")
	private List<WebElement> zooplaPassword;

	@FindBy(xpath = "//*[@id='signin_submit']")
	private List<WebElement> IDcredentialSubmitt;

	@FindBy(xpath = "//*[@class='icon--logo']")
	private List<WebElement> ZooplaLogo;

	@FindBy(xpath = "//*[@class='search-input geo_autocomplete']")
	private List<WebElement> LocationSearchBox;

	@FindBy(xpath = "//*[@id='search-submit']")
	private List<WebElement> Clicksearchbtn;

	@FindBy(xpath = "(//*[@class='js-redirects-to-option js-check js-touched'])[2]")
	private List<WebElement> Dropdown;

	@FindBy(xpath = "//*[@class='button cookie-banner__button']")
	private List<WebElement> CookiesAcceptance;

	@FindBy(xpath = "//*[@id='search-tabs-for-sale']")
	private List<WebElement> SelectSale;

	@FindBy(xpath = "(//*[@class=\"js-redirects-to-option js-check js-touched\"])[2]")
	private List<WebElement> DropDown;

	@FindBy(xpath = "//*[@class='listing-results-price text-price']")
	private List<WebElement> DropDownAllOption;

	@FindBy(xpath = "(//*[@name='results_sort'])[2]")
	private List<WebElement> DDforDesc;

	@FindBy(xpath = "//*[@value='highest_price']")
	private List<WebElement> DDvalue;

	@FindBy(xpath = "//*[@class='listing-results-price text-price']")
	private List<WebElement> allPrice;
	
	@FindBy(xpath = "//*[@class='ui-agent__logo']")
	private List<WebElement> clientlogo;
	
	@FindBy(xpath = "//*[@class='ui-agent__name']")
	private List<WebElement> clientName;
	
	@FindBy(xpath = "//*[@class='ui-link']//span")
	private List<WebElement> clientPhone;
	
	
	@FindBy(xpath = "//*[@class='ui-cookie-consent-form__buttons']//button")
	private List<WebElement> lastCookies;
	
	
	public List<WebElement> getSigninbuttonofzoopla() {
		return signinbuttonofzoopla;
	}

	public List<WebElement> getZooplaEmail() {
		return zooplaEmail;
	}

	public List<WebElement> getZooplaPassword() {
		return zooplaPassword;
	}

	public List<WebElement> getLocationSearchBox() {
		return LocationSearchBox;
	}

	public List<WebElement> getClicksearchbtn() {
		return Clicksearchbtn;
	}

	public List<WebElement> getDropdown() {
		return Dropdown;
	}

	public List<WebElement> getCookiesAcceptance() {
		return CookiesAcceptance;
	}

	public List<WebElement> getSelectSale() {
		return SelectSale;
	}

	public List<WebElement> getDropDown() {
		return DropDown;
	}

	public List<WebElement> getDropDownAllOption() {
		return DropDownAllOption;
	}

	public List<WebElement> getDDforDesc() {
		return DDforDesc;
	}

	public List<WebElement> getDDvalue() {
		return DDvalue;
	}

	public List<WebElement> getIDcredentialSubmitt() {
		return IDcredentialSubmitt;
	}

	public List<WebElement> getZooplaLogo() {
		return ZooplaLogo;
	}

	public List<WebElement> getAllPrice() {
		return allPrice;
	}

	public List<WebElement> getClientlogo() {
		return clientlogo;
	}

	public List<WebElement> getClientName() {
		return clientName;
	}

	public List<WebElement> getClientPhone() {
		return clientPhone;
	}

	public List<WebElement> getLastCookies() {
		return lastCookies;
	}

}
