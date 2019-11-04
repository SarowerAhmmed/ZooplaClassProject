@Smoke 
Feature: Login function validation 

@TS_0123 @TC_002 
Scenario Outline: Successful Login with Valid Credentials 

	Given User able to open the browser 
	And Go to the "<URL>" login page 
	When User able to login with "<userName>" , "<password>" and submit login button 
	Then verify the page title
	When Go to the search box and put the "<Location>" 
	And Print all price in descending order 
	And select the fifth property from the list 
	Then Verify logo,name and telephone number of the agent 
	When Log out from the portal 
	And close the browser 
	
	Examples: 
		|URL					  |userName				|password |Location             |
		|https://www.zoopla.co.uk/|smarttech@gmail.com	|smarttech|Lincolnshire,New York|
