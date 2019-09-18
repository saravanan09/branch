Feature: android click events in branch

@clickTracker
Scenario: android click tracker
	Given I navigate to the Branch login page
	When I provide valid login credentials
	Then I should be on the branch dashboard page
	And I click on Account Settings in Setup and Testing section
	Then I should be on "/account-settings/profile"
	And I get the branch key value
	When I make a POST request to "/v1/url"				
	Then I should see 200 success response and url in the body	# Extracting the URL from the response creates a click event by ROBOT in Live View. So I check live view age for events twice, One after creating the new link and extracting it and secondly after click with android UA and then check for the ANDROID_WEB Event. 
	When I click on Live View in Setup and Testing section
	Then I should be on "/liveview/events"
	And I should see the click entry in the Events tab		# ROBOT click event
	When I click on Quick Links in Channels and Link section
	Then I should be on "/quick-links"
	And I click on View Status using Action context
	Then I should be on "/link-stats/"
	And I should get the count from the android table in the stats
	And I make a GET request with the android user-agent
	Then It should return a 200 success response
	When I click on Live View in Setup and Testing section
	Then I should be on "/liveview/events"
	And I should see the click entry in the Events tab 		# ANDROID_WEB Click Event
	When I click on Quick Links in Channels and Link section
	Then I should be on "/quick-links"
	And I click on View Status using Action context
	Then I should be on "/link-stats/"
	And I should see the updated android click count in the stats	# I see there is a delay in updating the value in QuickLinks Page. So as of now it gives an assertion error. In real time it can checked in Database or by using fluent wait in selenium.
