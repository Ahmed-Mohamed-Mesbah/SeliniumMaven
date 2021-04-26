package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	
	WebDriver TestDriver;

	@BeforeTest
	public void OpenURL() {
		
		String ChromeDriverPath = System.getProperty("user.dir") + "\\Sources\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
		TestDriver = new ChromeDriver();
		TestDriver.navigate().to("https://www.google.com");
		
		System.out.println("Hello From The Other Side");
	}
	
	@Test
	public void UserLogin() {
		System.out.println(TestDriver.getCurrentUrl());
		System.out.println(TestDriver.getTitle());

	}
	
	
	@AfterTest
	public void CloseURL() {
		System.out.println("Bye From The Other Side");
//		String ChromeDriverPath = System.getProperty("user.dir") + "\\Sources\\chromedriver.exe" ;
//		System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
//		TestDriver = new ChromeDriver();
		TestDriver.close();

	}
	
	
	@Test
	public void UserCanBuy() {
		
		System.out.println("Bye From The Other Side");

	}
	
}
