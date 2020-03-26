package demoPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBpageValidation {

	@Test
	public void test1() throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/Raghu/Downloads/chromedriver76");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		Properties properties=new Properties();
		File src=new File("/Users/Raghu/Documents/Git_Jenkins/JenkinsPractice/SeleniumDemoDhiraj/configuration/config.properties");
		FileInputStream ip =new FileInputStream(src);
		properties.load(ip);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).click();
		SoftAssert assertion = new SoftAssert(); 
		assertion.assertEquals(driver.findElement(By.xpath("//div[contains(@id,'js')]")).getText(),properties.getProperty("name1"));
		
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[6]")).click();
		System.out.println();
		assertion.assertEquals(driver.findElement(By.xpath("(//div[contains(@id,'js')])[2]")).getText(),properties.getProperty("phone"));
		
		assertion.assertAll();  //This activates Soft Assert
	}
}


//
