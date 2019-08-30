package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn extends Base {
	
	static WebDriver driver;
	
	public LogIn (WebDriver driver) {
		this.driver=driver;
	}
	
	private static WebElement inputMail() {
		return driver.findElement(By.cssSelector(".form-element.input-email"));
	}
	
	private static WebElement inputPass() {
		return driver.findElement(By.className("input-password"));
	}
	private static WebElement keepLogin() {
		return driver.findElement(By.className("input-checkbox"));	
	}
	private static WebElement forgotPass() {
		return driver.findElement(By.className("reset-password"));
	}
	private static WebElement viewPass() {
		return driver.findElement(By.className("password_icon"));
	}
	private static WebElement buttonLogin() {
		return driver.findElement(By.className("input-submit"));
	}
	private static WebElement singUpForFree() {
		return driver.findElement(By.cssSelector(".login-header a"));
	}
	private static WebElement loginMessage() {
		return driver.findElement(By.cssSelector("span.login-error.password-error"));
	}
	
	//Actions
	
	public void sendMail(String s) {
		inputMail().sendKeys(s);
	}
	public void sendPass(String s) {
		inputPass().sendKeys(s);
	}
	public void clickOnLoginBtn() {
		buttonLogin().click();
	}
	
	public WebElement getForgottPass() {
		return forgotPass();
	}
	
	public void clickOnSingFree() {
		singUpForFree().click();
	}
	
	public WebElement getLoginButton() {
		return buttonLogin();
	}
	
	public String getLoginMessage() {
		return loginMessage().getText();
	}
	
	
}
