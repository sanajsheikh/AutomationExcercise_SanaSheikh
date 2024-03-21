package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Testcase_page {
//--------------------------locators--------------------------------------------
	//private By 
	
	
	
	
	
	//---------------------------------methods------------------------------
	public void testcase_page(WebDriver driver) {
		String act_title = driver.getTitle();
		String exp_title = "Test Cases";
		Assert.assertTrue(act_title.contains(exp_title), "NOT navigated to Testcase page");
	}
}
