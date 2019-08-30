package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PeoplePage {
	
	static WebDriver driver;
	
	public PeoplePage (WebDriver driver) {
		this.driver=driver;
	}
	private static List <WebElement> listPeople(){
		return driver.findElements(By.cssSelector("div.bio div:not(.bio)"));
	}
	public List<String> getPeopleInfo() {
        
        List<String> infoPeople = new ArrayList<String>();
        for (int i = 0; i < listPeople().size(); i++) {
            String s = listPeople().get(i).findElement(By.cssSelector("b")).getText();
            String s1 = "";
            if(!(i==14 || i==15)) {
             s1 = listPeople().get(i).findElement(By.cssSelector("div.bio div:not(.bio):not(p) > i, a > i")).getText();
            }
            infoPeople.add(s + " " + s1);
        }
        return infoPeople;
    }
}

