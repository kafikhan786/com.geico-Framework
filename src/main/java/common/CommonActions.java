package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
	WebDriver driver;
	
	public static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (NoSuchElementException | NullPointerException e) {
			System.out.println("Exception is: "+ e);
		}
	
	}
	
	public static void pause(long sec) {
		
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
