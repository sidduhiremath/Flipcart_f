Feature: Search an Item

Background: Search an Item
Given User Clicks on Search bar
When User enters Item name
And Clicks on Search icon


Scenario: Search An Item
And User Clicks flight tab
And User selects type of trip
Then User selects Daparts date #add step to come back to home screen


Scenario: Search An Item
And User verifies Item Availability
And User selects customer rating and minimum price #Checkbox and dropdown
Then User Clicks on Item