package com.flipcart.StepDefinition;

import com.flipcart.base.TestBase;
import com.flipcart.pages.MoveItemToCartPage;

import cucumber.api.java.en.*;

public class MoveItemToCartTest extends TestBase{

	
	@Given("^User is in item details screen  #Window Handling$")
	public void user_is_in_item_details_screen_Window_Handling() throws Throwable {
	   movetocart.switchtoItemDetailsscreen();
	}

	@Given("^User selects item size$")
	public void user_selects_item_size() throws Throwable {
	    movetocart.selectItemSize("S");
	}

	@Given("^User clicks on Add to Cart$")
	public void user_clicks_on_Add_to_Cart() throws Throwable {
	    movetocart.clickOnAddToCart();
	}

	@Given("^User clicks on item$")
	public void user_clicks_on_item() throws Throwable {
	  movetocart.clickOnItem();
	}

	@Given("^User selects the different size$")
	public void user_selects_the_different_size() throws Throwable {
	    movetocart.selectItemSize("M");
	}

}
