package testClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;

import base.Browsers;
import dev.failsafe.internal.util.Assert;
import pages.Homepage;
import pages.LogOutPage;
import pages.LoginOrSignUpPage;
import utils.Utility;

public class TestClassNg2 extends Browsers {
	private WebDriver driver;
	private String testId;
	private LoginOrSignUpPage loginOrSignUpPage;
	private Homepage homepage;
	private  LogOutPage logOutPage ;
	
	@Parameters("browser")
	
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.contains("Chrome"))
		{
			driver=launchChrome();
		}
		if(browserName.contains("Edge"))
		{
			driver=launchEdge();
		}
	}
	
	
	@AfterTest
	public void AfterTest()
	{
		driver.quit();
		driver=null;
		System.gc();
	}
	
	@BeforeClass
	public void createPOMObject() {
		 loginOrSignUpPage = new LoginOrSignUpPage(driver);
		 homepage = new Homepage(driver);
		 logOutPage = new LogOutPage(driver);
	}
	
	@AfterClass
	  public void closePOMObject() {
		loginOrSignUpPage = null;
		homepage = null;
		logOutPage = null;
	  }
	  
	  
	
	@BeforeMethod
	public void launchLoginPage() throws IOException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	@ Test
	public void loginApplication() throws EncryptedDocumentException, IOException {
		testId = "TC01";
		
		
		String username = Utility.getDataFromExcelSheet(0,0,0);
		loginOrSignUpPage.sendUserName(username);
		
		String password = Utility.getDataFromExcelSheet(0,1,1);
		loginOrSignUpPage.sendPassWord(password);
		
		loginOrSignUpPage.clickLoginButton();
		String actualUrl="https://www.facebook.com/recover/initiate/?lara_product=www_account_switcher_no_pw_save";
		String expectedUrl= driver.getCurrentUrl();
		boolean result = expectedUrl.contains(actualUrl);
		SoftAssert soft = new SoftAssert();
		soft.assertFalse(result);
		soft.assertAll();
	}

  @Test 
  public void verifyNotificationFunctionality() throws InterruptedException {
	 
	    testId = "TC02";
		Thread.sleep(2000);
		
		
		homepage.clickOnnotificationIcon();
		homepage.clickOnThreeDots();
		homepage.clickOnMarkAllAsReadButton();
		
  }
  
  
 @Test
  public void logoutApplication() {
	 
		logOutPage.logoutPage();
		logOutPage.clickLogOutButton();
  }
  
@AfterMethod
public void takeScreenShot(ITestResult result) throws IOException {
	
	if(ITestResult.FAILURE==result.getStatus())
	{
		String testID=result.getName();
		Utility.captureScreenshot(driver, testID);
	}
	
}
  
  
  }

