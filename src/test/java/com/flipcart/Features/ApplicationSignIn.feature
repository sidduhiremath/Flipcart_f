@Login
Feature: Login to Application

Scenario Outline: Login to the E-Commerce Application
Given User Navigates to Application
When User enters "<contactnumber>" and "<password>"
Then User clicks on Login button

Examples:
| contactnumber  | password  |  
#| 9113280902 | Sidd@2234 |
| 8546834975 | Sidd@8546 |