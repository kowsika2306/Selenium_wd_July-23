@Vishal
Feature: Funtionality of CreateLead

#Background:

#Given Launch the browser
#Given Load the url

@Funtional @Smoke
Scenario Outline: Create Lead with manadatory fields

And Enter the username as 'demoSalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then WelcomePage is displayed
When Click on CRMSFA link
Then HomePage is dispalyed
When Click on Leads link
Then CreateLeadpage is displayed
When Click on the Create lead button
When Enter the company name as <companyName>
When Enter the firstname as <firstname>
When Enter the lastname as <lastname>
When Click on create lead button
Then ViewLeadpage is displayed
Then Verify the LeadId

Examples:
|companyName|firstname|lastname|
|Testleaf|Vidya|R|
|Qeagle|Gokul|5|


