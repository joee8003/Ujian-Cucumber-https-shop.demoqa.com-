package com.juaracoding.cucumber.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${username}")
	private String username;
	
	@Value("${emailAddress}")
	private String emailAdress;
	
	@Value("${password}")
	private String password;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${username}")
	private String username1;
	
	@Value("${password}")
	private String password1;
	
	@Value("${txtWelcome}")
	private String txtWelcome1;
	
	@Value("${firstname}")
	private String firstname;
	
	@Value("${lastname}")
	private String lastname;
	
	@Value("${companyName}")
	private String companyName;
	
	@Value("${12345}")
	private String houseNumber;
	
	@Value("${apartment}")
	private String apartment;
	
	@Value("${jakarta}")
	private String jakarta;
	
	@Value("${123456}")
	private String inputPin;
	
	@Value("${08112345}")
	private String inputPhone;
	
	@Value("${test@yahoo.com}")
	private String inputEmail;
	
	@Value("${testing}")
	private String inputorderNotes;
		

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUserName() {
		return username;
	}

	public String getEmail() {
		return emailAdress;
	}

	public String getPassword() {
		return password;
	}
	
	public String getTxtWelcome() {
		return txtWelcome;
	}
	
	public String getUserName1() {
		return username1;

	}
	
	public String getPassword1() {
		return password1;
	}
	
	public String getfirstName() {
		return firstname;
	}
	
	public String getlastname() {
		return lastname;
	}
	
	public String getcompanyName() {
		return companyName;
	}
	
	public String get12345() {
		return houseNumber;
	}
	
	public String getapartment() {
		return apartment;
	}
	
	public String getjakarta() {
		return jakarta;
	}
	
	public String getEmail2() {
		return inputEmail;
		
	}
	
	public String gettesting() {
		return inputorderNotes;
		
	}
	
}

	
