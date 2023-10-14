package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	@FindBy (xpath=("//div[@class='x78zum5 x1n2onr6']"))
	private WebElement logoutIcon;
	
	@FindBy (xpath=("//div[@class='xu96u03 xm80bdy x10l6tqk x13vifvy']//span[text()='Log out']"))
	private WebElement logOutButton;
	private WebDriver driver;
	
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver = this.driver;
	}
	
	public void logoutPage() {
		logoutIcon.click();
	}
	public void clickLogOutButton() {
		logOutButton.click();
	}
	
	
}
