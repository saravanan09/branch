package branchAutomation.PageNav;

import java.util.ResourceBundle;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import branchAutomation.PageObjects.DashboardPage;
import branchAutomation.Utils.BrowserUtils;


public class DashboardPageNav {
	private static final DashboardPage dashboardPage  = PageFactory.initElements(BrowserUtils.getDriver(), DashboardPage.class);
	private static ResourceBundle config = ResourceBundle.getBundle("config");
	public void DashboardPageCheck(){
		BrowserUtils.waitForElement(dashboardPage.AccountSettings, 30);
	}
	
	public void AccountSettingsPage(){
		dashboardPage.AccountSettings.click();
	}
	
	public void AccountSettingsURLCheck(String accountSettingsURL){
		BrowserUtils.URLCheck(accountSettingsURL, 30);
	}
	
	public String branchKey(){
		
		BrowserUtils.WebPageLoader(5000);
		BrowserUtils.waitForElement(dashboardPage.BranchKey, 30);
		return dashboardPage.BranchKey.getAttribute("value");
	}
	
	public void LiveViewPage(){
		dashboardPage.LiveView.click();
	}
	
	public void QuickLinksPage(){
		dashboardPage.QuickLinks.click();
	}
	
	public void viewClickEntry(){
		
		BrowserUtils.waitForElement(dashboardPage.NewEvent, 120);
		dashboardPage.NewEvent.click();
		BrowserUtils.WebPageLoader(2000);
		Assert.assertEquals("CLICK",dashboardPage.EventName.getText());
		Assert.assertEquals("ANDROID_WEB", dashboardPage.EventPlatform.getText());
	}
	
	public void viewStatus(){
		BrowserUtils.WebPageLoader(5000);
		int rowCount = BrowserUtils.getDriver().findElements(By.cssSelector("table tbody[data-testid='smart-table-body'] tr")).size();

		for(int i=1; i<=rowCount; i++){
			if(BrowserUtils.getDriver().findElement(By.xpath("//tbody[@data-testid='smart-table-body']/tr["+i+"]/td[3]/div/div/a")).getAttribute("href").equals(config.getString("deepLink"))){
				Actions action = new Actions(BrowserUtils.getDriver());
				WebElement options = BrowserUtils.getDriver().findElement(By.xpath("//tbody[@data-testid='smart-table-body']/tr["+i+"]/td[8]//button"));
				action.moveToElement(options).perform();
				WebElement viewStatus = BrowserUtils.getDriver().findElement(By.xpath("//tbody[@data-testid='smart-table-body']/tr["+i+"]/td[8]//a[@data-testid='la-view-stats']"));
				BrowserUtils.waitForElement(viewStatus, 30);
				action.click(viewStatus).perform();
			}
		}
	}
	
	public void androidLinkClicks(String expectedCount){
		BrowserUtils.waitForElement(dashboardPage.AndroidClickCount, 30);
		Assert.assertEquals(Integer.parseInt(expectedCount)+1, dashboardPage.AndroidClickCount.getText());
	}
	
	public String getClickCount(){
		BrowserUtils.waitForElement(dashboardPage.AndroidClickCount, 30);
		return dashboardPage.AndroidClickCount.getText();
	}
}
