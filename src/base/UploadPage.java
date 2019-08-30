package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage extends Base{
	
	static WebDriver driver;
	
	public UploadPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("a.buttonG.btn.btn-success"));
	}
	
	private static WebElement LiveMusicButton() {
		return driver.findElement(By.cssSelector("a.btn-primary"));
	}
	
	private static WebElement questionButton() {
		return driver.findElement(By.cssSelector("#createhelp h3 a"));
	}
	private static WebElement loginSignUp() {
		return driver.findElement(By.cssSelector("#maincontent > div > p"));
	}
	
	public String getloginSignUp() {
		return loginSignUp().getText();
	}
	
	
}
