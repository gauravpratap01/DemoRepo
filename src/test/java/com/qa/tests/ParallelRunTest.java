package com.qa.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelRunTest {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("Before test-method. Thread id is: " + id);
	}

	@Test
	public void googleTest1Chrome() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method One. Thread id is: " + id);
		System.out.println("Inside Test1");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@Test
	public void freeCRMTest2Chrome() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Two. Thread id is: " + id);
		System.out.println("Inside Test2");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/");
	}

	@Test
	public void googleTest3Firefox() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method three. Thread id is: " + id);
		System.out.println("Inside Test3");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@Test
	public void freeCRMTest4Firefox() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method four. Thread id is: " + id);
		System.out.println("Inside Test4");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/");
	}

	@AfterMethod
	public void afterMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("After test-method. Thread id is: " + id);
		driver.close();
	}
}
