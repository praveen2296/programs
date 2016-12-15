package com.selenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.erichynds.com/examples/jquery-ui-multiselect-widget/demos/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("placeholder")));
		driver.findElement(By.xpath(".//*[@id='test']/p[2]/button")).click();
		Thread.sleep(2000);
		
		List<WebElement> list = driver
				.findElements(By
						.xpath(".//*[@id='test']/div[1]/ul/li"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			driver.findElement(By.id("ui-multiselect-0-option-" + i)).click();
			Thread.sleep(2000);
		}

		driver.close();
	}
}
