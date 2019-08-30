package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Donate {
	
	static WebDriver driver;
	
	public Donate (WebDriver driver) {
		this.driver=driver;
	}
	
	private static List <WebElement> listOfAmount(){
		return driver.findElements(By.cssSelector(".donation-radio-list.donationlevel> li"));
	}
	private static WebElement otherAmount() {
		return driver.findElement(By.id("amount_custom"));
	}
	
	public void clickOnAmount(int i) {
		listOfAmount().get(i).click();
	}
	
	public void sendKeysAmount(String s) {
		otherAmount().sendKeys(s);
	}
	
	
	
	

}
