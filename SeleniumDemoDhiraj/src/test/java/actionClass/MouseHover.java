package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.MouseAction;

public class MouseHover extends MouseAction{

	@Test
	public void hover() throws InterruptedException
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java#");
	
//	Actions actions = new Actions(driver);
//	actions.moveToElement(driver.findElement(By.linkText("Automation"))).build().perform();
	mouse_Hover(driver,driver.findElement(By.linkText("Automation")));
	Thread.sleep(2000);
	driver.findElement(By.linkText("Selenium Tutorial")).click();
	
	
	
	
	}
}
