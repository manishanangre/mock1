package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuildYourOwnComputerPage;
import pages.CartPage;
import pages.ComputerPage;
import pages.DesktopsPage;
import pages.HeaderPage;

public class TestClass1 {
public static void main(String[]args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/"); 
driver.manage().window().maximize();

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

CartPage cartPage = new CartPage(driver);
cartPage.clickContinueShopping();

}
}
