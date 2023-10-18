package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void captureScreenshot(WebDriver driver, String testId) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy HH mm ss");
		Date date = new Date();
		File dest = new File("test-output//FailedTestScreenShot"+testId+""+formatter.format(date)+".jpeg");
		FileHandler.copy(src, dest);
		
		
	}
}
