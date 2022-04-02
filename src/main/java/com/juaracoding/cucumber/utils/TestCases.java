package com.juaracoding.cucumber.utils;

public enum TestCases {
	
	T1("Testing Register Customer"),
	T2("Testing Login Customer"),
	T3("Testing Search Product"),
	T4("Testing Compare Product"),
	T5("Testing CheckOut Product");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
