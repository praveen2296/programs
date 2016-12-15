package com.selenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWebTables {

	public static void main(String[] args) {
		 
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.k12.com/schoolfinder.international-options.html");

        List<WebElement> td = driver.findElements(By
                                        .xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td"));
        System.out.println("Size: " + td.size());

        String sCellValue = driver.findElement(
                                        By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]"))
                                        .getText();
        System.out.println(sCellValue);

        for (int i = 1; i <= td.size(); i++) {
                        String CellValue = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[2]/td["+ i + "]")).getText();
                        System.out.println(CellValue);

        }

        driver.close();
        driver.quit();

}

}