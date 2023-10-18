package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	@FindBy (xpath =("//div[@class='item-box']//a[text()='Vintage Style Engagement Ring']"))
	private WebElement engagmentRingItem;
	private WebDriver driver;
	
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		driver = this.driver;
	}
	public void clickEngagmentRingItem() {
		engagmentRingItem.click();
	}
//	public String getProductname() {
//		String text = engagmentRingItem.getText();
//		return text;
//	}
	
	
	
}
