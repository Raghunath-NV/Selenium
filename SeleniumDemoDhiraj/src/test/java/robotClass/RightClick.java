package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.MouseAction;

public class RightClick {
	
	@Test
	public void dclick() throws Exception 
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	MouseAction.right_click(driver, driver.findElement(By.xpath("//a[contains(.,'Insurance Project')]")));
	Robot robot=new Robot();
	Thread.sleep(4000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(4000);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(4000);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	robot.keyRelease(KeyEvent.VK_ENTER);

	}

}


