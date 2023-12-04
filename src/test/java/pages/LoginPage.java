package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.BaseSteps;

/**
 * @author mofmo
 *Page Object Model pom designed Login page
 *Selenium 4 implement with @FindBy
 *With PageFactory.initElements
 *With cucumber-picocontainer to handle multiple constructor
 */
public class LoginPage {
	private WebDriver driver;
	BaseSteps baseSteps;
	public LoginPage(BaseSteps baseSteps) {
		this.driver = baseSteps.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")public WebElement userName;
	@FindBy(id="pass")public WebElement password;
	@FindBy(name="login")public WebElement loginButton;
	

}
