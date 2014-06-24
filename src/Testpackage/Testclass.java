package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.zamzar.com/");
		
		// assuming driver is a healthy WebDriver instance
		WebElement fileInput = driver.findElement(By.name("uploadfile"));
		fileInput.sendKeys("/Desktop/file.txt");
	}

}
