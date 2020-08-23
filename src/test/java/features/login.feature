Feature: Login to the application and update the form
	
	Background:
	Given validate browser
	When browser is launched
	Then check browser is started
	
	@smoketest
	Scenario: Verify User Login to the application regular Expression1
	Given Application is displayed on the screen
	When user enter username with "suresh"
	And user click on login button 
	Then user lands on client info screen	
	
	@regressiontest
	Scenario: Verify User Login to the application regular Expression2
	Given Application is displayed on the screen
	When user enter username with "rajesh"
	And user click on login button 
	Then user lands on client info screen	
	
	Scenario: Verify User Login to the application Data Table
	Given user lands on checkout page
	When user clicks on buy button
	And user click on proceed 
	Then user lands on confirmation page
	Then user prints the follwoing details
	| suresh | krishnan | nair | 222333 |

	@smoketest
	Scenario Outline: Verify User Login multiple times Multiple test data
	Given user lands on login page first time
	When user enter <username> and <password>
	And user click on proceed once
	Then user lands on next page
	Examples:
	|username|password|
	|suresh | 12345   |
	|rajesh  |34567   |


	
	

	