Feature: Add Item to Cart

Scenario: Add to Cart
Given User shares the Item
And User Clicks on Add to Cart and Proceed to Checkout #Window Handling

Scenario: Modify Item
Given User Clicks on Item Size 
And User Edit the Size # DropDown
And User Clicks on Add to Cart and Proceed to Checkout #Window Handling

Scenario: User fetches item details and remove an item
Given User fetches the item details#Table Habndling
Then User removes an item from cart
And User click on Preceed to Checkout

