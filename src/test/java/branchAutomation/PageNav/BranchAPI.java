package branchAutomation.PageNav;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ResourceBundle;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class BranchAPI {
	private static ResourceBundle config = ResourceBundle.getBundle("config");

	public Response POST_createDeepLinkingURL(String endpoint, String key) {

		return given().baseUri(config.getString("baseURI"))
				.param("branch_key", key)
				.param("campaign", config.getString("campaign"))
				.param("channel", config.getString("channel"))
				.param("type", config.getString("type"))
				.header("Accept", ContentType.JSON.getAcceptHeader()).when()
				.post(endpoint);

	}

	public String responseURL(int statusCode, Response resp) {
		return resp.then().statusCode(statusCode).extract().path("url");
	}

	public Response GET_responseURL(String url) {

		return given()
				.header("User-Agent",
						"Mozilla/5.0 (Linux; Android 9; SM-G960F Build/PPR1.180610.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/74.0.3729.157 Mobile Safari/537.36")
				.when().get(url);
	}

	public void responseURLCheckStatus(int StatusCode, Response resp) {

		resp.then().statusCode(StatusCode);
	}
}
