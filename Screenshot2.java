package com.selenium.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class Screenshot2 {

	 public static void main(String[] args) throws IOException, InterruptedException {
         
         WebDriver driver = new FirefoxDriver();
        
         driver.manage().window().maximize();
        
         driver.get("https://rally1.rallydev.com/slm/login.op");
        
         EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
         
         File srcimgfile = edriver.getScreenshotAs(OutputType.FILE);
        
         File dstimgfile = new File("D:\\Seleniumtest.jpeg");
        
         FileUtils.copyFile(srcimgfile, dstimgfile);
        
         //Thread.sleep(2000);
        
         driver.close();
         driver.quit();
        
        
}

}