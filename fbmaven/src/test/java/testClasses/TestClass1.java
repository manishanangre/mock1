package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginOrSignUpPage;

public class TestClass1 {
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		
		loginOrSignUpPage.sendUserName("manisha.nangare82@gmail.com");
		loginOrSignUpPage.sendPassWord("manisha@123");
		loginOrSignUpPage.clickLoginButton();
		
	}
	

}
