package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Account_created {
	//-----------------------Locators-----------------
	private By acc_created_xpath = By.xpath("//h2[@data-qa='account-created']");
	private By continue_btn_xpath = By.xpath("//div/a[text()='Continue']");
	//------------------------Methods--------------
	public void verify_acc_created(WebDriver driver) {
		WebElement acc_created  = driver.findElement(acc_created_xpath);
		Assert.assertTrue(acc_created.isDisplayed(), "Account NOT created");
	
	}
	public void click_continue(WebDriver driver) {
		WebElement continue_btn = driver.findElement(continue_btn_xpath);
		continue_btn.click();
		System.out.println("Account created successfully");
	}
}
