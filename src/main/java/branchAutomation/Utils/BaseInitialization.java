package branchAutomation.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseInitialization {

	public static WebDriver getBrowser(){
		
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().version("77.0.3865.40").setup();
		options.addArguments("--user-agent=Mozilla/5.0 (Linux; Android 9; SM-G960F Build/PPR1.180610.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/74.0.3729.157 Mobile Safari/537.36");
		options.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		return driver;
	}
}
