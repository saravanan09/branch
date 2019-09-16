$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/androidClick.feature");
formatter.feature({
  "name": "android click events in branch",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "android click tracker",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@clickTracker"
    }
  ]
});
formatter.step({
  "name": "I navigate to the Branch login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.i_navigate_to_the_Branch_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide valid login credentials",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.i_provide_valid_login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on the branch dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_be_on_the_branch_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Account Settings in Setup and Testing section",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_click_on_Account_Settings_in_Setup_and_Testing_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on \"/account-settings/profile\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_be_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the branch key value",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_get_the_branch_key_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Quick Links in Channels and Link section",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.i_click_on_Quick_Links_in_Channels_and_Link_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on \"/quick-links\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_be_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on View Status using Action context",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_click_on_View_Status_using_Action_context()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on \"/link-stats/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_be_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the count from the android table in the stats",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_should_get_the_count_from_the_android_table_in_the_stats()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I make a GET request with the android user-agent",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_make_a_GET_request_with_the_android_user_agent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should return a 200 success response",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.it_should_return_a_success_response(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Live View in Setup and Testing section",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.i_click_on_Live_View_in_Setup_and_Testing_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on \"/liveview/events\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_be_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the click entry in the Events tab",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_should_see_the_click_entry_in_the_Events_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Quick Links in Channels and Link section",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.i_click_on_Quick_Links_in_Channels_and_Link_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on \"/quick-links\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_be_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on View Status using Action context",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_click_on_View_Status_using_Action_context()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be on \"/link-stats/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_be_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the updated android click count in the stats",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_should_see_the_updated_android_click_count_in_the_stats()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c7\u003e but was:\u003c6\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat branchAutomation.PageNav.DashboardPageNav.androidLinkClicks(DashboardPageNav.java:72)\r\n\tat branchAutomation.StepDefs.Runner.StepDefs.i_should_see_the_updated_android_click_count_in_the_stats(StepDefs.java:111)\r\n\tat ✽.I should see the updated android click count in the stats(file:src/test/resources/features/androidClick.feature:26)\r\n",
  "status": "failed"
});
});