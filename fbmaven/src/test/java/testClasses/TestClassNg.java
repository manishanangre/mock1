package testClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LogOutPage;
import pages.LoginOrSignUpPage;
import utils.Utility;

public class TestClassNg {
	private WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver =new ChromeDriver(options);
	}
	
	@BeforeMethod
	public void loginApplication() throws EncryptedDocumentException, IOException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		
		String username = Utility.getDataFromExcelSheet(0,0,0);
			loginOrSignUpPage.sendUserName(username);
			
		String password = Utility.getDataFromExcelSheet(0,0,1);
			loginOrSignUpPage.sendPassWord(password);
			
			loginOrSignUpPage.clickLoginButton();
	}
	
  @Test (priority = 2)
  public void verifyNotificationFunctionality() throws InterruptedException {
	 
		
		Thread.sleep(2000);
		
		Homepage homepage = new Homepage(driver);
		homepage.clickOnnotificationIcon();
		homepage.clickOnThreeDots();
		homepage.clickOnMarkAllAsReadButton();
		
  }
  
  @Test (priority = 3)
  public void verifyMessengerFunctionality() throws InterruptedException {
	 
		
		Homepage homepage = new Homepage(driver);
		homepage.clickOnMessengerIcon();
		Thread.sleep(3000);
		homepage.clickOnNewMessageRequest();
		
  }
  @Test (priority =1)
  public void verifyCreatPostFunctionality() {
	  
		
		Homepage homepage = new Homepage(driver);
		homepage.clickOnCreateButton();
		homepage.clickOnCreatePost();
	
		
		
  }
  @AfterMethod
  public void logoutApplication() {
	  LogOutPage logOutPage = new LogOutPage(driver);
		logOutPage.logoutPage();
		logOutPage.clickLogOutButton();
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
  
  
  }

