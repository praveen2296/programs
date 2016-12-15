package com.ssa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Multiple_Browsers {

	public static void main(String[] args) {
		
		//For Firefox Browser
		//WebDriver driver = new FirefoxDriver();
		
		System.out.println(System.getProperty("user.dir"));
		//For Internet Explorer Browser
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"/Library/IEDriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Library\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Safari Browser
		//WebDriver driver = new SafariDriver();
		driver.get("http://seleniumhq.org");

	}

}
