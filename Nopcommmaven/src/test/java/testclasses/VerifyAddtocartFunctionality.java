package testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

public class VerifyAddtocartFunctionality {
	
private WebDriver driver;	
//@BeforeTest

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver =new ChromeDriver(options);

}
	@BeforeMethod
	public void openHomePage() 
	{
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();	
		HeaderPage headerPage = new HeaderPage(driver); 
		headerPage.selectCurrency(); 
	}
	
	@Test
	public void VerifyAddtocartFunctionalityOnComputer() {
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.clickComputersPopUpTab();

		ComputerPage computerPage = new ComputerPage(driver);
		computerPage.clickDesktopsLink();

		DesktopsPage desktopsPage = new DesktopsPage(driver);
		desktopsPage.clickBuildYourOwnComputer();
			
		BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage(driver);
		buildYourOwnComputerPage.clickRamDropDown();
		buildYourOwnComputerPage.clickHddCheckBox();
		buildYourOwnComputerPage.clickAddToCartButton();
		buildYourOwnComputerPage.clickShoppingCartButton();
	}
	@Test	
	public void verifyEngagmentRingCartFunctionality() {
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.clickJewelryPopUpTab();
		
		JewelryPage jewelryPage = new JewelryPage(driver);
		jewelryPage.clickEngagmentRingItem();
//		String actualResult = jewelryPage.getProductname();
//		System.out.println(actualResult);
		
		EngagmentRingPage engagmentRingPage = new EngagmentRingPage(driver);
//		String expectedResult = engagmentRingPage.getProductName();
//		System.out.println(expectedResult);
		 
//		boolean result=expectedResult.contains(actualResult);
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(result);
		
		engagmentRingPage.clickAddtocartButton();
		engagmentRingPage.clickShoppingCart();
			
//		softAssert.assertAll();
	}
	
	@Test
	public void verifyFahrenheitBookCartFunctionality() {
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.clickBooksPopUpTab();
		
		Bookspage bookspage = new Bookspage(driver);
		bookspage.clickFahrenheitBook();
		
		FahrenheitBookCartPage fahrenheitBookCartPage = new FahrenheitBookCartPage(driver);
		fahrenheitBookCartPage.changeQuantityButton();
		fahrenheitBookCartPage.clickAddToCartButton();
		fahrenheitBookCartPage.clickShoppingCart();
	}
	
	@AfterMethod
	public void verifyConinueShoppingFunctionality() {
		CartPage cartPage = new CartPage(driver);
		cartPage.clickContinueShopping();
	}
	
	@AfterClass
	public void closeBrowser() {
		if (driver != null) {
		driver.close();}
	}
	
}
