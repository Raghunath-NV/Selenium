package functions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;

	public BaseClass() throws Exception {
		System.out.println("called BaseCLass");
		Properties properties = new Properties();
		File src = new File(
				"/Users/Raghu/Documents/Git_Jenkins/JenkinsPractice/SeleniumDemoDhiraj/configuration/config.properties");
		FileInputStream ip = new FileInputStream(src);
		properties.load(ip);

		String url = properties.getProperty("url");

		String browserName = properties.getProperty("browser");
		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}
		driver.get(url);
	}
	
	

	
}
