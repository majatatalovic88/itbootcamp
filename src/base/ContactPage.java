package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	static WebDriver driver;
	
	public ContactPage (WebDriver driver) {
		this.driver=driver;
	}
	
private static List <WebElement> listMaps(){
	return driver.findElements(By.cssSelector(".container-ia > a > img"));
}

public void clickOnMap(int i) {
	listMaps().get(i).click();
}


}
