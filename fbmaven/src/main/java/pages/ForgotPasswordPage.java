package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	@FindBy (xpath = ("//div[contains(text(),'Please enter your email address')]"))
	private WebElement textMessage;
	
	@FindBy (xpath = ("//input[@id='identify_email']") )
	private WebElement enterEmail;
	
	@FindBy (xpath = ("(//a[@role='button'])[1]"))
	private WebElement cancleButton;
	
	@FindBy (xpath =("//button[@id='did_submit']"))
	private WebElement searchButton;
	
	public ForgotPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String getForgotMessage() {
	String msg	= textMessage.getText();
	return msg;
	}
	
	public void sendEmail() {
		enterEmail.sendKeys("manisha.nangare82@gmail.com");
	}
	
	public void clickButton() {
		cancleButton.click();
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
}
