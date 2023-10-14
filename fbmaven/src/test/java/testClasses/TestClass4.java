package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import module.SignUpForm;
import pages.Homepage;
import pages.LogOutPage;
import pages.LoginOrSignUpPage;

public class TestClass4 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.sendUserName("manisha.nangare82@gmail.com");
		loginOrSignUpPage.sendPassWord("manisha@123");
		loginOrSignUpPage.clickLoginButton();
		
		Homepage homepage = new Homepage(driver);
		homepage.clickOnMessengerIcon();
		Thread.sleep(3000);
		homepage.clickOnNewMessageRequest();
		
		//check date of birth scenario
		LogOutPage logOutPage = new LogOutPage(driver);
		logOutPage.logoutPage();
		logOutPage.clickLogOutButton();
}}
 