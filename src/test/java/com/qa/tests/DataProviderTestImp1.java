package com.qa.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestImp1 {

	@Test(dataProvider = "cityNames")
	public void testCityName(String city) {
		System.out.println("Your City name is: " + city);
	}
	
	@DataProvider(name = "cityNames")
	public Object[][] getCityName() {
		return new Object[][] { { "Roorkee" }, { "Delhi" } };
	}
	
	@Test(dataProvider = "customerNames")
	public void testCustomerName(String customer,int age) {
		System.out.println("Your City name is: " + customer);
		System.out.println("Your Age is: " + age);
	}
	
	@DataProvider(name = "customerNames")
	public Object[][] getCustomerName() {
		return new Object[][] { { "Gaurav",30 }, { "Sumit",40 } };
	}
	
	@Test(dataProvider="countryNames",dataProviderClass=DataProviderClass.class)
	public void testCountryName(String country) {
		System.out.println("Your Country name is: "+ country);
	}

}
