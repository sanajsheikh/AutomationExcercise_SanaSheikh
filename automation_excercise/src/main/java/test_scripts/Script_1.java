package test_scripts;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import pages.Account_created;
import pages.Account_deleted;
import pages.Homepage;
import pages.Logged_in_page;
import pages.Registration;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_1 {
	
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
	public void register_user_delete_acc() throws InterruptedException {
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
		lp.delete_acc(driver);
		
		Account_deleted ad = new Account_deleted();
		ad.acc_deleted_verify(driver);
	}
	
	@Test
	public void register_user() throws InterruptedException {
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
		
	}
	
	@Test
	public void reg_exist_cred() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.click_signup_login(driver);
		
		Signup_login slp = new Signup_login();
		slp.new_user_txtDisplayed(driver);
		slp.exist_cred_reg(driver);
		
	}
}
