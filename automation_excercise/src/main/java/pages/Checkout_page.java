package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Checkout_page {
//---------------------------------------locators----------------------------------------
	private By addr_box_xpath = By.xpath("//ul[@class='address item box']");
	private By review_order_txt_xpath = By.xpath("//div/h2[text()='Review Your Order']");
	private By comment_box_xpath = By.xpath("//textarea[@class='form-control']");
	private By place_order_btn_xpath = By.xpath("//div/a[text()='Place Order']");
	
	
	
	
	
	//--------------------------------methods-------------------------------------------
	
	public void addr_review_visible(WebDriver driver) {
		WebElement addr_box = driver.findElement(addr_box_xpath);
		Assert.assertTrue(addr_box.isDisplayed(), "Addr box not displayed");
		
		WebElement review_order_txt = driver.findElement(review_order_txt_xpath);
		Assert.assertTrue(review_order_txt.isDisplayed(), null);
	}
	public void verifyAddr_details(WebDriver driver) {
		WebElement addr_box = driver.findElement(addr_box_xpath);
		addr_box.getText();
	}
	
	public void scroll_down(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
	}
	
	public void comment(WebDriver driver) {
		WebElement comment_box = driver.findElement(comment_box_xpath);
		comment_box.sendKeys("God website for shopping");
	}
	public void place_order(WebDriver driver) {
		WebElement place_order_btn = driver.findElement(place_order_btn_xpath);
		place_order_btn.click();
	}
	
	
}
