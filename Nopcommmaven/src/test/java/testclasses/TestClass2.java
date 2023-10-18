package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Bookspage;
import pages.HeaderPage;
import pages.FahrenheitBookCartPage;
import pages.CartPage;

public class TestClass2 {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.clickBooksPopUpTab();
		
		Bookspage bookspage = new Bookspage(driver);
		bookspage.clickFahrenheitBook();
		
		FahrenheitBookCartPage fahrenheitBookCartPage = new FahrenheitBookCartPage(driver);
		fahrenheitBookCartPage.changeQuantityButton();
		fahrenheitBookCartPage.clickAddToCartButton();
		fahrenheitBookCartPage.clickShoppingCart();
		
		CartPage cartPage = new CartPage(driver);
		cartPage.clickContinueShopping();
		
	}

}
