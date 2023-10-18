package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	@FindBy (xpath=("(//a[text()=' Desktops '])[1]"))
	private WebElement desktopsLink;
	private WebDriver driver;
	
public ComputerPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;

}

public void clickDesktopsLink() {
	desktopsLink.click();
}

}