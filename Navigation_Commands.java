package com.ssa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		//Open the URL
		driver.get("http://newtours.demoaut.com/");
		
		//Wait for 5 Seconds
		Thread.sleep(5 * 1000);
		
		//Navigate to the URL
		driver.navigate().to("http://www.google.com");
		
		//Wait for 5 Seconds
		Thread.sleep(5 * 1000);
		
		//Navigate Back
		driver.navigate().back();
		
		//Wait for 5 Seconds
		Thread.sleep(5000);
		
		//Navigate Forward
		driver.navigate().forward();
		
		//Wait for 5 Seconds
		Thread.sleep(5 * 1000);
		
		//Refresh the Page
		driver.navigate().refresh();
		
		//Wait for 5 Seconds
		Thread.sleep(5 * 1000);
		
		//Close the Browser
		driver.close();

	}

}
