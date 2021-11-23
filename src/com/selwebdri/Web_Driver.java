package com.selwebdri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String CU = driver.getCurrentUrl();
		System.out.println(CU);
	
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.close();
						
		// driver.findElement(arg0)
		
		// driver.findElements(arg0)
				
	}

}
