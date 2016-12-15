
package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		
		/*WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']/h1")).getText());
		
		driver.switchTo().frame(0);
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']/h1")).getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='content']/iframe")));
		
		driver.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("09/06/2016");
		
		Thread.sleep(3000);
		
	driver.close();
	driver.quit();*/
		
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://expertittutorials.com/#/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("iframeTab")).click();
		driver.findElement(By.id("modalBtn")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='iframeSec']/h4")).getText());
		
		driver.switchTo().frame(0);
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='iframeSec']/h4")).getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='popupFrame']")));
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("Vasu");
		
		Thread.sleep(3000);
		
	driver.close();
	driver.quit();
	
	}

}
