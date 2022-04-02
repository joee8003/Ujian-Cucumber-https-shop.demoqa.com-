package com.juaracoding.cucumber4.step_definition;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber.driver.DriverSingleton;
import com.juaracoding.cucumber.pages.CheckOutPage;
import com.juaracoding.cucumber.pages.ComparePage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.RegisterPage;
import com.juaracoding.cucumber.pages.SearchPage;
import com.juaracoding.cucumber.utils.ConfigurationProperties;
import com.juaracoding.cucumber.utils.Constants;
import com.juaracoding.cucumber.utils.TestCases;
import com.juaracoding.cucumber.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class Hook {

	public static WebDriver driver;
	
	public RegisterPage registerPage;
	public LoginPage loginPage;
	public SearchPage searchPage;
	public ComparePage comparePage;
	public CheckOutPage checkoutPage;
	
	ExtentTest extentTest;
	static ExtentReports reports = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects(){
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		registerPage = new RegisterPage();
		loginPage = new LoginPage();
		searchPage = new SearchPage();
		comparePage = new ComparePage();
		checkoutPage = new CheckOutPage();
		
		TestCases[] tests = TestCases.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	@AfterStep
	public void getResult(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", " "));
			extentTest.log(LogStatus.FAIL, "Screenshot:\n"+
			extentTest.addScreenCapture(screenshotPath));
	}
	}
	@AfterAll
	public static void closeBrowser() {
		driver.quit();
	}
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to "+Constants.URL);
	}
}
