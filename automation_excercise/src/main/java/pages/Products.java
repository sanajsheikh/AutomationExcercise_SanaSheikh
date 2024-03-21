package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Products {
//---------------------------------------loctaors--------------
	
	private By prod1_xpath = By.xpath("//a[@href='/product_details/1']");
	private By prod2_xpath = By.xpath("//a[@href='/product_details/2']");

	private By search_xpath = By.xpath("//input[@id='search_product']");
	private By search_btn_xpath = By.xpath("//button[@id='submit_search']");
	private By searched_prod_xpath = By.xpath("//h2[text()='Searched Products']");
	
	private By prod1_atc_xpath = By.xpath("//div[@class='overlay-content']/p[text()='Blue Top']/following-sibling::a");
	private By prod2_atc_xpath = By.xpath("//div[@class='overlay-content']/p[text()='Men Tshirt']/following-sibling::a");

	private By hover1_xpath = By.xpath("//div/img[@src='/get_product_picture/1']");
	private By hover2_xpath = By.xpath("//div/img[@src='/get_product_picture/2']");

	private By view_cart_btn_xpath = By.xpath("//a/u[text()='View Cart']");
	private By continue_btn_xpath = By.xpath("//div/button[text()='Continue Shopping']");
	
	private By brand_txt_xpath = By.xpath("//div/h2[text()='Brands']");
	private By polo_xpath = By.xpath("//li/a[@href='/brand_products/Polo']");
	
	//------------------------------methods----------------------------------
	
	public void all_prod_page(WebDriver driver)  {
		String exp_title = "All Products";
		String act_title = driver.getTitle();
		Assert.assertTrue(act_title.contains(exp_title),"NOT navigated to all products page");
	}
	public void prod_clk(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(3000);
		WebElement prod1_view = driver.findElement(prod1_xpath);
		prod1_view.click();
	}
	
	public void prod1_atc(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Actions action = new Actions(driver);
		WebElement hover1 = driver.findElement(hover1_xpath);
		action.moveToElement(hover1).perform();
		WebElement prod1_atc_btn = driver.findElement(prod1_atc_xpath);
		prod1_atc_btn.click();
		System.out.println("Clicked add to cart");
	}
	
	public void prod2_atc(WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement hover2 = driver.findElement(hover2_xpath);
		action.moveToElement(hover2).perform();
		WebElement prod2_atc_btn = driver.findElement(prod2_atc_xpath);
		prod2_atc_btn.click();
	}
	
	
	public void view_cart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebElement view_cart_btn = driver.findElement(view_cart_btn_xpath);
		view_cart_btn.click();
	}
	
	public void continue_shopping(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebElement continue_btn = driver.findElement(continue_btn_xpath);
		continue_btn.click();
	}
	
	public void search_bar(WebDriver driver) throws InterruptedException {
		WebElement search = driver.findElement(search_xpath);
		search.sendKeys("shirts");
		WebElement search_btn = driver.findElement(search_btn_xpath);
		search_btn.click();
		WebElement searched_prod_txt = driver.findElement(searched_prod_xpath);
		Assert.assertTrue(searched_prod_txt.isDisplayed(),"Searched Product txt not displayed");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
	}
	
	public void brand_clk(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		WebElement brand_txt = driver.findElement(brand_txt_xpath);
		Assert.assertTrue(brand_txt.isDisplayed(), "Brand txt is displayed");
		WebElement polo_btn = driver.findElement(polo_xpath);
		polo_btn.click();
	}
}
