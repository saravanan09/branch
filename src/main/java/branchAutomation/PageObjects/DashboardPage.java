package branchAutomation.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	@FindBy(how = How.CSS, using = "a[data-testid='sidebar-link-account-settings']")
    public WebElement AccountSettings;
	
	@FindBy(how = How.CSS, using = "a[data-testid='sidebar-link-liveview']")
    public WebElement LiveView;
	
	@FindBy(how = How.XPATH, using = "//a[@data-testid='sidebar-link-quick-links']")
    public WebElement QuickLinks;
	
	@FindBy(how = How.CSS, using = "input[data-testid='branch_key-input']")
    public WebElement BranchKey;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Load new events']")
    public WebElement NewEvent;
	
	@FindBy(how = How.CSS, using = "table tbody[data-testid=smart-table-body] tr:nth-of-type(1) td:nth-of-type(1)")
    public WebElement EventName;
	
	@FindBy(how = How.CSS, using = "table tbody[data-testid=smart-table-body] tr:nth-of-type(1) td:nth-of-type(3)")
    public WebElement EventPlatform;
	
	@FindBy(how = How.CSS, using = "table tbody[data-testid=smart-table-body] tr:nth-of-type(2) td:nth-of-type(3)")
    public WebElement EventPlatformROBOT;
	
	@FindBy(how = How.CSS, using = "table[id='android-click-flow'] tbody tr:nth-of-type(3) td div")
    public WebElement AndroidClickCount;
	
}
