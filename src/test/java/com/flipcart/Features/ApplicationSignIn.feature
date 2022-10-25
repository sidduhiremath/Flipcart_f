Feature: Login to Application
@Login
Scenario: Login to the E-Commarce Appication
Given User Navigate to Application
When User clicks on Login Option
#And User enters "<contactnumber>" and "<password>"
And User enters "9113280902" and "Sidd@2226"
And User clicks on Login button
Then User Logged into the application Successfully #validate page title
#
#Examples:
#| contactnumber  | password  | 
#| 9113280902 | Sidd@2226 | 
#| 8546834975 | Sidd@8546 |

