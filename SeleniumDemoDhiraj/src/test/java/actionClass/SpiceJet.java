package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.MouseAction;

public class SpiceJet extends MouseAction{

	@Test
	public void goToAddons() 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com");
	mouse_Hover(driver,driver.findElement(By.id("highlight-addons")));
	driver.findElement(By.xpath("//a[@href='VisaServices.aspx']")).click();
	
	
	}
	
}


