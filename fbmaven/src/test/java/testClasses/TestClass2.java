package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import module.SignUpForm;
import pages.LoginOrSignUpPage;

public class TestClass2 {
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.clickCreateNewAccountButton();
		
		SignUpForm signUpForm = new SignUpForm(driver);
		signUpForm.sendFirstName("Manisha");
		signUpForm.sendSurName("Nangre");
		signUpForm.mobileNumberOrEmailAdrress("manisha.nangare82@gmail.com");
		signUpForm.newPassword("manisha@123");
		
		signUpForm.dayDropDown();
		signUpForm.monthDropDown();
		signUpForm.yearDropDown();
		
		System.out.println("Test case pass");
		signUpForm.genderFemale();
		signUpForm.genderMale();
		System.out.println("Test case pass");
		
		signUpForm.custom();
		signUpForm.selectYourPronoun();
		signUpForm.gender("male");
		
		
	}

}
