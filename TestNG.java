package com.ssa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG {

	WebDriver driver = null;
	
  @Test(priority = 0)
  public void FlightReservation() throws Exception {
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
  }
  
  @Test(enabled =false)
  public void FlightReservation1() throws Exception {
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
  }
  @BeforeMethod
  public void beforeMethod() {
	 driver.get("http://www.newtours.demoaut.com/");
	//Login
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	driver.findElement(By.xpath("//input[@name='login']")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("SIGN-OFF")).click();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
