package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handling {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://expertittutorials.com/#/practice");

		//Get the Unique Alpha Numeric ID of the Browser window Opened
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		driver.findElement(By.id("widowTab")).click();
		driver.findElement(By.id("normalWindow")).click();
		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		for (String hand : handles) {

			System.out.println(hand);
			//Switching for new window
			driver.switchTo().window(hand);
			
			System.out.println(driver.getTitle());
		}

		// Closing Pop Up window

		driver.close();

		// Close Original window

		driver.quit();

	}

}