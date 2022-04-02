package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.driver.DriverSingleton;

public class RegisterPage {
private WebDriver driver;
	
	public RegisterPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
	WebElement btnMyAccount;
	
	@FindBy(name = "username")
	WebElement inputUserName;
	
	@FindBy(name = "Email_Address")
	WebElement inputEmailAddress;
	
	@FindBy(name = "password")
	WebElement inputPassword;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
	WebElement btnRegister;
	@FindBy(className = "author__meta")
	WebElement txtWelcome;
	
	
	public void submitLogin(String username, String emailAddress, String password) {
		inputUserName.sendKeys(username);
		inputEmailAddress.sendKeys(emailAddress);
		inputPassword.sendKeys(password);
		btnRegister.click();
	}

	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
}

