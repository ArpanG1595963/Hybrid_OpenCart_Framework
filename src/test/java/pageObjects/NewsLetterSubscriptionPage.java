package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class NewsLetterSubscriptionPage extends BasePage 
{
	public NewsLetterSubscriptionPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@value='1']")
	WebElement radiobtnSubscribe;
	
	
	public boolean CheckingSubscription()
	{
		return	radiobtnSubscribe.isSelected();
		
	}
}
