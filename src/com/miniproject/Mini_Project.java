package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
						
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();	
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nisha0602@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Manjushree");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Mounesh");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
		driver.findElement(By.id("passwd")).sendKeys("Krish$06");
		
		WebElement Date = driver.findElement(By.id("days"));
		Select S = new Select(Date);
		S.selectByValue("6");
		
		WebElement Month = driver.findElement(By.id("months"));
		Select S1 = new Select(Month);
		S1.selectByValue("1");
		
		WebElement Year = driver.findElement(By.id("years"));
		Select S2 = new Select(Year);
		S2.selectByValue("1987");
		
		driver.findElement(By.id("optin")).click();
		
		driver.findElement(By.id("firstname")).sendKeys("Manjushree");
		driver.findElement(By.id("lastname")).sendKeys("Mounesh");
		driver.findElement(By.id("company")).sendKeys("Infosys");
		driver.findElement(By.id("address1")).sendKeys("Flat 321");
		driver.findElement(By.id("city")).sendKeys("California");
		
		WebElement Multiple = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		Select A = new Select(Multiple);
		A.selectByVisibleText("California");
		
		driver.findElement(By.id("postcode")).sendKeys("93657");
		
		driver.findElement(By.xpath("//*[@id=\"id_country\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("9600721169");
		
		driver.findElement(By.id("alias")).sendKeys("Camino,Encinitas");
		
		driver.findElement(By.id("submitAccount")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
