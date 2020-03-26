package actionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.MouseAction;

public class RightClick extends MouseAction{
	
	@Test
	public void dclick() 
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	right_click(driver,driver.findElement(By.cssSelector(".context-menu-one")));
	
	driver.findElement(By.cssSelector(".context-menu-icon-paste")).click();
	
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	
	}
}
