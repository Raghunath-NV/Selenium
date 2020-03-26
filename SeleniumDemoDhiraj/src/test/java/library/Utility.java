package library;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	public static String screensShot(WebDriver driver,String name) throws Exception
	{
		try{
			int i=0;
		System.out.println("In Utility class");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE); //capturing screenshot as file type
		String dest="./Screenshot";   //creates if folder is not present
		String time=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		FileUtils.copyFile(f, new File(dest+"/"+name+"_"+time+"_"+(++i)+".png"));
		
		
		return dest;
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error while capturing screenshot " + e.getMessage());
		}
			
		return name;
	}

	public static void highlightElement_Screenshot(WebDriver driver,WebElement element) throws Exception {
		for(int i=0;i<2;i++)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"color:blue;border:2px solid red;");
			if(element.getAttribute("style")!= null)
			{
				Thread.sleep(2000);
			}
			js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"");
			
		}
		
	}
}

//tomorrow excel files
