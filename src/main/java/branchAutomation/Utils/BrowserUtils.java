package branchAutomation.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if (driver==null) {
			try {
				driver = BaseInitialization.getBrowser();
	        } catch (UnreachableBrowserException e) {
	        	driver = BaseInitialization.getBrowser();
	        }finally{       	
	        	Runtime.getRuntime().addShutdownHook(new Thread(new CloseBrowser()));
	        }
		}
        return driver;
    }
	
	public static void loadURL(String url){
		getDriver().navigate().to(url);
	}
	
	public static void click(String elementToClick)
	{
		getDriver().findElement(By.id(elementToClick)).click();
	}
	
	public static void sendKeys(String element,String elementValue)
	{
		getDriver().findElement(By.id(element)).sendKeys(elementValue);
	}
	
	public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 10;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	}
	
	public static Boolean URLCheck(String url, Integer waitTimeInSeconds) {
	    if (waitTimeInSeconds == null) {
	    	waitTimeInSeconds = 10;
	    }
	    
	    WebDriverWait wait = new WebDriverWait(getDriver(), waitTimeInSeconds);
	    return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public static void WebPageLoader(int seconds){
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static class CloseBrowser implements Runnable {
        public void run() {
        	try {
                getDriver().quit();
                driver = null;
            } catch (UnreachableBrowserException e) {
                
            }
        }
	}
}
