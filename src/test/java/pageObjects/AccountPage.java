package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class AccountPage extends BasePage 
{
	public AccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[@class=\"list-group-item\"][text()=\"Logout\"]")
	WebElement btnLogout;
	
	@FindBy(xpath="//div[@id='content']//*[text()='My Account']")
	WebElement btnMyAccount;
	
	@FindBy(xpath="//*[text()='Subscribe / unsubscribe to newsletter']")
	WebElement btnNewsletter;
	
	public void clickLogout()
	{
		btnLogout.click();
	}
	
	public boolean myAccountPageexists()
	{
		try {
			return (btnMyAccount.isDisplayed());
		}
		catch (Exception e) 
		{
			
			 e.getMessage();
			 return false;
		}
	}
	
	public void clickNewsLetterbtn()
	{
		btnNewsletter.click();
	}
}
