package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Homepage {
		//---------------------------Locators-----------------------------------
	private By signup_login_xpath = By.xpath("//li/a[text()=' Signup / Login']");
	private By contact_us_btn_xpath = By.xpath("//a[text()=' Contact us']");
	private By testcase_btn_xpath = By.xpath("//li/a[text()=' Test Cases']");
	private By product_btn_xpath = By.xpath("//li/a[text()=' Products']");
	private By subscrptn_xpath = By.xpath("//input[@id='susbscribe_email']");
	private By sub_arrow_btn_xpath = By.xpath("//button[@id='subscribe']");
	private By cart_btn_xpath = By.xpath("//li/a[@href='/view_cart']");
	private By up_arrow_xpath = By.xpath("//a/i[@class='fa fa-angle-up']");
	
	private By auto_practice_txt_xpath = By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']");
	
	private By category_txt_xpath = By.xpath("//h2[text()='Category']");
	private By women_cat_xpath = By.xpath("//a[@href='#Women']/span/i[@class='fa fa-plus']");
	private By dress_cat_xpath = By.xpath("//li/a[@href='/category_products/1']");
	private By rcmnd_txt_xpath = By.xpath("//h2[text()='recommended items']");
	
	private By prod4_atc_xpath = By.xpath("//img[@src='get_product_picture/4']/following-sibling::a");
	private By view_cart_btn_xpath = By.xpath("//a/u[text()='View Cart']");

	
		//-----------------------------end of locators----------------------
		
		//-----------------------------Methods------------------------------
	public void navigate_to_autoex(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com");
	}
	
	public void homepage_displayed(WebDriver driver) {
		String homepage_act = driver.getTitle();
		String homepage_exp = "Automation Exercise";
		Assert.assertEquals(homepage_act, homepage_exp,"Homepage not displayed correctly");
		System.out.println("homepage displayed correctly");
	}
	
	public void click_signup_login(WebDriver driver) {
		WebElement signup_login_btn = driver.findElement(signup_login_xpath);
		signup_login_btn.click();
	}
	
	public void contact_us_clk(WebDriver driver) {
		WebElement contact_us_btn = driver.findElement(contact_us_btn_xpath);
		contact_us_btn.click();
	}
	
	public void testcase_clk(WebDriver driver) {
		WebElement testcase_btn = driver.findElement(testcase_btn_xpath);
		testcase_btn.click();
		driver.navigate().back();
		testcase_btn.click();
	}
	
	public void product_clk(WebDriver driver) throws InterruptedException {
		WebElement product_btn = driver.findElement(product_btn_xpath);
		product_btn.click();
		Thread.sleep(3000);
		driver.navigate().back();
		product_btn.click();
	}
	
	public void subscrptn_verify(WebDriver driver) {
		WebElement subscrptn = driver.findElement(subscrptn_xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", subscrptn);
		subscrptn.sendKeys("sanajsheikh@gmail.com");
		WebElement sub_arrow_btn = driver.findElement(sub_arrow_btn_xpath);
		sub_arrow_btn.click();
	}
	
	public void cart_btn_clk(WebDriver driver) {
		WebElement cart_btn = driver.findElement(cart_btn_xpath);
		cart_btn.click();
	}
	
	public void categoryW_clk(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		WebElement category_txt = driver.findElement(category_txt_xpath);
		Assert.assertTrue(category_txt.isDisplayed(), "Cat.. not displayed");
		WebElement women_cat = driver.findElement(women_cat_xpath);
		women_cat.click();
		WebElement dress_cat= driver.findElement(dress_cat_xpath);
		dress_cat.click();
		driver.navigate().back();
		dress_cat.click();
	}
	
	public void recommend_txt(WebDriver driver) {
		WebElement rcmnd_txt = driver.findElement(rcmnd_txt_xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", rcmnd_txt);
		WebElement prod4_atc = driver.findElement(prod4_atc_xpath);
		prod4_atc.click();
	}
	
	public void view_cart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebElement view_cart_btn = driver.findElement(view_cart_btn_xpath);
		view_cart_btn.click();
	}
	
	public void scroll_down(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public void scroll_up(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	public void up_arrow(WebDriver driver) {
		WebElement up_arrow = driver.findElement(up_arrow_xpath);
		up_arrow.click();
	}
	public void verify_auto_prc_txt(WebDriver driver) {
		WebElement auto_prc_txt = driver.findElement(auto_practice_txt_xpath);
		Assert.assertTrue(auto_prc_txt.isDisplayed(), "Full-Fledged practice website for Automation Engineers' text is not visible");
	}
	
	
	
	
}
