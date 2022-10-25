package com.flipcart.StepDefinition;

import org.junit.Assert;

import com.flipcart.base.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class ProceedToCheckoutTest extends TestBase{

	
	@After("@Logout")
	public void Logout_from_application() {
		driver.quit();
	}
	
	@Given("^User is in Address Page$")
	public void user_is_in_Address_Page() throws Throwable {
	   Assert.assertEquals("Order - My Store", checkout.VerifyAddresssPage());
		Thread.sleep(4000);
	}

	@Then("^User clicks on Proceed to Checkout$")
	public void user_clicks_on_Proceed_to_Checkout() throws Throwable {
		addtocart.ProceedToChechOut();
	}

	@Then("^User Selects Terms of Services # Checkbox$")
	public void user_Selects_Terms_of_Services_Checkbox() throws Throwable {
	   checkout.SelectTermsAndService();
	}

	@Then("^User clicks on Proceed to Checkout button$")
	public void user_clicks_on_Proceed_to_Checkout_button() throws Throwable {
		   checkout.ClickProceedCheckOut();

	}

	
	}
