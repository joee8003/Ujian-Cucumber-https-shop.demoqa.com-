package com.juaracoding.cucumber.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.driver.DriverSingleton;

public class CheckOutPage {
	

	private WebDriver driver;
	
	public CheckOutPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);	
	}

	@FindBy(id = "billing_first_name")
	WebElement inputfirstName;
	
	@FindBy(id = "billing_last_name")
	WebElement inputLastName;
	
	@FindBy(id = "billing_company")
	WebElement inputcompanyName;
	
	@FindBy(id = "select2-billing_country-container")
	WebElement btnCountry;
	
	@FindBy(id = "billing_address_1")
	WebElement inputhouseNumber;
	
	@FindBy(id = "billing_address_2")
	WebElement inputApartement;
	
	@FindBy(id = "billing_city")
	WebElement inputTown;
	
	@FindBy(id = "select2-billing_state-container")
	WebElement btnProvince;
	
	@FindBy(id = "billing_postcode")
	WebElement inputPin;
	
	@FindBy(id = "billing_phone")
	WebElement inputPhone;
	
	@FindBy(id = "billing_email")
	WebElement inputEmail;
	
	@FindBy(id = "order_comments")
	WebElement inputorderNotes;
	
	@FindBy(id = "terms")
	WebElement btnTerms;
	
	@FindBy(id = "place_order")
	WebElement btnSubmit;
	

	public void inputtData1(String firstname, String lastname, String companyName) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		inputfirstName.sendKeys(firstname);
		inputLastName.sendKeys(lastname);
		inputcompanyName.sendKeys(companyName);
	
	}
	
	public void buttonCountry() {
		btnCountry.click();
		btnCountry.sendKeys("indonesia");
		btnCountry.click();
	}
	
	public void inputData2() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		inputhouseNumber.sendKeys("12345");
		inputApartement.sendKeys("apartment");
		inputTown.sendKeys("jakarta");
		
	}
	
	public void buttonProvince() {
		btnProvince.click();
		btnProvince.sendKeys("jakarta");
		btnProvince.sendKeys(Keys.ENTER);
	}
	
	public void inputData3() {
		inputPin.sendKeys("123456");
		inputPhone.sendKeys("08112345");
		inputEmail.sendKeys("test@yahoo.com");
		inputorderNotes.sendKeys("testing");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,-500)");
		
	}
	
	public void buttonTerms() {
		btnTerms.click();
	}
	
	public void buttonSubmit() {
		btnSubmit.click();
	}
}

	

	
