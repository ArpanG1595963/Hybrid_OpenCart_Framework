package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class LoginPage extends BasePage

{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//*[@placeholder='E-Mail Address']")  //u_id: abc1@xyz.in
	WebElement emailLogin;
	
	@FindBy(xpath="//*[@placeholder='Password']")   //pwd : abc@xyz
	WebElement pwdLogin;
	
	@FindBy(xpath="//*[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//div[@class='form-group']//a[text()='Forgotten Password']")
	WebElement btnForgotPass;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement btnNewRegister;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement loginError;
	
	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	WebElement forgotmailconfirmation;
	
	
	public void setUserID(String u_id)
	{
		emailLogin.sendKeys(u_id);
	}
	
	public void setUserpwd(String u_pwd)
	{
		pwdLogin.sendKeys(u_pwd);
	}
	
	public void clickLoginBtn()
	{
		btnLogin.click();
	}
	
	public void clickForgotPass()
	{
		btnForgotPass.click();
	}
	
	public void clickRegister()
	{
		btnNewRegister.click();
	}
	
	public boolean loginErrorExists()
	{
		if(loginError.isDisplayed())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sentMailconfirmationForgot()
	{
		return forgotmailconfirmation.isDisplayed();
	}
	
	
}
