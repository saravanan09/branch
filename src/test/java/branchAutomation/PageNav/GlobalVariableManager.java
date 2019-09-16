package branchAutomation.PageNav;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

import com.jayway.restassured.response.Response;

public class GlobalVariableManager {

	private String branchKey;
	private String count;
	private Response response;
	private String responseURL;
	private HttpResponse httpResponse;
	
	public String getBranchKey() {
        return this.branchKey;
    }
 
    public void setBranchKey(String branchKeyValue) {
        this.branchKey = branchKeyValue;
    }
    
    public String getClickCount() {
        return this.count;
    }
 
    public void setClickCount(String androidClickCount) {
        this.count = androidClickCount;
    }
    
    public Response getResponse() {
        return this.response;
    }
 
    public void setResponse(Response resp) {
        this.response = resp;
    }
    
    public String getResponseURL() {
        return this.responseURL;
    }
 
    public void setResponseURL(String url) {
        this.responseURL = url;
    }
    
    public HttpResponse gethttpResponse() {
        return this.httpResponse;
    }
 
    public void sethttpResponse(HttpResponse resp) {
        this.httpResponse = resp;
    }
}
