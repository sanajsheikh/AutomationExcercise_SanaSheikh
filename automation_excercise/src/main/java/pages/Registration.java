package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Registration {
	//-----------------------Locators--------------------------------
	
	private By enter_info_txt_xpath = By.xpath("//h2/b[text()='Enter Account Information']");
	private By title_xpath = By.xpath("//span/input[@id='id_gender2']");
	private By pwd_xpath = By.xpath("//input[@id='password']");
	private By day_sel_xpath = By.xpath("//select[@id='days']");
	private By month_sel_xpath = By.xpath("//select[@id='months']");
	private By year_sel_xpath = By.xpath("//select[@id='years']");
	private By newsletter_xpath = By.id("newsletter");
	private By offer_ckhbx_xpath = By.id("optin");
	private By fname_xpath = By.id("first_name");
	private By lname_xpath = By.id("last_name");
	private By company_xpath = By.id("company");
	private By addr1_xpath = By.id("address1");
	private By addr2_xpath = By.id("address2");
	private By country_sel_xpath = By.xpath("//select[@id='country']");
	private By state_xpath = By.id("state");
	private By city_xpath = By.id("city");
	private By zipcode_xpath = By.id("zipcode");
	private By mob_no_xpath = By.id("mobile_number");
	private By create_acc_btn_xpath = By.xpath("//button[@data-qa='create-account']");
		
	
	//------------------------End of locators------------------------
	
	//-------------------------Methods-------------------------------
	public void enter_details1(WebDriver driver) {
		WebElement enter_info_txt = driver.findElement(enter_info_txt_xpath);
		Assert.assertTrue(enter_info_txt.isDisplayed(), "Enter Account Information not displayed");
		
		WebElement title = driver.findElement(title_xpath);
		title.click();		
		WebElement pwd = driver.findElement(pwd_xpath);
		pwd.sendKeys("12345");
		
		WebElement day_sel = driver.findElement(day_sel_xpath);
		Select sel_d = new Select(day_sel);
		sel_d.selectByValue("10");
		WebElement month_sel = driver.findElement(month_sel_xpath);
		Select sel_m = new Select(month_sel);
		sel_m.selectByVisibleText("October");
		WebElement year_sel = driver.findElement(year_sel_xpath);
		Select sel_y = new Select(year_sel);
		sel_y.selectByVisibleText("1999");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement newsletter = driver.findElement(newsletter_xpath);
		newsletter.click();
		WebElement offer_chkbx = driver.findElement(offer_ckhbx_xpath);
		offer_chkbx.click();	
	}
	
	public void enter_addr_info(WebDriver driver) {
		WebElement fname = driver.findElement(fname_xpath);
		fname.sendKeys("Sana");
		WebElement lname = driver.findElement(lname_xpath);
		lname.sendKeys("Sheikh");
		WebElement company =  driver.findElement(company_xpath);
		company.sendKeys("Wipro");
		WebElement addr1 = driver.findElement(addr1_xpath);
		addr1.sendKeys("White house,behind Gram Panchayat");
		WebElement addr2 = driver.findElement(addr2_xpath);
		addr2.sendKeys("Kalusta,Chiplun");
		
		WebElement country_sel = driver.findElement(country_sel_xpath);
		Select sel_c = new Select(country_sel);
		sel_c.selectByValue("India");
		
		WebElement city = driver.findElement(city_xpath);
		city.sendKeys("Ratnagiri");		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement state = driver.findElement(state_xpath);
		state.sendKeys("Maharashtra");		
		WebElement zipcode = driver.findElement(zipcode_xpath);
		zipcode.sendKeys("415605");
		WebElement mob_no = driver.findElement(mob_no_xpath);
		mob_no.sendKeys("7030566104");
		WebElement create_acc_btn = driver.findElement(create_acc_btn_xpath);
		create_acc_btn.click();	
		
	}
	
}
