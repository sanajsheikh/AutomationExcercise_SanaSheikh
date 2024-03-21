package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Payment_page {
//------------------------locators------------------------------------------	
    private By name_xpath = By.name("name_on_card");
	private By card_no_xpath = By.name("card_number");
	private By cvc_no_xpath = By.name("cvc");
	private By expiry_mnth_xpath = By.name("expiry_month");
	private By expiry_yr_xpath = By.name("expiry_year");
	private By confirm_xpath = By.id("submit");
	private By success_msg_xpath = By.xpath("//h2/b[text()='Order Placed!']");
	private By download_btn_xpath = By.xpath("//a[text()='Download Invoice']");
//-----------------------------------methods---------------------------------------
	
	public void card_details(WebDriver driver) {
		WebElement Name_On_Card = driver.findElement(name_xpath);
		Name_On_Card.sendKeys("Sana");
		
		WebElement CARDNUM = driver.findElement(card_no_xpath);
		CARDNUM.sendKeys("123456789");
	
		
		WebElement CVCNumber = driver.findElement(cvc_no_xpath);
		CVCNumber.sendKeys("787");
	
		WebElement EXPMonth = driver.findElement(expiry_mnth_xpath);
		EXPMonth.sendKeys("12");
	
		
		WebElement EXPYEAR = driver.findElement(expiry_yr_xpath);
		EXPYEAR.sendKeys("2028");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		WebElement PayConfirmOrder = driver.findElement(confirm_xpath);
		PayConfirmOrder.click();
	}
	 public void VerifySuccessOrdertxtDisplayed(WebDriver driver) {
		WebElement SuccessOrdermsg = driver.findElement(success_msg_xpath);
		Assert.assertTrue(SuccessOrdermsg.isDisplayed(), "Success Order msg not displlayed");	
	}
	 
	 public void download_btn_clk(WebDriver driver) {
		 WebElement download_btn = driver.findElement(download_btn_xpath);
		 download_btn.click();
	 }

	
}