package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {
	
	static WebDriver driver;
	
	public JobsPage (WebDriver driver) {
		this.driver=driver;
	}
	
private static WebElement searchJobs() {
	return driver.findElement(By.id("q"));
}

private static WebElement searchButtonJobs() {
	return driver.findElement(By.cssSelector("a#btn_search_jobs"));
}

private static WebElement linkAdvanceSearch() {
	return driver.findElement(By.id("link_show_advanced_search"));
}

private static List<WebElement> listGeneratedElements(){
	return driver.findElements(By.cssSelector("table#jobs_table tr:not(:first-child)"));
}

public void sizeOfElements() {
	listGeneratedElements().size();
}
public void sendInputSearchJob(String s) {
	searchJobs().sendKeys(s);
}
public void clickOnSearchBtn() {
	searchButtonJobs().click();
}
}
