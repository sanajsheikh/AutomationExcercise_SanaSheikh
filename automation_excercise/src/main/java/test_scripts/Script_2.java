package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Account_deleted;
import pages.Homepage;
import pages.Logged_in_page;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_2 {
	WebDriver driver;
	
	@Test
	public void login_correct_cred() throws InterruptedException  {
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
		lp.delete_acc(driver);
		
		Account_deleted adp = new Account_deleted();
		adp.acc_deleted_verify(driver);
	
		
	}
	@Test
	public void login_incorrect_cred() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.click_signup_login(driver);
		
		Signup_login slp = new Signup_login();
		slp.login_txt_Displayed(driver);
		slp.enter_incorrect_cred(driver);
		
	}
	
	@Test
	public void logout_user() {
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
		lp.logout(driver);
		
		slp.login_txt_Displayed(driver);
	}
	
}
