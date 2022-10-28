package com.flipcart.StepDefinition;


import com.flipcart.base.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class ProceedToCheckoutTest extends TestBase{

	
	@After("@Logout")
	public void Logout_from_application() {
		driver.quit();
	}
	
	@Given("^User fetches the item details$")
	public void user_fetches_the_item_details() throws Throwable {
	    checkout.getItemDetails();
	}

	@And("^User removes the item from cart$")
	public void user_removes_the_item_from_cart() throws Throwable {
	   checkout.removeItem();
	}
	
	@And("^User clicks on Place Order$")
	public void user_clicks_on_Place_Order() throws Throwable {
	 checkout.clickonPlaceOrder();  
	}

	@Given("^User clicks on Logout Option$")
	public void user_clicks_on_Logout_Option() throws Throwable {
		checkout.clickonLogoutOption();
	}

	@Then("^User Logged out from the application Successfully$")
	public void user_Logged_out_from_the_application_Successfully() throws Throwable {
	   checkout.clickonLogoutButton();
	}

	}
