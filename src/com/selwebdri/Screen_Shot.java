package com.selwebdri;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screen_Shot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("incognito");
				
		WebDriver driver =new ChromeDriver(ch);
		
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
						
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("456789");
		
		driver.findElement(By.id("pass")).sendKeys("4567");		
		
		WebElement loginbtw = driver.findElement(By.name("login"));
						
		TakesScreenshot take = (TakesScreenshot) driver;
		
		File source = take.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Screenshots\\PIC1.png");
		
		FileUtils.copyFile(source, destination);
		
	}

}
