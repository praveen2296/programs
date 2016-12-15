package com.ssa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlightLogin extends ObjectRepository{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.newtours.demoaut.com/");
		
		ObjectRepository.username(driver).sendKeys("mercury");
		
		password(driver).sendKeys("mercury");
		
		login(driver).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
