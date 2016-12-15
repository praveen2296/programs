package Selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload_RobotClass {

	public static void main(String[] args) throws Exception {
		//Open WebDriver Instance
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();

		//Get The URL
		driver.get("http://pdf-unlock.cloud-pdf.com/unlock");
		
		//Declaring the Web Element
		WebElement element = driver.findElement(By.id("ufile"));
		element.click();
		
		//Location of the file to be uploaded
		String fileLocation = "C:\\Users\\Visalakshi\\Desktop\\test.pdf";

		// Setting clipboard with file location
		StringSelection stringSelection = new StringSelection(fileLocation);
		
		// StringSelection is a class that can be used for copy and paste
		// operations.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		// native key strokes for CTRL, V and ENTER keys
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(10000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);
		driver.close();

	}
}
