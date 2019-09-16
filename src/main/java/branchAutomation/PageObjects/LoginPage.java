package branchAutomation.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how = How.NAME, using = "email")
    public WebElement UserName;
	
	@FindBy(how = How.NAME, using = "password")
    public WebElement Password;
	
	@FindBy(how = How.CSS, using = "button[data-testid='btn-sign-in']")
    public WebElement LogIn;
}
