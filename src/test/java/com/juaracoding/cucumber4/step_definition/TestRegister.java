package com.juaracoding.cucumber4.step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber.driver.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.ConfigurationProperties;
import com.juaracoding.cucumber.utils.Constants;
import com.juaracoding.cucumber.utils.TestCases;
import com.juaracoding.cucumber.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.java.en.Then;

@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class TestRegister {

	public WebDriver driver;
	ExtentTest extentTest;
	
	public TestRegister() {
		driver = Hook.driver;
	}
	
	
	@When("customer mendaftarkan account baru")
	public void customer_add_account() {
	loginPage.submitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
	extentTest.log(LogStatus.PASS, "Customer klik login Button");
	}
		
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		//refresh
		driver.navigate().refresh();
		tunggu();
		assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
		extentTest.log(LogStatus.PASS, "Customer berhasil login");
	}
	
	@When("Customer klik menu My Booking")
	public void customer_klik_menu_my_booking() {
		tunggu();
		bookingPage.goToMenuMyBooking();
		extentTest.log(LogStatus.PASS, "Customer klik menu My Booking");
	}
	
	@Then("Customer melihat page MyBooking")
	public void customer_melihat_page_title() {
		assertEquals(configurationProperties.getTxtTitleMyBookingPage(), bookingPage.getTxtTitleMyBookingPage());
		extentTest.log(LogStatus.PASS, "Customer melihat page MyBooking");
	}
	
	public void tunggu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}