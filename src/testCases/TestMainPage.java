package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.MainPage;
import base.PageURLS;

public class TestMainPage {
	
 WebDriver driver;
 
 @BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\majat\\Desktop\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
 @Test
 public void testMain() throws Exception{
	driver.navigate().to(PageURLS.MAIN_PAGE);
	MainPage main=new MainPage(driver);
	Assert.assertTrue(main.sizeOfTopCollection()>20);
	for(int i = 0; i < main.getTextCollections().size(); i++) {
        Assert.assertTrue(main.getTextCollections().get(i).contains("ITEMS"));
    }
	
	}
 
 @Test
 public void testSearch() throws Exception{
	driver.navigate().to(PageURLS.MAIN_PAGE);
	MainPage main=new MainPage(driver);		
		
		main.clickOnsearchInput();
		Assert.assertTrue(main.getdivDropDown().isDisplayed());
		main.sendKeysSearch("qa");
		main.clickGoSearch();
		Assert.assertTrue(driver.getCurrentUrl().contains("?query=qa"));
				
 }
 
 @Test
 public void testTopCollection() throws Exception{
	 driver.navigate().to(PageURLS.MAIN_PAGE);
		MainPage main=new MainPage(driver);	
		
		String s=driver.findElements(By.cssSelector("div.num-items")).get(0).getText();
		int sc=Integer.parseInt(s.replaceAll("\\D",""));
	//	System.out.println(sc);
		main.getListOfTopCollections().get(0).click();
		
		String s1=driver.findElement(By.cssSelector("div.results_count")).getText();
		int sc1=Integer.parseInt(s1.replaceAll("\\D",""));
	//	System.out.println(sc1);
		
		Assert.assertTrue(s.contains(s1));
		
	//	Math.abs(sc1);
	//	Math.abs(sc);
	//	Assert.assertTrue(Math.abs(sc1-sc)<200);
 
 }
}


