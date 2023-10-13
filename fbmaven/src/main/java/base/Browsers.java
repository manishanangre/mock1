package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsers {
	
	public static WebDriver launchChrome() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		return driver ;
		
	}
	
	public static WebDriver launchEdge() {
		
		System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Internet Explorer\\ExtExport.exe");
		
		WebDriver driver =new EdgeDriver();
		return driver ;
	}
	

}
