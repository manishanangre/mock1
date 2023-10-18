package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage {
	@FindBy (xpath =("//div[@class='products-wrapper']//a[@title='Show details for Fahrenheit 451 by Ray Bradbury']"))
	private WebElement fahrenheitBook;
	private WebDriver driver;
	

public Bookspage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
}
	
public void clickFahrenheitBook() {
	fahrenheitBook.click();
}
}
