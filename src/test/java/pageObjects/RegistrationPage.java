package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class RegistrationPage extends BasePage
{

	public RegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement txtFirstName;
	
	@FindBy(xpath="//*[@placeholder=\"Last Name\"]")
	WebElement txtLastName;
	
	@FindBy(xpath="//*[@placeholder=\"E-Mail\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//*[@placeholder='Password Confirm']")
	WebElement pwdconf;
	
	@FindBy(xpath="//div[@class='col-sm-10']/label[1]")
	WebElement radSubscriber;
	
	@FindBy(xpath="//div[@class='col-sm-10']/label[2]")
	WebElement radNonSubscriber;
	
	@FindBy(xpath="//*[@name='agree']")
	WebElement chkbxPrivacyAgree;
	
	@FindBy(xpath="//*[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//*[@placeholder='Telephone']")
	WebElement tel;
	
	@FindBy(xpath="//*[text()='First Name must be between 1 and 32 characters!']")
	WebElement errorFirstname;
	
	@FindBy(xpath="//*[text()='Last Name must be between 1 and 32 characters!']")
	WebElement errorLastname;
	
	@FindBy(xpath="//*[text()='E-Mail Address does not appear to be valid!']")
	WebElement errorEmail;
	
	public void setFirstName(String FName)
	{
		txtFirstName.sendKeys(FName);
	}
	
	public void setlastName(String LName)
	{
		txtLastName.sendKeys(LName);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setTeleno(String telno)
	{
		tel.sendKeys(telno);
	}
	
	public void setPassword(String pwd)
	{
		this.pwd.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String confpwd)
	{
		pwdconf.sendKeys(confpwd);
	}
	
	public void ClickSubscribe()
	{
		radSubscriber.click();
	}
	
	public void ClickNonSubscribe()
	{
		radNonSubscriber.click();
	}
	
	public void ClickPrivacyPol()
	{
		chkbxPrivacyAgree.click();
	}
	
	public void clickBtnContinue()
	{
		btnContinue.click();
	}
	
	public boolean errorFirstNameErrorExists()
	{
		if(errorFirstname.isDisplayed())
			return true;
		else {
			return false;
		}
	}
	
	public boolean errorLastNameErrorExists()
	{
		if(errorLastname.isDisplayed())
			return true;
		else {
			return false;
		}
	}

	public boolean isEmailValidationErrorDisplayed() {
	    try {
	        return errorEmail.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
}
