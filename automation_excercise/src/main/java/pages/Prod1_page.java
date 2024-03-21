package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Prod1_page {
//--------------------------------locators------------------------------------
	private By prod_name_xpath = By.xpath("//div/h2[text()='Blue Top']");
	private By category_xpath = By.xpath("//div/p[text()='Category: Women > Tops']");
	private By price_xpath = By.xpath("//span[text()='Rs. 500']");
	private By cond_xpath = By.xpath("//p/b[text()='Condition:']");
	private By brand_xpath = By.xpath("//p/b[text()='Brand:']");
	private By avail_xpath = By.xpath("//p/b[text()='Availability:']");
	private By qty_xpath = By.xpath("//input[@id='quantity']");
	private By atc_xpath = By.xpath("//button/i[@class='fa fa-shopping-cart']");
	private By view_cart_btn_xpath = By.xpath("//a/u[text()='View Cart']");
	
	private By wr_rvw_xpath = By.xpath("//li/a[text()='Write Your Review']");
	
	private By name_xpath = By.xpath("//span/input[@id='name']");
	private By email_xpath = By.xpath("//span/input[@id='email']");
	private By review_xpath = By.xpath("//form/textarea[@id='review']");
	private By submit_btn_xpath = By.xpath("//button[@id='button-review']");
	

	//------------------------------methods-------------------------------------
	
	public void prod1_page(WebDriver driver) {
		String exp_title = "Product Details";
		String act_title = driver.getTitle();
		Assert.assertTrue(act_title.contains(exp_title), "Product details page not displayed");
	}
	
	public void prod1_details(WebDriver driver) {
		WebElement prod_name = driver.findElement(prod_name_xpath);
		Assert.assertTrue(prod_name.isDisplayed(), "Product name not displayed");
		WebElement category = driver.findElement(category_xpath);
		Assert.assertTrue(category.isDisplayed(), "Category not displayed");
		WebElement price = driver.findElement(price_xpath);
		Assert.assertTrue(price.isDisplayed(), "Price not displayed");
		WebElement cond = driver.findElement(cond_xpath);
		Assert.assertTrue(cond.isDisplayed(), "Condition not dispalyed");
		WebElement brand =driver.findElement(brand_xpath);
		Assert.assertTrue(brand.isDisplayed(), "Brand not displayed");
		WebElement avail = driver.findElement(avail_xpath);
		Assert.assertTrue(avail.isDisplayed(), "Availability is not displayed");
		System.out.println("Product details mentioned completely");
	}
	
	public void prod1_qty(WebDriver driver) {
		WebElement qty = driver.findElement(qty_xpath);
		qty.clear();
		qty.sendKeys("4");		
	}
	public void prod_atc_view_cart(WebDriver driver) throws InterruptedException {
		WebElement atc = driver.findElement(atc_xpath);
		atc.click();	
		Thread.sleep(2000);
		WebElement view_cart_btn = driver.findElement(view_cart_btn_xpath);
		view_cart_btn.click();
	}
	public void write_review(WebDriver driver) {
		WebElement wr_rvw = driver.findElement(wr_rvw_xpath);
		Assert.assertTrue(wr_rvw.isDisplayed(), "Write review not displayed)");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
		WebElement name = driver.findElement(name_xpath);
		name.sendKeys("Sana Sheikh");
		WebElement email = driver.findElement(email_xpath);
		email.sendKeys("sanajsheikh@gmail.com");
		WebElement review = driver.findElement(review_xpath);
		review.sendKeys("This shirt is a pretty good one");
		WebElement submit_btn = driver.findElement(submit_btn_xpath);
		submit_btn.click();
	}
}
