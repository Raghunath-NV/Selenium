package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void mouse_Hover(WebDriver driver,WebElement elementToHover) {
		Actions actions = new Actions(driver);
		actions.moveToElement((elementToHover)).build().perform();
		
		
		
	}
	
	public static void double_click(WebDriver driver,WebElement elementToClick) {
		Actions actions = new Actions(driver);
		actions.doubleClick(elementToClick).build().perform();
		
		
	}
	
	public static void right_click(WebDriver driver,WebElement elementToClick) {
		Actions actions = new Actions(driver);
		actions.contextClick(elementToClick).build().perform();
		
		
	}
	

	
	

}
