package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.NewsLetterSubscriptionPage;
import pageObjects.RegisteredSuccussfulPage;
import pageObjects.RegistrationPage;
import pageObjects.StoreFrontPage;
import testBase.BaseClass;

public class TS001_TC02_verifyNewsLetterFieldRegistration extends BaseClass
{
	@Test(priority = 0 , groups  = "Registration")
	public void create_registration()
	{
		
		logger.info("---->Starting TC01<-----");
		
		try 
		{
			StoreFrontPage SFPage=new StoreFrontPage(driver);
			SFPage.clickMyAcoount();
			logger.info("---->Clicked on Account Link<-----");
			SFPage.clickRegister();
			logger.info("---->Clicked on Register Link<-----");
			
			RegistrationPage regPage=new RegistrationPage(driver);
			logger.info("---->Provided Customer details<-----");
			regPage.setFirstName(randomString());
			regPage.setlastName(randomString());
			regPage.setEmail(randomString()+"@xyz.com");
			regPage.setTeleno("+91"+ randomNumeric());
			String genpwdString =randomAlpha();
			regPage.setPassword(genpwdString);
			regPage.setConfirmPassword(genpwdString);
			regPage.ClickSubscribe();
			regPage.ClickPrivacyPol();
			regPage.clickBtnContinue();	
			Assert.assertTrue(true);
		}
		catch (Exception e) 
		{
			logger.debug(e.getMessage());
			Assert.fail();
		}
		
		
	}
	
	@Test(priority=1 , groups = "Registration")
	public void verify_newsletterfield() throws InterruptedException
	{
		RegisteredSuccussfulPage rsuccpage=new RegisteredSuccussfulPage(driver);
		rsuccpage.clickContinue();
		
		AccountPage myaccPage=new AccountPage(driver);
		myaccPage.clickNewsLetterbtn();
		
		
		NewsLetterSubscriptionPage newsLetPage=new NewsLetterSubscriptionPage(driver);
		Thread.sleep(1000);
		boolean subscriptionCheck=newsLetPage.CheckingSubscription();
		
		if(subscriptionCheck==true)
		{
			Assert.assertTrue(subscriptionCheck);
		}
		else {
			Assert.fail();
		}
	}
	
}
