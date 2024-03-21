package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver_setup {
	public static WebDriver testBrowserSetUp() {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanaj\\Downloads\\chromedriver-win64 (122)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
