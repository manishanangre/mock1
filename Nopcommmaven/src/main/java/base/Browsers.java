package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;

public class Browsers {
public static WebDriver launchChrome() {
		
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		return driver ;
		
	}
	
	public static WebDriver launchEdge() {
		
		System.setProperty("webdriver.edge.driver","src\\test\\resources\\browsers\\ExtExport.exe");
		WebDriver driver =new EdgeDriver();
		return driver ;
	}
	
public static WebDriver launchFireFox() {
		
		System.setProperty("webdriver.gecko.driver","src\\test\\resources\\browsers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		return driver ;
}
}
