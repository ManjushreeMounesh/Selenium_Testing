package com.selwebdri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Deselect {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
						
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s= new Select(multiple);
		
		s.selectByVisibleText("Loadrunner");
		
		s.selectByValue("1");
		
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		s.deselectByVisibleText("Loadrunner");
		
		s.deselectByValue("1");
		
		s.deselectAll();
		
		s.selectByVisibleText("Appium");
		
		s.selectByValue("2");
		
		
		
		
		boolean M = s.isMultiple();
		
		System.out.println("Is Multiple:"+M);
		
		List<WebElement> opt = s.getOptions();
		
		for (WebElement webElement : opt) {
			
			System.out.println(webElement.getText());
			
		}
		System.out.println("-------------");
		
		List<WebElement> allsele = s.getAllSelectedOptions();
		
		for (WebElement webElement : allsele) {
			
			System.out.println(webElement.getText());
		}
	System.out.println("--------------");
	
	WebElement firsele = s.getFirstSelectedOption();
	
	System.out.println(firsele.getText());
		
	}

}
