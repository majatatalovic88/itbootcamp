package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage {
	
	static WebDriver driver;
	
	public BlogPage (WebDriver driver) {
		this.driver=driver;
	}
	
private static List <WebElement> listNavbarBlog(){
	return driver.findElements(By.cssSelector("ul#menu-menu li"));
}

private static List<WebElement> listFacebookTwitter(){
	return driver.findElements(By.cssSelector(".archive-sharing-widget a"));
}
private static WebElement dropDownArchive() {
	return driver.findElement(By.cssSelector("select#archives-dropdown-2"));
}
private static List<WebElement> listDropdown(){
	return driver.findElements(By.cssSelector("#archives-dropdown-2 > option"));
}
private static WebElement searchInputContact() {
	return driver.findElement(By.cssSelector("input#s"));
}
private static WebElement searchButtonContact() {
	return driver.findElement(By.id("searchsubmit"));
}
private static List<WebElement> listOfPosts(){
	return driver.findElements(By.cssSelector("div.category-news"));
}//id=post-

public void clickOnFacebook() {
	listFacebookTwitter().get(0).click();
}
public void clickOnTwitter() {
	listFacebookTwitter().get(1).click();
}

public void sendInSearchCon(String s) {
	searchInputContact().sendKeys(s);
}

public void clickButtonContact() {
	searchButtonContact().click();
}

public void clickOnDropDown() {
 dropDownArchive().click();
}

public void clickOnlistDropDown(int i) {
	listDropdown().get(i).click();
}


}
