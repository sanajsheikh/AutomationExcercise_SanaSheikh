package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Polo {
//---------------------------locators----------------------------------
	
	
	//-----------------------------methods------------------------------------
	
	public void polo_page_title(WebDriver driver) {
		String exp_title = "Polo";
		String act_title = driver.getTitle();
		Assert.assertTrue(act_title.contains(exp_title), "Polo title not displayed");
	}
}
