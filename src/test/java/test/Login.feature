Feature:login page test
user should be able to login to the application

Scenario Outline: login with valid credentials
Given user navigate to login page
When user enters valid username <username>
And valid password <password>
And clicks on login button
Then user should be login successfuly
Examples: 
|username    | password   |
|imran1      |123456      |
|imran2      |123456      |
|imran3      |123456      |