package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage {
	@FindBy (xpath = ("(//a[text()='Computers '])[1]"))
	private WebElement computersPopUpTab ;
	
	@FindBy (xpath = ("(//a[text()='Electronics '])[1]"))
	private WebElement electonicsPopUpTab;
	
	@FindBy (xpath = ("(//a[text()='Apparel '])[1]"))
	private WebElement apparelPopUpTab;
	
	@FindBy (xpath = ("(//a[text()='Books '])[1]"))
	private WebElement booksPopUpTab;
	
	@FindBy (xpath = ("(//a[text()='Jewelry '])[1]"))
	private WebElement jewelryPopUpTab;
	
	@FindBy (xpath = ("(//a[text()='Gift Cards '])[1]"))
	private WebElement giftCardsPopUpTab;
	
	@FindBy (xpath = ("//select[@id='customerCurrency']"))
	private WebElement currency;
	private WebDriver driver;
	
public HeaderPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	
	this.driver = driver;
	}

public void clickComputersPopUpTab() {
	computersPopUpTab.click();
}

public void clickElectonicsPopUpTab() {
	electonicsPopUpTab.click();
}
public void clickApparelPopUpTab() {
	apparelPopUpTab.click();
}
public void clickBooksPopUpTab() {
	booksPopUpTab.click();
}
public void clickJewelryPopUpTab() {
	jewelryPopUpTab.click();
}
public void clickGiftCardsPopUpTab() {
	giftCardsPopUpTab.click();
}

public void selectCurrency() {
	Select s = new Select(currency);
	s.selectByIndex(1);
	
}

}