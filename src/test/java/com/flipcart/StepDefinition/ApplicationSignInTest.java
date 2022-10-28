package com.flipcart.StepDefinition;



import org.junit.Assert;

import com.flipcart.base.TestBase;

import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class ApplicationSignInTest extends TestBase{
	ApplicationSignInTest signintest;
	@Before("@Login")
	public void launch() {
		initialization();
		
	}

@Given("^User Navigate to Application$")
public void user_Navigate_to_Application() throws Throwable {
	Assert.assertEquals("Application is launched", "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", signinpage.validateApplicationTitle());
}

@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String contact, String password) throws Throwable {
	signinpage.signIntoApp(contact, password);
	
}

@When("^User clicks on Login button$")
public void user_clicks_on_Login_button() throws Throwable {
	signinpage.clickOnLoginButton();
   Thread.sleep(3000);
   try {
   if(signinpage.validateMessage().contains("incorrect")) {
		driver.close();
	}
	else {
		System.out.println("Correct Credentials");
	}}
   catch(Exception e) {
	   System.out.println("FlipKart");
   }
}

@Then("^User Logged into the application Successfully #validate page title$")
public void user_Logged_into_the_application_Successfully_validate_page_title() throws Throwable {
//	Assert.assertEquals("Application is launched", "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", signinpage.validateLoginPage());
System.out.println("V");
}




	
}
