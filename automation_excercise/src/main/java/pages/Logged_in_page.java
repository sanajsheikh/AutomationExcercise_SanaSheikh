package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Logged_in_page {
	//------------------Locators-----------------------
	private By logged_in_xpath = By.xpath("//a/i[@class='fa fa-user']");
	private By delete_btn_xpath = By.xpath("//a/i[@class='fa fa-trash-o']");
	private By logout_btn_xpath = By.xpath("//a/i[@class='fa fa-lock']");
	
	//--------------------Methods-----------------------
	
	public void verify_logged_in(WebDriver driver) {
		WebElement logged_in_txt = driver.findElement(logged_in_xpath);
		Assert.assertTrue(logged_in_txt.isDisplayed(), "Not logged-in");
		System.out.println("Successfully logged in");
	}
	
	public void delete_acc(WebDriver driver) throws InterruptedException {
		WebElement delete_btn = driver.findElement(delete_btn_xpath);
		delete_btn.click();
		Thread.sleep(3000);
		driver.navigate().back();
		delete_btn.click();
		
	}
	
	public void logout(WebDriver driver) {
		WebElement logout_btn = driver.findElement(logout_btn_xpath);
		logout_btn.click();
	}
	
}
