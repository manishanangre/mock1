package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Bookspage;
import pages.BuildYourOwnComputerPage;
import pages.CartPage;
import pages.ComputerPage;
import pages.DesktopsPage;
import pages.EngagmentRingPage;
import pages.FahrenheitBookCartPage;
import pages.HeaderPage;
import pages.JewelryPage;
import utils.Utility;
import base.Browsers;

public class Webdrivermanagertestng extends Browsers{
	private WebDriver driver;
	private HeaderPage headerPage;
	private ComputerPage computerPage;
	private DesktopsPage desktopsPage;
	private BuildYourOwnComputerPage buildYourOwnComputerPage;
	private JewelryPage jewelryPage;
	private EngagmentRingPage engagmentRingPage;
	private Bookspage bookspage;
    private FahrenheitBookCartPage fahrenheitBookCartPage;
    private CartPage cartPage;
    private String testId;
	
	@Parameters("browser")
	
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome")){
			driver=launchChrome();
		}
		
		if(browserName.equals("FireFox")){
			driver=launchFireFox();
 		}
		
		if(browserName.equals("Edge")){
			driver=launchEdge();
 		}
	}
	
	
	
	@BeforeClass
	public void createPOMObject() {
		headerPage = new HeaderPage(driver);
		computerPage = new ComputerPage(driver);
		desktopsPage = new DesktopsPage(driver);
		buildYourOwnComputerPage = new BuildYourOwnComputerPage(driver);
		jewelryPage = new JewelryPage(driver);
		engagmentRingPage = new EngagmentRingPage(driver);
		bookspage = new Bookspage(driver);
		fahrenheitBookCartPage = new FahrenheitBookCartPage(driver);
		cartPage = new CartPage(driver);
		cartPage.clickContinueShopping();
}
	
	@BeforeMethod
	public void openHomePage()
	{
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();	
		headerPage.selectCurrency();
		cartPage.clickContinueShopping();
	
	}
	
	@Test
	public void VerifyAddtocartFunctionalityOnComputer() {
		
		headerPage.clickComputersPopUpTab();
		computerPage.clickDesktopsLink();
		desktopsPage.clickBuildYourOwnComputer();
		buildYourOwnComputerPage.clickRamDropDown();
		buildYourOwnComputerPage.clickHddCheckBox();
		buildYourOwnComputerPage.clickAddToCartButton();
		buildYourOwnComputerPage.clickShoppingCartButton();
		cartPage.clickContinueShopping();
	}
	@Test	
	public void verifyEngagmentRingCartFunctionality() {
		
		headerPage.clickJewelryPopUpTab();
		jewelryPage.clickEngagmentRingItem();
		engagmentRingPage.clickAddtocartButton();
		engagmentRingPage.clickShoppingCart();
		cartPage.clickContinueShopping();
	}
	
	@Test
	public void verifyFahrenheitBookCartFunctionality() {
		testId = "TC02";
		Assert.fail();
		
		headerPage.clickBooksPopUpTab();		
		bookspage.clickFahrenheitBook();
		fahrenheitBookCartPage.changeQuantityButton();
		fahrenheitBookCartPage.clickAddToCartButton();
		fahrenheitBookCartPage.clickShoppingCart();
		cartPage.clickContinueShopping();
	}
	
	@AfterMethod
	public void takeScreenShot(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus())
			{
				String testID=result.getName();
				Utility.captureScreenshot(driver, testID);
			}
	}
	
	@AfterClass
	public void closePOMObject() {
		headerPage = null;
		computerPage = null;
		desktopsPage = null;
		buildYourOwnComputerPage = null;
		jewelryPage = null;
		engagmentRingPage = null;
		bookspage = null;
		fahrenheitBookCartPage = null;
		cartPage = null;
	}
	
	@AfterTest
	public void AfterTest()
	{
		driver.quit();
		driver=null;
		System.gc();
	}
}
