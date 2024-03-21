package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Searched_prod_page {
//----------------------------------------------locators--------------------------------
	private By prod2_xpath = By.xpath("//div/img[@src='/get_product_picture/11']");
	private By prod2_atc_xpath = By.xpath("//div[@class='productinfo text-center']/a[@data-product-id='11']");
	
	private By view_cart_btn_xpath = By.xpath("//a/u[text()='View Cart']");

	
	//----------------------------------------methods----------------------------------------
	public void add_to_cart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement prod2 = driver.findElement(prod2_xpath);
		action.moveToElement(prod2).perform();
		WebElement prod2_atc_btn = driver.findElement(prod2_atc_xpath);
		prod2_atc_btn.click();

	}
	public void view_cart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebElement view_cart_btn = driver.findElement(view_cart_btn_xpath);
		view_cart_btn.click();
	}
}
