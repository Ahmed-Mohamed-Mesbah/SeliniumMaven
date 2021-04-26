package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		//		System.out.println( "Hello World!" );
//		String ChromPath = System.getProperty("user.dir") + "\\Sources\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver",ChromPath);
//		WebDriver ChromeDriver = new ChromeDriver();
//		ChromeDriver.navigate().to("https://www.google.com/");
		
		
		String FireFoxPath = System.getProperty("user.dir") + "\\Sources\\geckodriver.exe";
		System.setProperty("webdriver.firefox.driver",FireFoxPath);
		WebDriver FFDriver = new FirefoxDriver();
		FFDriver.navigate().to("https://www.google.com/");

	}
}
