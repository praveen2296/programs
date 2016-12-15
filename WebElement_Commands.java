package com.ssa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_Commands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.name("userName")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.name("userName")).clear();
						
		boolean status1 = driver.findElement(By.name("login")).isDisplayed();
		System.out.println(status1);
		
		boolean status2 =driver.findElement(By.name("login")).isEnabled();
		System.out.println(status2);
		
		boolean status3 =driver.findElement(By.name("login")).isSelected();
		System.out.println(status3);
				
		System.out.println(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font/a")).getText());
		System.out.println(driver.findElement(By.name("login")).getTagName());
		System.out.println(driver.findElement(By.name("login")).getAttribute("value"));
		
		Dimension dimensions = driver.findElement(By.name("login")).getSize();
		System.out.println("Height :" + dimensions.height);
		System.out.println("Width :" + dimensions.width);
			
		Point point = driver.findElement(By.name("login")).getLocation();
		System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
	}

}
