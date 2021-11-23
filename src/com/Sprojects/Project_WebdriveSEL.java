package com.Sprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_WebdriveSEL {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
				
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://www.javatpoint.com/java-tutorial");
		
		driver.navigate().forward();
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		driver.close();
		
		//String Title = driver.getTitle();
		//System.out.println(Title);
		
		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		
		
	}

}
