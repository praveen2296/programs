package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HttpAuth {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

	//driver.get("http://test.webdav.org/auth-basic/");
		
		driver.get("http://user2:user2@test.webdav.org/auth-basic/");
		
		//http://domainname%5Cusername:password@google.com

		Thread.sleep(10000);

		driver.close();


	}

}