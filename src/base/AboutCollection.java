package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutCollection {
	
	static WebDriver driver;
	
	public AboutCollection (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List<WebElement> listContributors(){
		return driver.findElements(By.cssSelector("div.about-box > div.items_list.person"));
	}
	
	private static List<WebElement> listOfGraphicon(){
		return driver.findElements(By.cssSelector("div.grafs.about-box"));
	}
	
	private static List<WebElement> listofTopRegions(){
		return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-5 > section > table > tbody > tr"));
	}
	
	private static List <WebElement> listOfRelatedColl(){
		return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-7 > div > ul > li > a"));
		
	}
	
	
	
	
	

}
