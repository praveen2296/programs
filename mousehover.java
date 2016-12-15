package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.centurylinkindia.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		WebElement services =driver.findElement(By.xpath(".//*[@id='Services']/a"));
		WebElement QualityAssurance = driver.findElement(By.xpath(".//*[@id='subMenuServices']/li[5]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(services).perform();
		Thread.sleep(6000);
		QualityAssurance.click();

		Thread.sleep(8000);
		
		driver.close();
	}
}
