package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm {

	@FindBy (xpath = ("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"))
	private WebElement firstName;
	
	@FindBy (xpath = ("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"))
	private WebElement surname;
	
	@FindBy (xpath = ("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"))
	private WebElement mobileNumberOrEmailAdrress;
	
	@FindBy (xpath = ("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"))
	private WebElement newPassword;
	
	@FindBy (xpath = ("//select[@aria-label='Day']"))
	private WebElement dayDropDown;
	
	@FindBy (xpath = ("//select[@aria-label='Month']"))
	private WebElement monthDropDown;
	
	@FindBy (xpath = ("//select[@aria-label='Year']"))
	private WebElement yearDropDown;
	
	@FindBy (xpath = ("//label[text()='Female']")) 
	private WebElement genderFemale;
	
	@FindBy (xpath = ("//label[text()='Male']"))
	private WebElement genderMale;
	
	@FindBy (xpath = ("//label[text()='Custom']"))
	private WebElement custom;
	
	@FindBy (xpath = ("(//button[text()='Sign Up'])[1]"))
	private WebElement signUpButton;
	
	@FindBy (xpath = ("//select[@aria-label='Select your pronoun']"))
	private WebElement selectYourPronoun;

	@FindBy (xpath = ("//input[@id='u_g_q_HW']"))
	private WebElement gender;
	
	
public SignUpForm(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void sendFirstName(String name)
{
	firstName.sendKeys(name);
	}

public void sendSurName(String surName) {
	surname.sendKeys(surName);
}

public void mobileNumberOrEmailAdrress(String mobileOrEmailAdrress) {
	mobileNumberOrEmailAdrress.sendKeys(mobileOrEmailAdrress);
}
public void newPassword(String passWord) {
	newPassword.sendKeys(passWord);
}
public void dayDropDown() {
	Select s = new Select(dayDropDown);
	s.selectByIndex(8);
}
public void monthDropDown() {
	Select s = new Select(monthDropDown);
	s.selectByIndex(2);
}
public void yearDropDown() {
	Select s = new Select(yearDropDown);
	s.selectByIndex(1);
}
public void genderFemale() {
	Boolean result = genderFemale.isSelected();
	if(result==true)
	{
		System.out.println("Test Case Fail. Element already Selected");
	}
	else
	{
		System.out.println("Test Case Pass. Element is not Selected");
		genderFemale.click();
	}
}
public void genderMale() {
	Boolean result = genderMale.isSelected();
	if(result==true)
	{
		System.out.println("Test Case Fail. Element already Selected");
	}
	else
	{
		System.out.println("Test Case Pass. Element is not Selected");
		genderMale.click();
	}
}
public void custom() {
	Boolean result = custom.isSelected();
	if(result==true)
	{
		System.out.println("Test Case Fail. Element already Selected");
	}
	else
	{
		System.out.println("Test Case Pass. Element is not Selected");
		custom.click();
	}
}

public void selectYourPronoun() {
	Boolean result = selectYourPronoun.isDisplayed();
	if(result==true)
	{
		System.out.println("Test Case Pass. Element is Displayed");
	}
	else
	{
		System.out.println("Test Case Fail. Element is not Dispalyed");
	}
	System.out.println(result);
	
	Select s = new Select(selectYourPronoun);
	s.selectByIndex(2);

}

public void gender(String Gender) {
	gender.sendKeys(Gender);
}

public void signUpButton() {
	signUpButton.click();
}





}




















