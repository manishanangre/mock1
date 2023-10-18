package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DesktopsPage {
	@FindBy (xpath = "//div[@class='products-wrapper']//a[@title='Show details for Build your own computer']")
	private WebElement buildYourOwnComputer;
	private JavascriptExecutor javaScriptExecutor;
	private WebDriver driver;
	
	public DesktopsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		javaScriptExecutor  = (JavascriptExecutor)driver;
		this.driver = driver; 
		
	}
	
	public void clickBuildYourOwnComputer() {
		javaScriptExecutor.executeScript("window.scrollBy(0,500)");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(buildYourOwnComputer));
		buildYourOwnComputer.click();
		
	}

}
