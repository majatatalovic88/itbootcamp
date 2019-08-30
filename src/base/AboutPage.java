package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {
	
	static WebDriver driver;
	
	public AboutPage (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List<WebElement> listOfNews(){
		return driver.findElements(By.cssSelector("tr.forumRow"));
		
	}
	
	public static WebElement more() {
		return driver.findElement(By.cssSelector("div.box > h1 > a"));
	}
	
	public void clickOnMore() {
		more().click();
	}
	
	public void sizeListOfNews() {
		listOfNews().size();
	}
	

}
