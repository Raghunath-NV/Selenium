package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass 
{

	@Test
	public void test1() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/Raghu/Downloads/chromedriver76");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); //Dynamic Polymorphism
		
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.id("menu1")).click();
		List<WebElement> list= driver.findElements(By.xpath("//ul[@aria-labelledby='menu1']/li/a"));
		System.out.println(list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		driver.quit();
	}	
}
