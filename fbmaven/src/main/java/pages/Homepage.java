package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy (xpath = ("(//div[@aria-label='Account controls and settings']//div[@class='x6s0dn4 x78zum5 x5yr21d xl56j7k x1emribx'])[1]"))
private WebElement notificationIcon;

@FindBy (xpath = ("(//div[@aria-label='Account controls and settings']//div[@class='x6s0dn4 x78zum5 x5yr21d xl56j7k x1emribx'])[2]"))
private WebElement messengerIcon;

@FindBy (xpath = ("//span[text()='New message requests']"))
private WebElement newMessageRequest;

@FindBy (xpath = ("(//div[@aria-label='Account controls and settings']//div[@class='x6s0dn4 x78zum5 x5yr21d xl56j7k x1emribx'])[3]"))
private WebElement createButton;

@FindBy (xpath = ("//span[text()='Post']"))
private WebElement createPost;
 
@FindBy (xpath = ("//div[@role='dialog']//div[@role='textbox']"))
private WebElement writePost;

@FindBy (xpath =("//div[@role='dialog']//div[@aria-label='Close']"))
private WebElement closePostTab;

@FindBy (xpath = ("(//div[@class='xu96u03 xm80bdy x10l6tqk x13vifvy']//div[@role='button'])[1]"))
private WebElement threeDots;

@FindBy (xpath = ("//span[text()='Mark all as read']"))
private WebElement markAllAsReadButton;

private WebDriver driver;

public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	driver = this.driver;
}

public void clickOnnotificationIcon() {
	//Actions act = new Actions(driver);
	notificationIcon.click();
}

public void clickOnThreeDots() {
	threeDots.click();
}
public void clickOnMarkAllAsReadButton() {
	markAllAsReadButton.click();
}
public void clickOnMessengerIcon() {
	messengerIcon.click();
}
public void clickOnNewMessageRequest() {
	newMessageRequest.click();
}
public void clickOnCreateButton() {
	createButton.click();
}
public void clickOnCreatePost() {
	createPost.click();
	writePost.sendKeys("manisha is tester");
	closePostTab.click();
}

}
