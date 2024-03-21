package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Account_created;
import pages.Account_deleted;
import pages.Cart_page;
import pages.Checkout_page;
import pages.Homepage;
import pages.Logged_in_page;
import pages.Payment_page;
import pages.Products;
import pages.Registration;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_6 {
	WebDriver driver;
	@Test
	public void PO_reg_while_checkout() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.prod1_atc(driver);
		pp.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);
		cp.checkout_clk(driver);
		cp.reg_login_clk(driver);
		
		Signup_login slp = new Signup_login();
		slp.new_user_txtDisplayed(driver);
		slp.new_user_cred(driver);
		
		Registration rp = new Registration();
		rp.enter_details1(driver);
		rp.enter_addr_info(driver);
		
		Account_created ac = new Account_created();
		ac.verify_acc_created(driver);
		ac.click_continue(driver);
		
		Logged_in_page lp = new Logged_in_page();
		lp.verify_logged_in(driver);
		hp.cart_btn_clk(driver);
		
		cp.checkout_clk(driver);
		Checkout_page chp = new Checkout_page();
		chp.addr_review_visible(driver);
		chp.scroll_down(driver);
		chp.comment(driver);
		chp.scroll_down(driver);
		chp.place_order(driver);
		
		Payment_page payp = new Payment_page();
		payp.card_details(driver);
		payp.VerifySuccessOrdertxtDisplayed(driver);
		
		lp.delete_acc(driver);
		Account_deleted ad = new Account_deleted();
		ad.acc_deleted_verify(driver);
		
	}
	
	@Test
	public void PO_reg_before_checkout() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.click_signup_login(driver);
		
		Signup_login slp = new Signup_login();
		slp.new_user_txtDisplayed(driver);
		slp.new_user_cred(driver);
		
		Registration rp = new Registration();
		rp.enter_details1(driver);
		rp.enter_addr_info(driver);
		
		Account_created ac = new Account_created();
		ac.verify_acc_created(driver);
		ac.click_continue(driver);
		
		Logged_in_page lp = new Logged_in_page();
		lp.verify_logged_in(driver);
		
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.prod1_atc(driver);
		pp.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);
		cp.checkout_clk(driver);
		
		Checkout_page chp = new Checkout_page();
		chp.addr_review_visible(driver);
		chp.scroll_down(driver);
		chp.comment(driver);
		chp.scroll_down(driver);
		chp.place_order(driver);
		
		Payment_page payp = new Payment_page();
		payp.card_details(driver);
		payp.VerifySuccessOrdertxtDisplayed(driver);
		
		lp.delete_acc(driver);
		Account_deleted ad = new Account_deleted();
		ad.acc_deleted_verify(driver);
	}
	
	@Test
	public void PO_login_before_checkout() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.click_signup_login(driver);
		
		Signup_login slp = new Signup_login();
		slp.login_txt_Displayed(driver);
		slp.enter_correct_cred(driver);
		
		Logged_in_page lp = new Logged_in_page();
		lp.verify_logged_in(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.prod1_atc(driver);
		pp.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);
		cp.checkout_clk(driver);
		
		Checkout_page chp = new Checkout_page();
		chp.addr_review_visible(driver);
		chp.scroll_down(driver);
		chp.comment(driver);
		chp.scroll_down(driver);
		chp.place_order(driver);
		
		Payment_page payp = new Payment_page();
		payp.card_details(driver);
		payp.VerifySuccessOrdertxtDisplayed(driver);
		
		lp.delete_acc(driver);
		Account_deleted ad = new Account_deleted();
		ad.acc_deleted_verify(driver);
	}
	
	@Test
	public void verifyAddr_details_atCheckout() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.click_signup_login(driver);
		
		Signup_login slp = new Signup_login();
		slp.new_user_txtDisplayed(driver);
		slp.new_user_cred(driver);
		
		Registration rp = new Registration();
		rp.enter_details1(driver);
		rp.enter_addr_info(driver);
		
		Account_created ac = new Account_created();
		ac.verify_acc_created(driver);
		ac.click_continue(driver);
		
		Logged_in_page lp = new Logged_in_page();
		lp.verify_logged_in(driver);
		
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.prod1_atc(driver);
		pp.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);
		cp.checkout_clk(driver);
		
		Checkout_page chp = new Checkout_page();
		chp.addr_review_visible(driver);		
		chp.verifyAddr_details(driver);
		chp.scroll_down(driver);
		chp.comment(driver);
		chp.scroll_down(driver);
		chp.place_order(driver);
		
		
		Payment_page payp = new Payment_page();
		payp.card_details(driver);
		payp.VerifySuccessOrdertxtDisplayed(driver);
		
		lp.delete_acc(driver);
		Account_deleted ad = new Account_deleted();
		ad.acc_deleted_verify(driver);
	}
	
	@Test
	public void downloadInvoice_afterPurchase() throws InterruptedException {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.product_clk(driver);
		
		Products pp = new Products();
		pp.all_prod_page(driver);
		pp.prod1_atc(driver);
		pp.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);
		cp.checkout_clk(driver);
		cp.reg_login_clk(driver);
		
		Signup_login slp = new Signup_login();
		slp.new_user_txtDisplayed(driver);
		slp.new_user_cred(driver);
		
		Registration rp = new Registration();
		rp.enter_details1(driver);
		rp.enter_addr_info(driver);
		
		Account_created ac = new Account_created();
		ac.verify_acc_created(driver);
		ac.click_continue(driver);
		
		Logged_in_page lp = new Logged_in_page();
		lp.verify_logged_in(driver);
		hp.cart_btn_clk(driver);
		
		cp.checkout_clk(driver);
		Checkout_page chp = new Checkout_page();
		chp.addr_review_visible(driver);
		chp.scroll_down(driver);
		chp.comment(driver);
		chp.scroll_down(driver);
		chp.place_order(driver);
		
		Payment_page payp = new Payment_page();
		payp.card_details(driver);
		payp.VerifySuccessOrdertxtDisplayed(driver);
		payp.download_btn_clk(driver);
		
		lp.delete_acc(driver);
		Account_deleted ad = new Account_deleted();
		ad.acc_deleted_verify(driver);
		
	}
	
	
}
