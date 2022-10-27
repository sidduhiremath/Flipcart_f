package com.flipcart.StepDefinition;


import com.flipcart.base.TestBase;

import cucumber.api.java.en.*;

public class CheckItemAvailabilityTest extends TestBase{

	
	@Given("^User Clicks on Search bar$")
	public void user_Clicks_on_Search_bar() throws Throwable {
		checkavailability.clickOnSearchBar();
	}

	@When("^User enters Item name$")
	public void user_enters_Item_name() throws Throwable {
		checkavailability.enterItemName();
	}

	@When("^Clicks on Search icon$")
	public void clicks_on_Search_icon() throws Throwable {
		checkavailability.clickOnSearchIcon();
	}

	@When("^User Clicks flight tab$")
	public void user_Clicks_flight_tab() throws Throwable {
		checkavailability.clickOnFlights();
	}

	@When("^User selects type of trip$")
	public void user_selects_type_of_trip() throws Throwable {
		checkavailability.selectTripType();
	}

	@Then("^User selects Daparts date #add step to come back to home screen$")
	public void user_selects_Daparts_date_add_step_to_come_back_to_home_screen() throws Throwable {
		checkavailability.clickonDapartsOn();
		Thread.sleep(3000);
		checkavailability.selectDapartsOnDate();
	}

	@And("^User verifies Item Availability$")
	public void user_verifies_Item_Availability() throws Throwable {
	   checkavailability.checkItemAvailability();
	}
	
	@When("^User selects customer rating and minimum price #Checkbox and dropdown$")
	public void user_selects_customer_rating_and_minimum_price_Checkbox_and_dropdown() throws Throwable {
	    checkavailability.selectCustomerRating();
	    checkavailability.selectMinPrice();
	}

	@Then("^User Clicks on Item$")
	public void user_Clicks_on_Item() throws Throwable {
	   checkavailability.clickOnItem();
	}
	
	
}
