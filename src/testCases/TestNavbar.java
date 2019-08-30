package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.IconNavbar;
import base.LogIn;
import base.MainPage;
import base.PageURLS;
import base.SignUp;
import base.UploadPage;


public class TestNavbar {
	
	private static final String URL_TERMS="terms";
	
	 WebDriver driver;
	 
	 @BeforeTest
		public void setup() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\majat\\Desktop\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	@Test
	
	 public void testNavIcon() throws Exception{
		driver.navigate().to(PageURLS.MAIN_PAGE);
		IconNavbar inav= new IconNavbar(driver);
		LogIn log= new LogIn (driver);
		inav.clickOnSignIn();
		Assert.assertTrue(driver.getPageSource().contains("Forgot password"));
		log.clickOnSingFree();
		SignUp up=new SignUp (driver);
		up.clickOnTermsLink();
		Thread.sleep(8000);
		Assert.assertTrue(up.getChildWindow().toLowerCase().contains(URL_TERMS));
		
	}
/*	
	@Test
	public void testNavBar() throws Exception{
		driver.navigate().to(PageURLS.MAIN_PAGE);
		IconNavbar inav= new IconNavbar(driver);
		inav.clickOnIcon(1);
		inav.clickOnLink(0);
		String s=driver.getCurrentUrl();
		driver.navigate().back();
		Thread.sleep(5000);
		MainPage main= new MainPage(driver);
		main.clickOnArchiveIcon(1);
		String s1=driver.getCurrentUrl();
		Assert.assertEquals((s), (s1));
	}

	@Test
	public void testUpload() throws Exception{
		driver.navigate().to(PageURLS.MAIN_PAGE);
		IconNavbar inav= new IconNavbar(driver);
		inav.clickOnUpload();
		UploadPage up =new UploadPage(driver);
		Thread.sleep(5000);
		Assert.assertTrue(up.getloginSignUp().contains("Log in or Sign up"));
	}

/*	
	@Test
	public void testSignIn() throws Exception{
		driver.navigate().to(PageURLS.MAIN_PAGE);
		IconNavbar inav= new IconNavbar(driver);
		inav.clickOnSignIn();
		LogIn log=new LogIn(driver);
		Assert.assertTrue(log.getLoginButton().isDisplayed());
		log.sendMail("foo@gmail.com");
		log.sendPass("bar");
		log.clickOnLoginBtn();
		Assert.assertTrue(log.getLoginMessage().contains("Email address and/or Password incorrect"));
	}
*/	

}


