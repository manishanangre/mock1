package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class BuildYourOwnComputerPage {
	@FindBy (xpath = ("//select[@id='product_attribute_2']"))
	private WebElement ramDropDown;

	@FindBy (xpath=("//input[@id='product_attribute_3_6']"))
	private WebElement hddCheckBox;

	@FindBy (xpath=("//button[@id='add-to-cart-button-1']"))
	private WebElement addToCartButton;

	@FindBy (xpath=("//li[@id='topcartlink']"))
	private WebElement shoppingCartButton;
	private JavascriptExecutor javaScriptExecutor;
	
	@FindBy (xpath=("//a[@href='/productreviews/1']"))
	private WebElement reviewButton;
	private WebDriver driver;


public BuildYourOwnComputerPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
    this.driver = driver;
	javaScriptExecutor  = (JavascriptExecutor)driver;

}



public void clickRamDropDown() {
	javaScriptExecutor.executeScript("window.scrollBy(0,2500)");
	Select s = new Select(ramDropDown);
	s.selectByIndex(1);
}
public void clickHddCheckBox() {
	hddCheckBox.click();
}
public void clickAddToCartButton() {
	addToCartButton.click();
}
public void clickShoppingCartButton() {
	shoppingCartButton.click();
}
}
