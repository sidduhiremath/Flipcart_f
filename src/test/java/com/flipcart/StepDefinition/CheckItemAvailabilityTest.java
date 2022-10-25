package com.flipcart.StepDefinition;


import com.flipcart.base.TestBase;

import cucumber.api.java.en.*;

public class CheckItemAvailabilityTest extends TestBase{

	String itemavaialable=null;
	
	@Given("^User clicks on My Personal Information button$")
	public void user_clicks_on_My_Personal_Information_button() throws Throwable {
	   checkavailability.clickOnMyPersonalInfo();
	}

	@Given("^User Selects Social title Option #Radio button$")
	public void user_Selects_Social_title_Option_Radio_button() throws Throwable {
		checkavailability.selectDay();
	}

	@Given("^User Updates Date of Birth #Data picker$")
	public void user_Updates_Date_of_Birth_Data_picker() throws Throwable {
		checkavailability.selectDay();
		Thread.sleep(4000);
		checkavailability.selectDay();
		Thread.sleep(4000);
		checkavailability.selectDay();
		Thread.sleep(4000);
	}

	@Then("^User enters Password$")
	public void user_enters_Password() throws Throwable {
		checkavailability.eneterConfirmPassword();
	}

	@Then("^Clicks on Save button$")
	public void clicks_on_Save_button() throws Throwable {
		checkavailability.saveInfo();
	}

	@Given("^User Clicks on Search bar$")
	public void user_Clicks_on_Search_bar() throws Throwable {
		checkavailability.clickOnSearchBar();
	}

	@When("^User enters Item name$")
	public void user_enters_Item_name() throws Throwable {
		checkavailability.enperItemName();
	}

	@When("^Clicks on Search icon$")
	public void clicks_on_Search_icon() throws Throwable {
		checkavailability.clickOnSearchBar();
	}

	@When("^User Filters the product#DropDown$")
	public void user_Filters_the_product_DropDown() throws Throwable {
		checkavailability.sortTheItem();
	}

	@Given("^User Fetches the availability of product$")
	public void user_Fetches_the_availability_of_product() throws Throwable {
		checkavailability.isItemAvailable();
	}

	@Given("^User Verifies the Item Availability$")
	public void user_Verifies_the_Item_Availability() throws Throwable {
	   if((checkavailability.isItemAvailable())=="In Stock") {
		   System.out.println("Item Avaiable");
	   }
	   else {
		   System.out.println("Item Not Avaiable");

	   }
		   
	}

	
	
}
