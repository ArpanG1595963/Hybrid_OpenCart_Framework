package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class ForgotPasswordPage extends BasePage 
{
	public ForgotPasswordPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@placeholder='E-Mail Address']")
	WebElement emailAddressPlaceholder;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueBtn;
	
	public void setEmailAddress(String usr_email_id)
	
	{
		emailAddressPlaceholder.sendKeys(usr_email_id);
	}
	
	public void clickContinueBtn()
	{
		continueBtn.click();
	}
	
}
