package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FahrenheitBookCartPage {
			@FindBy (xpath = ("(//button[text()='Add to cart'])[1]"))
			private WebElement addToCartButton;
			
			@FindBy (xpath = ("//input[@id='product_enteredQuantity_37']"))
			private WebElement quantityButton;
			
			@FindBy (xpath = ("//span[text()='Shopping cart']"))
			private WebElement shoppingCart;
			private WebDriver driver;
			
			
		public FahrenheitBookCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		public void changeQuantityButton() {
			quantityButton.sendKeys("2");
		}
		public void clickAddToCartButton() {
			addToCartButton.click();
		}
		public void clickShoppingCart() {
			shoppingCart.click();
		}	
		
}
