package base;

import org.openqa.selenium.By;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp extends Base {

	static WebDriver driver;
	
	public SignUp (WebDriver driver) {
		this.driver=driver;
	}
	
	private static WebElement termsLink() {
		return driver.findElement(By.cssSelector("div.terms a"));
		
	}
	public void clickOnTermsLink() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(termsLink())); 
		termsLink().click();
	}
	
	public String getChildWindow() {
	    Set<String> window = driver.getWindowHandles();
	   Iterator iterator = window.iterator();
	   String currentWindowId = null;
	   String mainPage = driver.getWindowHandle();
	   while(iterator.hasNext()){
	       currentWindowId = iterator.next().toString();
	       // Takes the url from child window
	       if (!currentWindowId.equals(mainPage)){
	           driver.switchTo().window(currentWindowId);
	       }
	   }
	   return driver.getCurrentUrl();
	    }
	
	
}
