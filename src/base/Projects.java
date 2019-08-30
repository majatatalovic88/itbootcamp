package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Projects {
	
	static WebDriver driver;
	
	public Projects (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List<WebElement> listOfProject(){
		return driver.findElements(By.cssSelector("div.row.xxx"));
	}
	
	public void sizeListProject() {
		listOfProject().size();
	}
	
}
