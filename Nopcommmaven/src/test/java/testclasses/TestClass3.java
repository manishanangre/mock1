package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CartPage;
import pages.EngagmentRingPage;
import pages.HeaderPage;
import pages.JewelryPage;

public class TestClass3 {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.clickJewelryPopUpTab();
		
		JewelryPage jewelryPage = new JewelryPage(driver);
		jewelryPage.clickEngagmentRingItem();
		
		EngagmentRingPage engagmentRingPage = new EngagmentRingPage(driver);
		engagmentRingPage.clickAddtocartButton();
		engagmentRingPage.clickShoppingCart();
		
		CartPage cartPage = new CartPage(driver);
		cartPage.clickContinueShopping();
		
}}
