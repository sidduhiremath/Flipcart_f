Feature: Checksout the Item


Scenario: User Dispay Item Details and Checkout the Item
Given User fetches the item details
And User removes the item from cart
And User clicks on Place Order


@Logout
Scenario: Logout from the E-Commarce Appication
Given User clicks on Logout Option
Then User Logged out from the application Successfully