package com.qa.tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	WebDriver driver;

	@Test
	public void test1() {
		System.out.println("Inside Test1");
	}

	@Test
	public void test2() {
		System.out.println("Inside Test2");
	}

	@Test
	public void test3() {
		System.out.println("Inside Test3");
	}

	public void test4() {
		System.out.println("Inside Test4");

	}

	@Test(priority = 1)
	public void refresh() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); 
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.getCurrentUrl();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}

}
