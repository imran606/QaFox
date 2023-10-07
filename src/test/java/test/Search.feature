Feature: Search Functionality

Scenario: Search for valid existing products
Given user opens the application
When user enters the valid product into the search textfield
And user clicks on search button
Then valid product should get displayed in search result 

Scenario: search for invalid not existing product
Given user opens the application
When user enters the invalid product into the search textfield
And user clicks on search button
Then proper error message should be displayed 

Scenario: search without providing any product
Given user opens the application
And user clicks on search button
Then proper error message should be displayed