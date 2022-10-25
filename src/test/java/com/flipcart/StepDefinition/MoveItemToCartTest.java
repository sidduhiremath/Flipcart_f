package com.flipcart.StepDefinition;

import com.flipcart.base.TestBase;

import cucumber.api.java.en.*;

public class MoveItemToCartTest extends TestBase{

	
	@Given("^User shares the Item$")
	public void user_shares_the_Item() throws Throwable {
	    addtocart.ClickOnItem();
	    addtocart.ShareItem();
	}

	@Given("^User Clicks on Add to Cart and Proceed to Checkout #Window Handling$")
	public void user_Clicks_on_Add_to_Cart_and_Proceed_to_Checkout_Window_Handling() throws Throwable {
		addtocart.ClickOnAddToCart();
		addtocart.ClickOnProceedToChechOut();
	}

	@Given("^User Clicks on Item Size$")
	public void user_Clicks_on_Item_Size() throws Throwable {
		addtocart.ClickOnSize();
	}

	@Given("^User Edit the Size # DropDown$")
	public void user_Edit_the_Size_DropDown() throws Throwable {
		addtocart.ModifyItemSize();
	}

	@Given("^User fetches the item details#Table Habndling$")
	public void user_fetches_the_item_details_Table_Habndling() throws Throwable {
		addtocart.FetchItemDetails();
	}

	@Then("^User removes an item from cart$")
	public void user_removes_an_item_from_cart() throws Throwable {
		addtocart.RemoveItem();
	}

	@Then("^User click on Preceed to Checkout$")
	public void user_click_on_Preceed_to_Checkout() throws Throwable {
		addtocart.ProceedToChechOut();
		System.out.println("Success");
	}
	
	
}
