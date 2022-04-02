package com.juaracoding.cucumber.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.driver.DriverSingleton;

public class SearchPage {

	private WebDriver driver;
	
	public SearchPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > a")
	WebElement btnSearch;
	
	@FindBy(name = "s")
	WebElement inputSearch;
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div/h3/a")
	WebElement btnSelect;
	
	@FindBy(css = "#product-1473 > div.single-product-content > div.summary.entry-summary > form > table > tbody > tr:nth-child(1) > td")
	List<WebElement> pilihColor;
	
	@FindBy(css = "#product-1473 > div.single-product-content > div.summary.entry-summary > form > table > tbody > tr:nth-child(2) > td")
	List<WebElement> pilihSize;
	
	@FindBy(xpath = "//*[@id=\"product-1473\"]/div[1]/div[2]/form/div/div[2]/button")
	WebElement btnCart;
	
	public void Searching(String search) {
		btnSearch.click();
		inputSearch.sendKeys(search);
		inputSearch.sendKeys(Keys.ENTER);
	}
	
	public void PilihItem() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		btnSearch.click();
	}
	
	public void inputCart() {
		pilihColor.get(1).click();
		pilihSize.get(2).click();
		btnCart.click();
	}
	
	
	
}
