package branchAutomation.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseInitialization {

	public static WebDriver getBrowser() {

		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().version("77.0.3865.40").setup();
		options.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		return driver;
	}
}
