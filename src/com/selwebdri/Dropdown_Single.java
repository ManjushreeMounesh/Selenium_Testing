package com.selwebdri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Single {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("2345678769");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("jhg@3sd");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select S= new Select(day);
		
		S.selectByValue("6");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select S1= new Select(month);
		S1.selectByIndex(2);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select S2= new Select(year);
		
		S2.selectByVisibleText("1987");
		
		List<WebElement> options = S2.getOptions();
		
	int Si = options.size();
	
	System.out.println(Si);
	
	boolean multiple = S.isMultiple();
	
	System.out.println("True or Flase:" +multiple);
		
				
		
	}

}
