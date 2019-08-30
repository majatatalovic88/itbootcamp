package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class News {
	
	static WebDriver driver;
	
	public News (WebDriver driver) {
		this.driver=driver;
	}
	private static List<WebElement> newsFeedList() {
        return driver.findElements(By.cssSelector("tr.forumRow"));
}
	private static WebElement iconMail () {
		return driver.findElement(By.cssSelector("#maincontent > div > div > h1 > a:nth-child(1)"));
	}

}
