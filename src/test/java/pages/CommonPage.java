package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import steps.BaseSteps;

/**
 * @author mofmo
 *this page is designed to develop all the common method in selenium
 *web driver  and assertion and java concept.
 *All the other class will use this common method appropriately
 *by implementing has-a-relationship concept.
 *If any other class need their own customize method, they will 
 *build their own method. and should not use common method. 
 */
public class CommonPage {
	
	private WebDriver driver;
	BaseSteps baseSteps;
	public CommonPage(BaseSteps baseSteps) {
		this.driver = baseSteps.getDriver();
	}
	public void openApplication(String URL) {
		driver.get(URL);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	public void AssetTittle(String actualTitle) {
		System.out.println(driver.getTitle());
		Assert.assertEquals("did not match",actualTitle, driver.getTitle());
		
	}
	
	public void AssetUrl(String actualUrl) {
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("did not match",actualUrl, driver.getCurrentUrl());
	}
	
   public void send(WebElement element, String enter) {
	   element.clear();
	   element.sendKeys(enter);
   }
   
   public void click(WebElement element) {
	   element.click();	  
   }
   
   public void getText(WebElement element) {
	  String text= element.getText();
	   System.out.println("Text is "+text);	  
   }
   public void dropDown(WebElement element, String visibleText) {
	   Select select = new Select(element);
	   select.selectByVisibleText(visibleText);
   }
    public void closeApplication() {
    	driver.close();
    }
}
