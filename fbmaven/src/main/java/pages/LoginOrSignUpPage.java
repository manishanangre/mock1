package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	//variable private
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath ="//input[@id='pass']")
	private WebElement passWord;
	
	@FindBy (xpath ="//button[text()='Log in']" )
	private WebElement logInButton;
	
	@FindBy (xpath ="//a[text()='Forgotten password?']" )
	private WebElement forgotPasswordLink;
	
	@FindBy (xpath ="//a[text()='Create new account']" )
	private WebElement createNewAccountButton;



//constructor public

public LoginOrSignUpPage(WebDriver driver)
{
	//To Find element
	PageFactory.initElements(driver, this);
	
	}

//methods public

public void sendUserName(String user) {
	userName.sendKeys(user);
	}

public void sendPassWord(String pass) {
	
	passWord.sendKeys(pass);
}

public void clickLoginButton(){
	
	logInButton.click();
}

public void clickForgotPassWordLink() {
	forgotPasswordLink.click();
}

public void clickCreateNewAccountButton() {
	createNewAccountButton.click();
}

public void signIn() {
	
	userName.sendKeys("manisha.nangare82@gmail.com");
	passWord.sendKeys("manisha@123");
	logInButton.click();
	
}

	
}


