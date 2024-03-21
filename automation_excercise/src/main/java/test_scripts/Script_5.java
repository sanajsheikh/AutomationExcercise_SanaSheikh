package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Cart_page;
import pages.Homepage;
import pages.Products;
import pages.Searched_prod_page;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_5 {
	WebDriver driver;
	
	@Test
	public void searchProd_verifyCart_Afterlogin() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.search_bar(driver);
		
		Searched_prod_page sp = new Searched_prod_page();
		sp.add_to_cart(driver);
		sp.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod3_added(driver);
		
		hp.click_signup_login(driver);
		Signup_login slp = new Signup_login();
		slp.enter_correct_cred(driver);
		hp.cart_btn_clk(driver);
		cp.verify_prod3_added(driver);
		System.out.println("Product visible after login");
	}
	
	@Test
	public void addProd_fromRcmnd_verifyCart() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.recommend_txt(driver);
		hp.view_cart(driver);
		
		Cart_page cp =new Cart_page();
		cp.verify_prod4_added(driver);
	}
	
	
}
