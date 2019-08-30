package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvanceSearch {

	static WebDriver driver;
	
	public AdvanceSearch (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List <WebElement> customField(){
		return driver.findElements(By.cssSelector("#searchForm .col-sm-2 .input-sm"));
	}
	
	private static List<WebElement> dropDowns(){
		return driver.findElements(By.cssSelector("#searchForm .col-sm-2 > select"));
	}
	
	private static List<WebElement> inputField(){
		return driver.findElements(By.cssSelector("#searchForm .col-sm-7 > input"));
	}
	private static WebElement mediaTypes() {
		return driver.findElement(By.name("mediatype_query"));
	}
	private static List <WebElement> dateList(){
		return driver.findElements(By.cssSelector("div.row:nth-child(10) > div:nth-child(3) > select"));
	}
	private static List <WebElement> dateRangeList(){
		return driver.findElements(By.cssSelector("div.row:nth-child(11) > div:nth-child(3) > select"));
	}
	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("#searchForm > center > input.btn.btn-primary"));
	}
	
	private static WebElement queryInput() {
		return driver.findElement(By.cssSelector("#rawform > input"));
	}
	
	private static List<WebElement> pickOne(){
		return driver.findElements(By.cssSelector("#rawform > div:nth-child(4) > select > option"));
	}
	
	private static List<WebElement> sortResult(){
		return driver.findElements(By.cssSelector("#rawform > div:nth-child(5) > select"));
	}
	private static WebElement numberResults() {
		return driver.findElement(By.id("numresults"));
	}
	private static WebElement page() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > span > input"));
	}
	
	private static List<WebElement> checkList(){
		return driver.findElements(By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr > td > input[type=radio]"));
	}
	
	private static WebElement saveXML() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr:nth-child(2) > td:nth-child(1) > input[type=checkbox]"));
	}
	
	private static WebElement showHide() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > table > tbody > tr:nth-child(4) > td:nth-child(1) > a"));
	}
	
	private static WebElement searchButtonXML() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > input.btn.btn-primary"));
	}
	
	
	
	
}
