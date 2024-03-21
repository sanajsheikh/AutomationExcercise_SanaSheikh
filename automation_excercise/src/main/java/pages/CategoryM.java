package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CategoryM {
//-----------------------------------------locators-------------------------------------
	private By tshirt_head_txt_xpath = By.xpath("//h2[text()='Men - Tshirts Products']");
	
	
	
	
	//-------------------------------------methods-----------------------------------------
	public void verify_men_cat(WebDriver driver) {
		String exp_title = "Tshirts";
		String act_title = driver.getTitle();
		Assert.assertTrue(act_title.contains(exp_title), "exp title not displayed");
		
		WebElement tshirt_head_txt = driver.findElement(tshirt_head_txt_xpath);
		Assert.assertTrue(tshirt_head_txt.isDisplayed(), "Tshirt cat.. heading not displayed");

	}
}
