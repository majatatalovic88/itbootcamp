package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;



public class MainPage extends Base {
	
	static WebDriver driver;
	
	public MainPage (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List<WebElement> listOfTopCollectionArchive(){
		return driver.findElements(By.cssSelector("div.collection-ia"));
	}
	
	private static List <WebElement> listInternetArchive(){
		return driver.findElements(By.cssSelector(".mt-big a"));
	}
	
	private static WebElement searchInput() {
		return driver.findElement(By.cssSelector("input.js-search-bar"));
	}
	private static WebElement goSearch() {
		return driver.findElement(By.cssSelector("button.input-sm"));
	}
	private static WebElement divDropDown() {
		return driver.findElement(By.cssSelector("div#search_options"));
	}
	private static List<WebElement>searchDropDown() {
		return driver.findElements(By.cssSelector("div#search_options label"));
	}
	
	private static WebElement advanceSearchLink() {
		return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}
	
	private static WebElement seeMoreLink() {
		return driver.findElement(By.cssSelector(".hero-right a.stealth"));
	}
	
	//Actions
	
	public int sizeOfTopCollection() {
	return listOfTopCollectionArchive().size();
	}
	
	public List<String> getTextCollections() {
	       List<String> TextList = new ArrayList<String>();
	        for (int i = 0; i < sizeOfTopCollection(); i++) {
	               TextList.add(listOfTopCollectionArchive().get(i)
	                       .findElement(By.cssSelector("div.item-ia.collection-ia div.num-items.topinblock")).getText());
	           }
	           return TextList;
	}
	
	
	public void clickOnArchiveIcon(int i) {
		listInternetArchive().get(i).click();
	}
	
	public void clickOnsearchInput() {
		searchInput().click();
	}
	public void sendKeysSearch(String s) {
		searchInput().sendKeys(s);
	}
	public void clickGoSearch() {
		goSearch().click();
	}
	
	public WebElement getsearchInput() {
		return searchInput();
	}
	
	public WebElement getdivDropDown() {
		return divDropDown();
	}
	
	public List<WebElement> getListOfTopCollections() {
	 return	listOfTopCollectionArchive();
	}
	
 
	
}


