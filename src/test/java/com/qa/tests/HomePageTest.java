package com.qa.tests;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class HomePageTest {
	@Test(priority = 1)
	public void checkDateFormat() {
		String actualDate="2014-10-25";
		LocalDate flag=LocalDate.parse(actualDate, DateTimeFormatter.ISO_DATE);
		System.out.println(flag);
	}
	@Test(priority = 2)
	public void checkDateFormatNegative() {
		String actualDate="2014/10/25";
		try {
		LocalDate flag=LocalDate.parse(actualDate, DateTimeFormatter.ISO_DATE);
		System.out.println(flag);
		}
		catch(DateTimeException e) {
		e.printStackTrace();;
		}
	}
}
