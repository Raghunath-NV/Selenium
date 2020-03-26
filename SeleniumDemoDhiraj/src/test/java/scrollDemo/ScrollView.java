package scrollDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollView {
	
	@Test
	public void scrollDownView() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbar_themes_demo.html");
		
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//div[@id='mCSB_11_container']//p[contains(text(),'Nemo enim ipsam voluptatem quia voluptas sit')]"));
		Thread.sleep(5000);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println(element.getText());
		
	}
}
