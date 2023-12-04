package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import steps.BaseSteps;

/**
 * @author mofmo
 *Page Object Model pom designed RegistrationPage
 *Selenium 4 implement with @FindBy
 *With PageFactory.initElements
 *With cucumber-picocontainer to handle multiple constructor
 */
public class RegistrationPage {
	private WebDriver driver;
	BaseSteps baseSteps;
	public RegistrationPage(BaseSteps baseSteps) {
		this.driver = baseSteps.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@id, 'u_0_0_')]")public WebElement createAccount;
	@FindBy(name="firstname")public WebElement fristName;
	@FindBy(name="lastname")public WebElement lastName;
	@FindBy(name="reg_email__")public WebElement mobileEmail;
	@FindBy(name="reg_passwd__")public WebElement newPassword;
	@FindBy(id="month")public WebElement month;
	@FindBy(id="day")public WebElement day;
	@FindBy(id="year")public WebElement year;
	@FindBy(name="websubmit")public WebElement signup;
	
	//this method only apply to registration page== this is not a common method
	@FindBy(xpath="(//*[@class='_58mt'])[1]") private WebElement female;
	@FindBy(xpath="(//*[@class='_58mt'])[2]") private WebElement male;
	@FindBy(xpath="(//*[@class='_58mt'])[3]") private WebElement custom;
	
	public WebElement radioButton(String enterGender) {
		if (enterGender.equalsIgnoreCase("female")) {
			female.click();
		}else if (enterGender.equalsIgnoreCase("male")) {
			male.click();
		} else {
			custom.click();
		}
	
		return male;
	}
}
