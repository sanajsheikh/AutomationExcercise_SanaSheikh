package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Cart_page {
//------------------------------locators------------------------------------------
	private By subscrptn_btn_xpath = By.xpath("//input[@id='susbscribe_email']");
	private By sub_arrow_btn_xpath = By.xpath("//button[@id='subscribe']");
	private By subscrptn_txt_xpath = By.xpath("//div/h2[text()='Subscription']");
	private By checkout_btn_xpath = By.xpath("//a[text()='Proceed To Checkout']");
	private By reg_login_btn = By.xpath("//a/u[text()='Register / Login']");
	
	private By prod1_xpath = By.xpath("//a[@href='/product_details/1']");
	private By prod2_xpath = By.xpath("//a[@href='/product_details/2']");
	private By prod3_xpath = By.xpath("//a[@href='/product_details/11']");
	private By prod4_atc_xpath = By.xpath("//a[@data-product-id='4']");

	
	private By cart_qty_xpath = By.xpath("//td[@class='cart_quantity']");
	private By remove1_xpath = By.xpath("//a[@class='cart_quantity_delete'][@data-product-id='1']");
	private By remove2_xpath = By.xpath("//a[@class='cart_quantity_delete'][@data-product-id='2']");

	private By cart_empty_txt_xpath = By.xpath("//p/b[text()='Cart is empty!']");
	//--------------------------------------------methods--------------------------------------
	
	public void subscrptn(WebDriver driver) {
		WebElement subscrptn_txt= driver.findElement(subscrptn_txt_xpath);
		Assert.assertTrue(subscrptn_txt.isDisplayed(), "Subscription text not displayed");
		WebElement subscrptn_btn = driver.findElement(subscrptn_btn_xpath);
		subscrptn_btn.sendKeys("sanajsheikh@gmail.com");
		WebElement sub_arrow_btn = driver.findElement(sub_arrow_btn_xpath);
		sub_arrow_btn.click();
	}
	
	public void verify_prod_added(WebDriver driver) {		
//		WebElement prod1 = (WebElement) Products.prod1_xpath;
//		Assert.assertTrue(prod1.isDisplayed(), "added prod1 not displayed");
		
		WebElement prod1 = driver.findElement(prod1_xpath);
		Assert.assertTrue(prod1.isDisplayed(), "added prod1 not displayed");
	}
	public void verify_prod2_added(WebDriver driver) {		
		WebElement prod2 = driver.findElement(prod2_xpath);
		Assert.assertTrue(prod2.isDisplayed(), "added prod2 not displayed");
	}
	public void verify_prod3_added(WebDriver driver) {		
		WebElement prod3 = driver.findElement(prod3_xpath);
		Assert.assertTrue(prod3.isDisplayed(), "added prod3 not displayed");
	}
	public void verify_prod4_added(WebDriver driver) {		
		WebElement prod4 = driver.findElement(prod4_atc_xpath);
		Assert.assertTrue(prod4.isDisplayed(), "added prod4 not displayed");
	}
	
	public void cart_details(WebDriver driver) {
		WebElement cart_qty = driver.findElement(cart_qty_xpath);
		System.out.println(cart_qty.getText());
	}
	public void remove_prod(WebDriver driver) throws InterruptedException {
		WebElement remove1 = driver.findElement(remove1_xpath);
		remove1.click();
		WebElement remove2 = driver.findElement(remove2_xpath);
		remove2.click();
		Thread.sleep(3000);
		WebElement cart_empty_txt = driver.findElement(cart_empty_txt_xpath);
		Assert.assertTrue(cart_empty_txt.isDisplayed(), "Cart empty msg not displayed");
	}
	public void checkout_clk(WebDriver driver) {
		WebElement checkout_btn = driver.findElement(checkout_btn_xpath);
		checkout_btn.click();
	}
	public void reg_login_clk(WebDriver driver) {
		WebElement reg_login =driver.findElement(reg_login_btn);
		reg_login.click();
	}
}
