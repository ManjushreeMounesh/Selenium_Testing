package com.selwebdri;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.get("http://leafground.com/pages/Alert.html");
						
		driver.manage().window().maximize();
		
		WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		
		simplealert.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	
		confirmalert.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		
		promptalert.click();
		
		Alert alert = driver.switchTo().alert();
								
		Thread.sleep(4000);
		
		//String 	text = alert.getText();
		
		//System.out.println(text);
		
		System.out.println(alert.getText());
		
		driver.switchTo().alert().sendKeys("SELENIUM");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	
	}

}
