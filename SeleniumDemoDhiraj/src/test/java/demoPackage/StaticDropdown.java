package demoPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown {

	@Test
	public void test1() throws Exception
	{
		SoftAssert assertion = new SoftAssert(); 
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select select= new Select(driver.findElement(By.id("select-demo")));
		List<WebElement> list = select.getOptions();
		assertion.assertEquals(list.get(6).getText(), "Friday");
		assertion.assertAll();
	}
}
