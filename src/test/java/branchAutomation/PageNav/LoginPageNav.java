package branchAutomation.PageNav;

import java.util.ResourceBundle;

import org.openqa.selenium.support.PageFactory;

import branchAutomation.PageObjects.LoginPage;
import branchAutomation.Utils.BrowserUtils;

public class LoginPageNav {
	private static ResourceBundle config = ResourceBundle.getBundle("config");
	private static final LoginPage loginPage = PageFactory.initElements(
			BrowserUtils.getDriver(), LoginPage.class);

	public void navigate() {
		BrowserUtils.loadURL(config.getString("url"));
	}

	public void enterLogin() {
		BrowserUtils.waitForElement(loginPage.UserName, 30);
		loginPage.UserName.sendKeys(config.getString("userName"));
		loginPage.Password.sendKeys(config.getString("password"));
	}

	public void submitLogin() {
		loginPage.LogIn.click();
	}
}
