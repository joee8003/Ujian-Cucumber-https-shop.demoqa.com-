package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name = "userName")
	WebElement inputuserName;
	
	@FindBy(name = "password")
	WebElement inputPassword;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
	WebElement btnLogin;
	
	@FindBy(className = "author__meta")
	WebElement txtWelcome;
	
	
	public void submitLogin(String userName, String password) {
		inputuserName.sendKeys(userName);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}

	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
	
}
