Feature: Move Item to Cart

Scenario: Add to Cart
Given User is in item details screen  #Window Handling
And User selects item size
And User clicks on Add to Cart

Scenario: Modify the item
Given User clicks on item
And User selects the different size
And User clicks on Add to Cart