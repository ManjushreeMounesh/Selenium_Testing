package com.Sprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proj_Web_Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys("9898989899");
		
		String att = userid.getAttribute("value");
		System.out.println(att);
		
		boolean displayed = userid.isDisplayed();
		System.out.println("Displayed or not :" +displayed);
		
		boolean enabled = userid.isEnabled();
		System.out.println("Enabled or not :" +enabled);
		
		boolean selected = userid.isSelected();
		System.out.println("Selected or not :" +selected);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Krish123");
		
		Thread.sleep(4000);
		
		password.clear();
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
	
		
		//String att = userid.getAttribute("value");
		//System.out.println(att);
		
		
	}

}
