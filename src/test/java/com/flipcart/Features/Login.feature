Feature: Login to Application
@Login
Scenario Outline: Login to the E-Commarce Appication
Given User Navigate to Application
When User clicks on Login Option
And User enters "<contactnumber>" and "<password>"
And User clicks on Login button
Then User Logged into the application Successfully #validate page title
