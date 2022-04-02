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
	private String userName;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${user}")
	private String username;
	
	@Value("${txtHello}")
	private String txtHello;
	
	@Value("${txtTitleMyBookingPage}")
	private String txtTitleMyBookingPage;

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String getTxtHello() {
		return txtHello;
	}

	public String getTxtTitleMyBookingPage() {
		return txtTitleMyBookingPage;
	}
}

	
