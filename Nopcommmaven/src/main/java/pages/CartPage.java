package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	@FindBy (xpath = ("//div[@class='common-buttons']//button[@name='continueshopping']"))
	private WebElement continueShopping;
	
	private WebDriver driver;

public CartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	
	
}

public void clickContinueShopping() {
	
	continueShopping.click();
}



}
