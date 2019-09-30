@Regression
Feature: Login validation 

	Description :requirement 

Background: 
	Given User need to open a browser 
@TC_001	
Scenario: Successfully login with valid credential 

	And Pass the URL 
	When Click my account 
	And put email 
	And put password 
	And click sign in button 
	Then login will be successful 
	
