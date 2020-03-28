package datePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	@Test
	public void SelectDate() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		// MouseActionLibrary.clickMouse(driver,
		// driver.findElement(By.xpath("//img[@class='imgdp']")));
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
//		WebElement calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
//		WebElement calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
//		WebElement monthNext = driver.findElement(By.xpath("//a[@title='Next']"));

		while (true) {
			WebElement calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			WebElement calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
			WebElement monthNext = driver.findElement(By.xpath("//a[@title='Next']"));
			if (((calendarMonth.getText().equals("June")) && (calendarYear.getText().equals("2020")))) {
				driver.findElement(By.xpath("//a[text()='30']")).click();
				break;
			}
			monthNext.click();
		}

		// while (!((calendarMonth.getText().equals("June")) &&
		// (calendarYear.getText().equals("2020")))) {
		//
		// monthNext.click();
		//
		// System.out.println("came back");
		// calendarMonth
		// =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		// calendarYear
		// =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		// }

		// for (int i = 0; i < 11; i++) {
		// WebElement calendarMonth =
		// driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		// WebElement calendarYear =
		// driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		// WebElement monthNext =
		// driver.findElement(By.xpath("//a[@title='Next']"));
		//
		// if ((calendarMonth.getText().equals("June")) &&
		// (calendarYear.getText().equals("2020"))) {
		// driver.findElement(By.xpath("//a[text()='30']")).click();
		// break;
		// }
		// monthNext.click();
		// }

	}

}
