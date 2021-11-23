package com.selwebdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.get("http://www.leafground.com/pages/drag.html");
						
		driver.manage().window().maximize();
		
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement Target = driver.findElement(By.id("mydiv"));
	
	Actions act = new Actions(driver);
	
	Thread.sleep(4000);
	
	act.dragAndDrop(source, Target).build().perform();
	
	
	
		
		
		
	}

}
