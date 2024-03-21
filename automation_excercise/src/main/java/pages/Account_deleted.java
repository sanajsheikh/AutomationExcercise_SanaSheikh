package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Account_deleted {
	//----------------locators---------------------------------------
	private By acc_deleted_txt_xpath = By.xpath("//h2/b[text()='Account Deleted!']");
	private By continue_btn_xpath = By.xpath("//div/a[text()='Continue']");
	//div/a[@data-qa='continue-button']
	
	//-------------------------methods------------------------------
	
	public void acc_deleted_verify(WebDriver driver) {
		WebElement acc_deleted_txt = driver.findElement(acc_deleted_txt_xpath);
		Assert.assertTrue(acc_deleted_txt.isDisplayed(), "Account not deleted");
		
		WebElement continue_btn = driver.findElement(continue_btn_xpath);
		continue_btn.click();
	}
}
