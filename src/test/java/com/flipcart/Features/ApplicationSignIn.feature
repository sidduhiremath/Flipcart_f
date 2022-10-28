Feature: Login to Application
@Login
Scenario Outline: Login to the E-Commarce Appication
Given User Navigate to Application
When User enters "<contactnumber>" and "<password>"
And User clicks on Login button
Then User Logged into the application Successfully #validate page title

Examples:
| contactnumber  | password  |  
| 9113280902 | Sidd@2234 |
| 8546834975 | Sidd@8546 |