package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//a[@data-side-panel-trigger='account']")
	WebElement logIn;
	
	public void clickLogIn() throws InterruptedException {
		logIn.click();
		Thread.sleep(3000);
		
		pause(4);
		
	}
	
	

}
