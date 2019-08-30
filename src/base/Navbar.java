package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navbar {
	
	static WebDriver driver;
	
	public Navbar (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List <WebElement> listNavbarMenu(){
		return driver.findElements(By.cssSelector("ul#nav-abouts li"));
	}
	
	public void clickOnNavbarMenu(int i) {
		listNavbarMenu().get(i).click();
	}
	

}
