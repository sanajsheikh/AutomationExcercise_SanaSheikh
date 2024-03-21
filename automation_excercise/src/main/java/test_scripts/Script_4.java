package test_scripts;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import pages.Cart_page;
import pages.CategoryM;
import pages.CategoryW;
import pages.Homepage;
import pages.Prod1_page;
import pages.Products;
import utils.Driver_setup;
//---------------------------------------all product related=====================
public class Script_4 {
	WebDriver driver;
	

	@Test
	public void adBlocker() {
	ChromeOptions options=new ChromeOptions();
	options.addExtensions(new File("C:\\Users\\x8hsbp\\Documents\\automationExcercise\\src\\AdBlock.crx"));
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	options.merge(capabilities);
	options.addArguments("--disable-notifications");
	options.setExperimentalOption("prefs",new HashMap<String,Object>()
	{{put ("autofill.profile_enabled",false);}});
	options.addArguments("--save-password-bubble");
	driver= new ChromeDriver(options);
	}
	
	@Test
	public void all_products() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.prod_clk(driver);
		
		Prod1_page pp1 = new Prod1_page();
		pp1.prod1_page(driver);
		pp1.prod1_details(driver);
	}
	@Test
	public void search_product() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.search_bar(driver);
	}
	
	@Test
	public void add_prod_to_cart() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.prod1_atc(driver);
		pp.continue_shopping(driver);
		pp.prod2_atc(driver);
		pp.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);
	}
	@Test
	public void verify_prod_in_cart() throws InterruptedException {
		all_products();
		Prod1_page pp1= new Prod1_page();
		pp1.prod1_qty(driver);
		pp1.prod_atc_view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.cart_details(driver);
		
	}
	
	@Test
	public void remove_prod_cart() throws InterruptedException {
		add_prod_to_cart();
		Cart_page cp = new Cart_page();
		cp.remove_prod(driver);		
	}
	
	@Test
	public void add_product_review() throws InterruptedException {
		all_products();
		Prod1_page pp1= new Prod1_page();
		pp1.write_review(driver);
	}
	
	@Test 
	public void view_category_prod() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.categoryW_clk(driver);
		
		CategoryW cw = new CategoryW();
		cw.verify_categoryW(driver);
		cw.men_cat_clk(driver);
		
		CategoryM cm = new CategoryM();
		cm.verify_men_cat(driver);
	}
	
	@Test
	public void view_cart_brand_prod() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.brand_clk(driver);
	}
	
	
}
