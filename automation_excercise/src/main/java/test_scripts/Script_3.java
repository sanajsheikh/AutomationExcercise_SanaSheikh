package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Cart_page;
import pages.ContactUs;
import pages.Homepage;
import pages.Testcase_page;
import utils.Driver_setup;

public class Script_3 {
WebDriver driver;
//-------------Random----------------	
	@Test
	public void contact_us()  {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.contact_us_clk(driver);
		
		ContactUs cup = new ContactUs();
		cup.get_in_touch_visible(driver);
		cup.fill_details(driver);
		cup.success_display(driver);
		
		hp.homepage_displayed(driver);		
	}
	
	@Test
	public void testcase() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.testcase_clk(driver);
		
		Testcase_page tcp = new Testcase_page();
		tcp.testcase_page(driver);
	}
	
	@Test
	public void verify_subscription_hp() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.subscrptn_verify(driver);
	}
	
	@Test
	public void verify_subscription_cp() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.cart_btn_clk(driver);
		
		Cart_page cp = new Cart_page();
		cp.subscrptn(driver);
	}
	@Test
	public void verify_scroll_arrow() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.scroll_down(driver);
		hp.up_arrow(driver);
		hp.verify_auto_prc_txt(driver);
	}
	@Test
	public void verify_scroll_up_arrow() {
		driver = Driver_setup.testBrowserSetUp();
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);
		hp.homepage_displayed(driver);
		hp.scroll_down(driver);
		hp.scroll_up(driver);
		hp.verify_auto_prc_txt(driver);
	}
}
