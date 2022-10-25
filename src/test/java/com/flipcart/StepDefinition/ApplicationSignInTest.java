package com.flipcart.StepDefinition;



import org.junit.Assert;

import com.flipcart.base.TestBase;

import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class ApplicationSignInTest extends TestBase{
	ApplicationSignInTest signintest;
	@Before("@Login")
	public void Launch() {
		initialization();
		
	}

@Given("^User Navigate to Application$")
public void user_Navigate_to_Application() throws Throwable {
   signinpage.validateApplicationTitle();
}

@When("^User clicks on Login Option$")
public void user_clicks_on_Login_Option() throws Throwable {
//	   signinpage.clickOnSignInOption();

}

@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2) throws Throwable {
	signinpage.signIntoApp(arg1, arg2);
}

@When("^User clicks on Login button$")
public void user_clicks_on_Login_button() throws Throwable {
   signinpage.clickOnSignInButton();
}

@Then("^User Logged into the application Successfully #validate page title$")
public void user_Logged_into_the_application_Successfully_validate_page_title() throws Throwable {
    
}




	
}
