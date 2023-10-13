package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginOrSignUpPage;
import pages.ForgotPasswordPage;

public class TestClass {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//1.POM class object create
//2. POM classes non static variable declared / webElement declared
//3. Constructor code execute - Initialization of var./ Initialization or find of WebElement
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.sendUserName("manisha.nangare82@gmail.com");
		loginOrSignUpPage.sendPassWord("manisha@123");
		loginOrSignUpPage.clickForgotPassWordLink();
		
		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
		String msg = forgotPasswordPage.getForgotMessage();
		
		if (msg.equals("Please enter your email address or mobile number to search for your account."))
			System.out.println("Test case Pass");
		else
			System.out.println("Test Case Fail");
		
		forgotPasswordPage.sendEmail();
		forgotPasswordPage.clickSearchButton();
	}

}
