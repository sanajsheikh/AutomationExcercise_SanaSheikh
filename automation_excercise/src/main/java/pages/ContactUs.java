package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContactUs {
//----------------------locators----------------------------------
	private By get_in_touch_xpath = By.xpath("//h2[text()='Get In Touch']");
	private By name_xpath = By.xpath("//div/input[@name='name']");
	private By email_xpath = By.xpath("//div/input[@name='email']");
	private By subject_xpath = By.xpath("//div/input[@name='subject']");
	private By msg_xpath = By.xpath("//div/textarea[@id='message']");
	private By upload_file_xpath = By.xpath("//div/input[@name='upload_file']");
	private By submit_btn_xpath = By.xpath("//div/input[@name='submit']");
	private By success_txt_xpath = By.xpath("//div[@class='status alert alert-success']");
	private By homepage_btn_xpath = By.xpath("//a/span[text()=' Home']");
	
	//----------------methods-----------------------------------
	
	public void get_in_touch_visible(WebDriver driver) {
		WebElement get_in_touch_txt = driver.findElement(get_in_touch_xpath);
		Assert.assertTrue(get_in_touch_txt.isDisplayed(), "GEt in touch not displayed");
	}
	
	public void fill_details(WebDriver driver) {
		WebElement name = driver.findElement(name_xpath);
		name.sendKeys("Sana Sheikh");
		WebElement email = driver.findElement(email_xpath);
		email.sendKeys("sanajsheikh@gmail.com");
		WebElement subject = driver.findElement(subject_xpath);
		subject.sendKeys("Problem in placing order");
		WebElement message = driver.findElement(msg_xpath);
		message.sendKeys("Uable to place any sort of order on the website");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement upload = driver.findElement(upload_file_xpath);
		upload.sendKeys("C:\\Users\\sanaj\\Downloads\\Image20240123205053.png");
		WebElement submit_btn = driver.findElement(submit_btn_xpath);
		submit_btn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void success_display(WebDriver driver) {
		WebElement success_txt = driver.findElement(success_txt_xpath);
		Assert.assertTrue(success_txt.isDisplayed(), "Success txt not displayed");
		System.out.println("Successfull txt displayed");
		
		WebElement homepage_btn = driver.findElement(homepage_btn_xpath);
		homepage_btn.click();
		System.out.println("clk hp btn");
		driver.navigate().back();
		homepage_btn.click();
	
	}
}
