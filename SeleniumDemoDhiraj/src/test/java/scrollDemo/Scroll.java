package scrollDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	@Test
	public void scrollDown() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);    //using keyboard key bcz button position changes
		driver.findElement(By.xpath("//input[@title='Search']")).submit(); //another way
Thread.sleep(2000);
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		javascriptExecutor.executeScript("scroll(0,1400)");  //scroll down till 1400 pixel and negative will scroll up
	    //javascriptExecutor.executeScript("scroll(0,-1400)");  //scrolling up 
		driver.findElement(By.xpath("//h3[text()='Selenium: Definition, How it works and Why you need it ...']")).click();
		
	}
}
