package com.ssa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightReservation {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		
		// Open the URL
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Login
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
		Thread.sleep(1000);
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		sel.selectByVisibleText("2");
		Thread.sleep(1000);
		
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		sel1.selectByValue("Frankfurt");
		Thread.sleep(1000);
		
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		sel2.selectByValue("2");
		Thread.sleep(1000);
		
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		sel3.selectByValue("1");
		Thread.sleep(1000);
		
		Select sel4 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		sel4.selectByValue("London");
		Thread.sleep(1000);
		
		Select sel5 = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		sel5.selectByValue("2");
		Thread.sleep(1000);
				
		Select sel6 = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		sel6.selectByValue("10");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Vasudev");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Reddy");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1234567890");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(1000);
		
		String conf = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]")).getText();
		
		System.out.println("Confirmation Number : " + conf);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		driver.close();
		
		
		
		
		
	}

}
