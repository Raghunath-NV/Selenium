package demoPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoostStrapDropdown {

	@Test
	public void bootStrapDropDown() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.xpath("//*[@id='form-currency']/div/button/i")).click();;  //clicking on button for drop down
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='form-currency']/div/ul/li/button")); // drop down items
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
//			if(i.getText().equals("£ Pound Sterling"))
//			{
//				i.click();
//				break;
//			}
			
		}
		Thread.sleep(1000);
		driver.quit();
	}
}


