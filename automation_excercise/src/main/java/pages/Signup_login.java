package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Signup_login {
	//---------------------------Locators-----------------------------------
	private By new_user_txt_xpath = By.xpath("//div/h2[text()='New User Signup!']");
	private By name_xpath = By.xpath("//form/input[@name='name']");
	private By email_xpath = By.xpath("//form[@action='/signup']/input[@name='email']");
	private By signup_btn_xpath = By.xpath("//form/button[text()='Signup']");
	private By cemail_xpath = By.xpath("//input[@data-qa='login-email']");
	private By pass_xpath = By.name("password");
	private By login_btn_xpath = By.xpath("//button[@data-qa='login-button']");
	private By login_txt_xpath = By.xpath("//div/h2[text()='Login to your account']");
	private By incrt_cred_xpath = By.xpath("//form/p[text()='Your email or password is incorrect!']");
	private By exist_cred_xpath = By.xpath("//form/p[text()='Email Address already exist!']");


	//-----------------------------end of locators----------------------
	
	//-----------------------------Methods------------------------------
	public void new_user_txtDisplayed(WebDriver driver) {
		WebElement new_user_txt = driver.findElement(new_user_txt_xpath);
		Assert.assertTrue(new_user_txt.isDisplayed(), "New user Signup! not displayed");
	}
	public void new_user_cred(WebDriver driver) {
		WebElement name = driver.findElement(name_xpath);
		name.sendKeys("Sana Sheikh");
		WebElement email = driver.findElement(email_xpath);
		email.sendKeys("sanajsheikh@gmail.com");
		WebElement signup_btn = driver.findElement(signup_btn_xpath);
		signup_btn.click();
	}
	
	public void exist_cred_reg(WebDriver driver) {
		new_user_cred(driver);
		WebElement exist_cred = driver.findElement(exist_cred_xpath);
		Assert.assertTrue(exist_cred.isDisplayed(), "Email Address already exist! is notdisplayed");
	}
	
	public void login_txt_Displayed(WebDriver driver) {
		WebElement login_to_acc = driver.findElement(login_txt_xpath);
		Assert.assertTrue(login_to_acc.isDisplayed(), "Login to your account not displlayed");
	}

	public void enter_correct_cred(WebDriver driver) {
		   WebElement cemail = driver.findElement(cemail_xpath);
		   cemail.sendKeys("sanajsheikh@gmail.com");
		   WebElement pass = driver.findElement(pass_xpath);
		   pass.sendKeys("12345");
		   WebElement login_btn = driver.findElement(login_btn_xpath);
		   login_btn.click();
	}
	public void enter_incorrect_cred(WebDriver driver) {
		   WebElement cemail = driver.findElement(cemail_xpath);
		   cemail.sendKeys("sanajsheikh@gmail.com");
		   WebElement pass = driver.findElement(pass_xpath);
		   pass.sendKeys("1234");
		   WebElement login_btn = driver.findElement(login_btn_xpath);
		   login_btn.click();
		   WebElement incrt_cred_txt = driver.findElement(incrt_cred_xpath);
		   Assert.assertTrue(incrt_cred_txt.isDisplayed(), "Incorrect credentials not displayed");
	}

}
