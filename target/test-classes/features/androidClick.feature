Feature: android click events in branch

@clickTracker
Scenario: android click tracker
	Given I navigate to the Branch login page
	When I provide valid login credentials
	Then I should be on the branch dashboard page
	And I click on Account Settings in Setup and Testing section
	Then I should be on "/account-settings/profile"
	And I get the branch key value
	#When I make a POST request to "/v1/url"
	When I click on Quick Links in Channels and Link section
	Then I should be on "/quick-links"
	And I click on View Status using Action context
	Then I should be on "/link-stats/"
	And I should get the count from the android table in the stats
	And I make a GET request with the android user-agent
	Then It should return a 200 success response
	When I click on Live View in Setup and Testing section
	Then I should be on "/liveview/events"
	And I should see the click entry in the Events tab 
	When I click on Quick Links in Channels and Link section
	Then I should be on "/quick-links"
	And I click on View Status using Action context
	Then I should be on "/link-stats/"
	And I should see the updated android click count in the stats