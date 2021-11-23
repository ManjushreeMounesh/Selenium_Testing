package com.selwebdri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Web {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement Userid = driver.findElement(By.xpath("//input[@type='text']"));
		
		Userid.sendKeys("1234567890");
		
		String att = Userid.getAttribute("value");
		
		System.out.println(att);
		
		boolean displayed = Userid.isDisplayed();
		
		System.out.println("Displayed or not :" +displayed);
		
		boolean enabled = Userid.isEnabled();
		
		System.out.println("Enabled or not:" +enabled);
		
		boolean selected = Userid.isSelected();
		
		System.out.println("Selected or not:" +selected);
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("kkkkkkkkkk");
		
		Thread.sleep(3000);
		
		password.clear();
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		// String att = Userid.getAttribute("value");
		
		// System.out.println(att);
		
		
	}

}
