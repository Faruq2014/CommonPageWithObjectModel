package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.RegistrationPage;

/**
 * @author mofmo
 *RegistrationStep build has-a-relation-ship with all the 
 *necessary class such as: 
 *  BaseSteps
 *  CommonPage
 *  RegistrationPage
 *  With cucumber-picocontainer to handle multiple constructor
 */
public class RegistrationStep {
	  private WebDriver driver;
	  BaseSteps baseSteps;
	  CommonPage commonPage;
	  RegistrationPage registrationPage;
	  
	  public RegistrationStep(BaseSteps baseSteps, CommonPage commonPage,
			RegistrationPage registrationPage) {
		this.driver = baseSteps.getDriver();
		this.commonPage = commonPage;
		this.registrationPage = registrationPage;
	}
	


	@Given("user open facebook application")
	public void userOpenFacebookApplication() {
		commonPage.openApplication("https://www.facebook.com/");
		commonPage.click(registrationPage.createAccount);
	}
	@When("user input {string} and {string}")
	public void userInputAnd(String firstName, String lastName) {
		//send method come from common page and firstName come from registration page
		commonPage.send(registrationPage.fristName, firstName);
		commonPage.send(registrationPage.lastName, lastName);
	}
	@When("user enter {string}")
	public void userEnter(String mobileEmail) {
		commonPage.send(registrationPage.mobileEmail, mobileEmail);
	}

	@When("user enter new password {string}")
	public void userEnterNewPassword(String passowrd) {
		commonPage.send(registrationPage.newPassword, passowrd); 
	}

	@When("user enter {string} and {string} and {string}")
	public void userEnterAndAnd(String month, String day, String year) {
		commonPage.dropDown(registrationPage.month, month);
		commonPage.dropDown(registrationPage.day, day);
		commonPage.dropDown(registrationPage.year, year);
	}

	@When("user select {string}")
	public void userSelect(String gender) {
		//this method directly come from registration page
		registrationPage.radioButton(gender);
	}



	@When("user click reg button")
	public void userClickRegButton() {
		System.out.println(" should not click sign up button unnecessary ");
		//commonPage.click(registrationPage.signup);
	}
	@Then("I verify registration page is created")
	public void iVerifyRegistrationPageIsCreated() {
		System.out.println(" Validation not implemented yet");
	}




}
