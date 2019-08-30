package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {
	
	static WebDriver driver;
	
	public HelpPage (WebDriver driver) {
		this.driver=driver;
	}

	private static WebElement searchHelp() {
		return driver.findElement(By.cssSelector("input#query"));
	}
	
	private static List <WebElement> buttons(){
		return driver.findElements(By.cssSelector("ul.blocks-list li"));
	}
	
	private static WebElement signIn() {
		return driver.findElement(By.cssSelector(".nav-wrapper a.login"));
	}
	
	public void clickOnButtons(int i) {
		buttons().get(i).click();
	}
	
	public void sendKeysToSearchHelp(String s) {
		searchHelp().sendKeys(s);
	}
	
	public void enterSearch() {	
	}
	
	public void clickSignIn() {
		signIn().click();
	}
}
