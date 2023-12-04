package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.LoginPage;

/**
 * @author mofmo
  *RegistrationStep build has-a-relation-ship with all the 
 *necessary class such as: 
 *  BaseSteps
 *  CommonPage
 *  RegistrationPage
 *  With cucumber-picocontainer to handle multiple constructor
 */
public class LoginStep {
    private WebDriver driver;
    BaseSteps baseSteps;
    CommonPage commonPage;
    LoginPage loginPage;
    
	public LoginStep(BaseSteps baseSteps,CommonPage commonPage, LoginPage loginPage) {
		this.driver = baseSteps.getDriver();
		this.commonPage=commonPage;
		this.loginPage =loginPage;
	}

	@Given("user open application")
	public void userOpenApplication() {
		//driver.get("https://www.ebay.com/");
		commonPage.openApplication("https://www.facebook.com/");
	}
	@When("user login")
	public void userLogin() {
		commonPage.send(loginPage.userName, "jj@jmail.com");
		commonPage.send(loginPage.password, "jjhhh");
		commonPage.click(loginPage.loginButton);
	}
	@Then("user verify title and url")
	public void userVerifyTitleAndUrl() {
		String actualTitle="Facebook - log in or sign up";
		commonPage.AssetTittle(actualTitle);
		//String actualUrl="https://www.facebook.com/";
		//commonPage.AssetUrl(actualUrl);
		//commonPage.closeApplication();
	}



}
