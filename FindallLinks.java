package com.selenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindallLinks {

	public static void main(String[] args) throws Exception {
		 
		WebDriver driver = new FirefoxDriver();
		String HomeURL = "http://www.newtours.demoaut.com";
		driver.get(HomeURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		List <WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for(int i=0;i<links.size();i++){
			
			String text = links.get(i).getText();
			System.out.println(text);
	
		}
		 driver.close();
	}
 
}



