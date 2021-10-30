package com.qa.tests;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="countryNames")
	public Object[][] getCountryName(){
		return new Object[][] {{"India"},{"Australia"}};
	}

}
