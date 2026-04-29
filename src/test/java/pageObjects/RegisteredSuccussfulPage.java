package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class RegisteredSuccussfulPage extends BasePage
{
	public RegisteredSuccussfulPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement msgSuccessregister;
	
	@FindBy(xpath = "//*[text()='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//div[@class=\"list-group\"]//a[text()='Logout']")
	WebElement btnLogout;

	
	public String validationRegConfirmation()
	{
		try
		{
			return msgSuccessregister.getText();
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public void clickContinue() 
	{
		btnContinue.click();
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}
	
	public boolean registeredSuccessPageExists()
	{
		return msgSuccessregister.isDisplayed();
			
	}
	
}
