Feature: Checksout the Item


Scenario: User Checkout the Item
Given User is in Address Page
Then User clicks on Proceed to Checkout
And User Selects Terms of Services # Checkbox
Then User clicks on Proceed to Checkout button 

@Logout
Scenario: Logout from the E-Commarce Appication
Given User is in Order Page #validate Order page title
When User clicks on SignOut Option
Then User Logged out from the application Successfully#validate page title