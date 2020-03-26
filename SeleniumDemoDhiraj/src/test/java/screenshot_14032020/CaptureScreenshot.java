package screenshot_14032020;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import functions.BaseClass;
import library.Utility;

public class CaptureScreenshot extends BaseClass{
	


	public CaptureScreenshot() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void screensShot() throws Exception
	{	
		
		System.out.println("Check");
		Utility.screensShot(driver, "homePage");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		Utility.screensShot(driver, "homePageWithUserName");
		Utility.highlightElement_Screenshot(driver, driver.findElement(By.xpath("//input[@type='email']")));
		driver.quit();
			
	}
	

}


