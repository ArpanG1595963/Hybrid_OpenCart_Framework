package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.LoginPage;
import pageObjects.StoreFrontPage;
import testBase.BaseClass;

public class TS004_TC01_ForgotPassword extends BaseClass
{
	@Test(priority = -1)
	public void validateCredentials()
	{
		logger.info("Test execution start to check forgot password functionality");
		
		StoreFrontPage sfPage=new StoreFrontPage(driver);
		sfPage.clickMyAcoount();
		sfPage.clickLogin();
		
		LoginPage logPage=new LoginPage(driver);
		logPage.setUserID(p.getProperty("email"));
		logPage.setUserpwd("password");
		logPage.clickLoginBtn();
		
		boolean errorExist=logPage.loginErrorExists();
		if(errorExist==true)
		{
			logPage.clickForgotPass();
			Assert.assertTrue(errorExist);
		}
		else {
			Assert.fail();
		}
		
		
	}
	
	
	@Test(priority = 1)
	public void verifyForgotPasword() 
	{
		ForgotPasswordPage FPage=new ForgotPasswordPage(driver);
		FPage.setEmailAddress(p.getProperty("email"));
		FPage.clickContinueBtn();
		
		LoginPage lpage=new LoginPage(driver);
		if(lpage.sentMailconfirmationForgot()==true)
		{
			Assert.assertTrue(true);;
		}
		else {
			Assert.fail();
		}
	}
	
	
}
