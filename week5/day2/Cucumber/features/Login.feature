@Revathy
Feature: Functionality of Login Module

#Background:
#Given Launch the browser
#Given Load the url

@Smoke
Scenario: Login with Positive Credentials

#preCondition step
#Given Launch the browser
#Given Load the url
And Enter the username as 'demoSalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then WelcomePage is displayed
#Then close the browser

@Regression
Scenario: Login with Negative Credentials

#Given Launch the browser
#Given Load the url
And Enter the username as 'demo'
And Enter the password as 'crmsfa'
When Click on the Login button
But Error message should be displayed
#Then close the browser