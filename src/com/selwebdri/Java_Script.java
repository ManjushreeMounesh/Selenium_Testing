package com.selwebdri;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
					
		driver.get("https://www.amazon.in/");
						
		driver.manage().window().maximize();
		
		WebElement Logo = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div"));
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
						
		j.executeScript("arguments[0].scrollIntoView();",Logo);
		
		Thread.sleep(3000);
		
		j.executeScript("window.scrollBy(0,-3000)");
		
		j.executeScript("window.scrollBy(0,1000)");
	}

}
