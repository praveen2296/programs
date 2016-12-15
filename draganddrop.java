package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement box1 = driver.findElement(By.id("box1"));
		WebElement box2 = driver.findElement(By.id("box2"));
		WebElement box3 = driver.findElement(By.id("box3"));
		WebElement box4 = driver.findElement(By.id("box4"));
		
		WebElement dropbox = driver.findElement(By.id("dropBox"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(box1, dropbox).perform();
		Thread.sleep(2000);
		act.dragAndDrop(box2, dropbox).perform();
		Thread.sleep(2000);
		act.dragAndDrop(box3, dropbox).perform();
		Thread.sleep(2000);
		act.dragAndDrop(box4, dropbox).perform();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}
