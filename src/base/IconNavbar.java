package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IconNavbar extends Base {

	static WebDriver driver;
	
	public IconNavbar (WebDriver driver) {
		this.driver=driver;
	}

	private List <WebElement> listOfIcon(){
		return driver.findElements(By.cssSelector("ul.navbar-main li.pull-left"));
	}
	
	//Web
	private static WebElement webSearchInput() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}
	 private static WebElement webpageLink() {
		 return driver.findElement(By.cssSelector(".wayback-txt a"));
	 }
	 private static WebElement logoWeb() {
		 return driver.findElement(By.cssSelector(".wayback-main img"));
	 }
	 
	//
	 private static List <WebElement> listIconCycle(){
		 return driver.findElements(By.cssSelector(".items_list_img a"));
	 }
	 private static List <WebElement> listOfLinks(){
		 return driver.findElements(By.cssSelector(".linx a"));
	 }
	
	 private static WebElement logo() {
		 return driver.findElement(By.cssSelector("a.navbar-brand"));
	 }
	 
	 private static WebElement signIn() {
		 return driver.findElement(By.cssSelector("a.nav-user"));
	 }
	 
	 private static WebElement user() {
		 return driver.findElement(By.cssSelector(".leftmost>a"));
	 }
	 
	 private static WebElement upload() {
		 return driver.findElement(By.cssSelector("a.nav-upload"));
	 }
	 
	 private static WebElement searchMini() {
		 return driver.findElement(By.cssSelector("input.js-search-bar"));
	 }
	 
	
	 

	// Actions

	public void sendInputToMini(String a) {
		searchMini().sendKeys(a);	
	}
	
	public void enterSearchMini() {
		searchMini().sendKeys(Keys.ENTER);
	}
	
	public void clickOnIcon(int i) {
		listOfIcon().get(i).click();
		
	}
	
	public void clickOnFirstCycle() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(listIconCycle().get(0))); 
		listIconCycle().get(0).click();
	
		
	}
	public void clickOnSecondCycle() {
		listIconCycle().get(1).click();
	}
	
	public void clickOnLink(int i) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(listOfLinks().get(i))); 
		listOfLinks().get(i).click();
		
	}
	
	public void clickOnLogo() {
	logo().click();
	}
	
	public void clickOnUpload() {
		 upload().click();
	}
	
	public void clickOnSignIn() {
		signIn().click();
}
	public void clickOnUser() {
		user().click();
	}
	public void sendInputToWebSearch(String s) {
	webSearchInput().sendKeys(s);
}
	public void enterWebSearch() {
		webSearchInput().sendKeys(Keys.ENTER);
	}
	
}
