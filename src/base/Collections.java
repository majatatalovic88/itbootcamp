package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Collections {
	
	static WebDriver driver;
	
	public Collections (WebDriver driver) {
		this.driver=driver;
	}
	

	//prvi je nevidljiv
	private static List<WebElement> listOfCollections(){
		return driver.findElements(By.cssSelector("div.results div.item-ia:not(.first-child)"));
	}
	
	private static List<WebElement> lisOfNavbar(){
	
		return driver.findElements(By.cssSelector("span.big-label.blue-pop a:not(.hidden)"));
	}
	
	
	private static List<WebElement> radioButton(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > form > div > fieldset > label > input[type=radio]"));
	}
	
	private static List<WebElement> listOfMediaType(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_mediatype.collapse > div.fatable.facet-mediatype > label > div > input[type=checkbox]"));
	}
	
	private static List<WebElement> boxMedia() {
		return driver.findElements(By.cssSelector("div.facet_mediatype.collapse"));
	}
	
	private static List<WebElement> listOfYear(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_year.collapse > div.fatable.facet-year > label > div > input[type=checkbox]"));
	}
	
	private static List <WebElement> boxYear() {
		return driver.findElements(By.cssSelector("div.facet_year.collapse"));
	}
	
	private static List<WebElement> listOfTopic(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_subject.collapse > div.fatable.facet-subject > label > div > input[type=checkbox]"));
	}
	
	private static List <WebElement> boxTopic() {
		return driver.findElements(By.cssSelector("div.facet_subject.collapse"));
	}
	private static List<WebElement> listOfColl(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_collection.collapse > div.fatable.facet-collection > label > div > input[type=checkbox]"));
	}
	private static List<WebElement> boxColl(){
		return driver.findElements(By.cssSelector("div.facet_collection.collapse"));
	}
	private static List<WebElement> listOfCreator(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_creator.collapse > div.fatable.facet-creator > label > div > input[type=checkbox]"));
	}
	
	private static List<WebElement> boxCreator(){
		return driver.findElements(By.cssSelector("div.facet_creator.collapse"));
	}
	private static List<WebElement> listOfLanguages(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div.facet_languageSorter.collapse > div.fatable.facet-languageSorter > label > div> input[type=checkbox]"));
	}
	
	private static List <WebElement> boxLanguages(){
		return driver.findElements(By.cssSelector("div.facet_languageSorter.collapse"));
	}
	
	private static List<WebElement> moreButton(){
		return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div > div > a"));
	}
	
	private static WebElement searchCollection() {
		return driver.findElement(By.cssSelector("#tabby-collection > div > div.columns-facets > form > input"));
	}
	
	private static List <WebElement> iconList(){
		return driver.findElements(By.cssSelector(".welcome-right a"));//hvata 6 elementa a treba 4
	}
	
}
