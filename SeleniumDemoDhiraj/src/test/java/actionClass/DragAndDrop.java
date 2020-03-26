package actionClass;

import org.apache.poi.ss.formula.functions.DStarRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.MouseAction;

public class DragAndDrop {
	
	public class DragDrop {
		
		@Test
		public void dclick() 
		{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions actions=new Actions(driver);
		actions.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release().build().perform();
		}
	}
		

}
