package com.RevisionSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_mini {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();	
		
		driver.findElement(By.id("email")).sendKeys("nisha0602@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("Krish$06");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).build().perform();
		
		WebElement shirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		ac.moveToElement(shirt).build().perform();
		ac.click(shirt).build().perform();
		
		WebElement orange = driver.findElement(By.xpath("//div[@class='product-image-container']"));
		ac.moveToElement(orange).build().perform();
		
		WebElement quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		ac.click(quickview).build().perform();
		driver.switchTo().frame(0);
		
		WebElement cart = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		cart.click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(8000);
		
		WebElement proceed = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		proceed.click();
				
		WebElement proceed1 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		proceed1.click();
		
		WebElement proceed2 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		proceed2.click();
		
		WebElement agree = driver.findElement(By.id("cgv"));
		agree.click();
		
		WebElement proceed3 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		proceed3.click();
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
		payment.click();
	
		WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		confirm.click();
				
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500);");
		Thread.sleep(4000);
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\NISHA\\eclipse-workspace\\Selenium_Projects\\Screenshots\\PICTURE.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
	}

}
