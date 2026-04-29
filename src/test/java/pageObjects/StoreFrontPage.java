package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class StoreFrontPage extends BasePage
{
	public StoreFrontPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkmyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath ="//a[text()='Login']")
	WebElement lnkLogin;
	
	@FindBy(xpath="//*[@placeholder=\"Search\"]")
	WebElement txtSearch;
	
	@FindBy(xpath = "//span[@class=\"input-group-btn\"]//button")
	WebElement btnSearchIcon;
	
	
	public void clickMyAcoount()
	{
		lnkmyAccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	public void clickSearch()
	{
		txtSearch.click();
	}
	
	public void setSearch(String prodName)
	{
		txtSearch.sendKeys(prodName);
	}
	
	public void clickSearchIcon()
	{
		btnSearchIcon.click();
	}
}

