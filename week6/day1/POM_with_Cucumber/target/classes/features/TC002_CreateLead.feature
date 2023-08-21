Feature: Funtionality of CreateLead


Scenario Outline: Create Lead with manadatory fields

And Enter the username
And Enter the password
When Click on the Login button
Then WelcomePage is displayed
When Click on CRMSFA link
When Click on Leads link
When Click on the Create lead button
When Enter the company name as <companyName>
When Enter the firstname as <firstname>
When Enter the lastname as <lastname>
When Click on create lead button
Then ViewLeadpage is displayed


Examples:
|companyName|firstname|lastname|
|'Testleaf'|'Vidya'|'R'|
|'Qeagle'|'Gokul'|'J'|


