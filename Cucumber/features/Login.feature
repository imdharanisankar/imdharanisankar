Feature: Login functionality of LeafTaps application

#Background:
#Given Launch the chrome browser
#And Load the application url http://leaftaps.com/opentaps/control/main


Scenario Outline: Test using valid credentials
Given Enter the username as <username>
And Enter the password as <password>
When Click login button
Then Homepage should be displayed 

Examples:
|username|password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|


Scenario: Test using invalid credentials
Given Enter the username as demosalesmanager
And Enter the password as crmsfa123
When Click login button
But Error message should be displayed

