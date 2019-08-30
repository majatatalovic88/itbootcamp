package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WayBackMachineSearch {
	
	static WebDriver driver;
	
	public WayBackMachineSearch (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List<WebElement> listSearching(){
		return driver.findElements(By.cssSelector("ul.result-list li.result-item"));
	}
	
	

}
