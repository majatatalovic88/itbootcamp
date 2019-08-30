package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleNews {
	
	static WebDriver driver;
	
	public SingleNews (WebDriver driver) {
		this.driver=driver;
	}
	
	private static WebElement singleNews() {
		return driver.findElement(By.className(".well-sm"));
	}

}
