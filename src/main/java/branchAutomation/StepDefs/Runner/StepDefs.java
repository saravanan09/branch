package branchAutomation.StepDefs.Runner;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;
import org.openqa.selenium.support.PageFactory;

import branchAutomation.PageNav.GlobalVariableManager;
import branchAutomation.PageNav.LoginPageNav;
import branchAutomation.PageNav.NavInitialization;
import branchAutomation.PageObjects.DashboardPage;
import branchAutomation.PageObjects.LoginPage;
import branchAutomation.Utils.BrowserUtils;

import com.jayway.restassured.http.ContentType;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.jayway.restassured.response.Response;

public class StepDefs {

	GlobalVariableManager gvm = new GlobalVariableManager();

	@Given("I navigate to the Branch login page")
	public void i_navigate_to_the_Branch_login_page() {

		NavInitialization.LoginPage().navigate();
	}

	@When("I provide valid login credentials")
	public void i_provide_valid_login_credentials() {

		NavInitialization.LoginPage().enterLogin();
		NavInitialization.LoginPage().submitLogin();
	}

	@Then("I should be on the branch dashboard page")
	public void i_should_be_on_the_branch_dashboard_page() {
		NavInitialization.DashboardPage().DashboardPageCheck();
	}

	@Given("I click on Account Settings in Setup and Testing section")
	public void i_click_on_Account_Settings_in_Setup_and_Testing_section() {

		NavInitialization.DashboardPage().AccountSettingsPage();
	}

	@Then("I should be on {string}")
	public void i_should_be_on(String url) {

		NavInitialization.DashboardPage().AccountSettingsURLCheck(url);
	}

	@Then("I get the branch key value")
	public void i_get_the_branch_key_value() throws InterruptedException {
		gvm.setBranchKey(NavInitialization.DashboardPage().branchKey());
	}

	@When("I make a POST request to {string}")
	public void i_make_a_POST_request_to(String endpoint) {

		gvm.setResponse(NavInitialization.api().POST_createDeepLinkingURL(
				endpoint, gvm.getBranchKey()));
	}

	@Then("I should see {int} success response and url in the body")
	public void i_should_see_success_response_and_url_in_the_body(
			Integer StatusCode) {
		gvm.setResponseURL(NavInitialization.api().responseURL(StatusCode,
				gvm.getResponse()));
	}

	@Given("I make a GET request with the android user-agent")
	public void i_make_a_GET_request_with_the_android_user_agent()
			throws ClientProtocolException, IOException {
		gvm.setResponse(NavInitialization.api().GET_responseURL(
				gvm.getResponseURL()));
	}

	@Then("It should return a {int} success response")
	public void it_should_return_a_success_response(Integer StatusCode) {
		NavInitialization.api().responseURLCheckStatus(StatusCode,
				gvm.getResponse());
	}

	@When("I click on Live View in Setup and Testing section")
	public void i_click_on_Live_View_in_Setup_and_Testing_section() {
		NavInitialization.DashboardPage().LiveViewPage();
	}

	@Then("I should see the click entry in the Events tab")
	public void i_should_see_the_click_entry_in_the_Events_tab() {
		NavInitialization.DashboardPage().viewClickEntry();
	}

	@When("I click on Quick Links in Channels and Link section")
	public void i_click_on_Quick_Links_in_Channels_and_Link_section() {
		NavInitialization.DashboardPage().QuickLinksPage();
	}

	@Then("I click on View Status using Action context")
	public void i_click_on_View_Status_using_Action_context() {
		NavInitialization.DashboardPage().viewStatus(gvm.getResponseURL());
	}

	@Then("I should get the count from the android table in the stats")
	public void i_should_get_the_count_from_the_android_table_in_the_stats() {
		gvm.setClickCount(NavInitialization.DashboardPage().getClickCount());
	}

	@Then("I should see the updated android click count in the stats")
	public void i_should_see_the_updated_android_click_count_in_the_stats() {
		NavInitialization.DashboardPage()
				.androidLinkClicks(gvm.getClickCount());
	}

}
