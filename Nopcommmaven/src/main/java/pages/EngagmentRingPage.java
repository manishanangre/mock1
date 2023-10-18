package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EngagmentRingPage {
	@FindBy (xpath = ("//div[@class='add-to-cart']//button[@type='button']"))
	private WebElement addtocartButton;
	
	@FindBy (xpath = ("//span[text()='Shopping cart']"))
	private WebElement shoppingCart;
	
	@FindBy (xpath = ("//h1[text()='Vintage Style Engagement Ring']"))
	private WebElement productName;
	private WebDriver driver;
	
	
public EngagmentRingPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	driver = this.driver;
	
	}

//public String getProductName() {
//	String ExpectedText = productName.getText();
//	return ExpectedText;
//}

public void clickAddtocartButton()
{
//	JavascriptExecutor javaScriptExecutor  = (JavascriptExecutor)driver;
//	javaScriptExecutor.executeScript("window.scrollBy(0,2500)");
	addtocartButton.click();
	
}

public void clickShoppingCart() {
	shoppingCart.click();
}

}
