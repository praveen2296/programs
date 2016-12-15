package com.selenium.tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelReading {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\Visalakshi\\Desktop\\Demo.xls"));
		Sheet credentials = workbook.getSheet("Credentials");
		for (int row = 1; row < credentials.getRows(); row++) {
			Cell USERID = credentials.getCell(0, row);
			Cell PWD = credentials.getCell(1, row);
			System.out.println(USERID.getContents());
			System.out.println(PWD.getContents());

			// Login into Application
			
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(
					USERID.getContents());
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
					PWD.getContents());
			driver.findElement(By.name("login")).click();

			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@value='roundtrip']"));
			Thread.sleep(1000);
			
			Select sel = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
			sel.selectByVisibleText("2");
			Thread.sleep(1000);
			
			Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
			sel1.selectByValue("Frankfurt");
			Thread.sleep(1000);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
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
			Thread.sleep(5000);

			String Reservation_number = driver.findElement(By.xpath("//font[contains(text(),'Confirmation')]")).getText(); 
			System.out.println(Reservation_number);
			driver.findElement(By.linkText("SIGN-OFF")).click();

			
		}

		driver.close();
		driver.quit();

	}
}
