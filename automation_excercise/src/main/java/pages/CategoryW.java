package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CategoryW {
//---------------------------------locators-----------------------------------
	private By women_dress_txt_xpath = By.xpath("//h2[text()='Women - Dress Products']");
	private By men_cat_xpath = By.xpath("//a[@href='#Men']/span/i[@class='fa fa-plus']");
	private By tshirt_cat_xpath = By.xpath("//li/a[@href='/category_products/3']");


	
	
	
	
	//----------------------------------methods-----------------------------------------
	
	public void verify_categoryW(WebDriver driver) {
		String exp_title = "Dress Products";
		String act_title = driver.getTitle();
		Assert.assertTrue(act_title.contains(exp_title), "exp title not displayed");
		WebElement women_dress_txt = driver.findElement(women_dress_txt_xpath);
		Assert.assertTrue(women_dress_txt.isDisplayed(), "dress heading not displayed");
	}
	public void men_cat_clk(WebDriver driver) {
		WebElement men_cat = driver.findElement(men_cat_xpath);
		men_cat.click();
		WebElement tshirt_cat = driver.findElement(tshirt_cat_xpath);
		tshirt_cat.click();
	}
}
