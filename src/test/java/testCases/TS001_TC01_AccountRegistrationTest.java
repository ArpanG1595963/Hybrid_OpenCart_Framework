package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegisteredSuccussfulPage;
import pageObjects.RegistrationPage;
import pageObjects.StoreFrontPage;
import testBase.BaseClass;

public class TS001_TC01_AccountRegistrationTest extends BaseClass
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
	
	@Test(priority = 1,dependsOnMethods = "create_registration()",groups = "Registration")
	public void verify_registration_msg()
	{
		RegisteredSuccussfulPage regSuccPage=new RegisteredSuccussfulPage(driver);
		logger.info("---->Validating success msg<-----");
		String successRegistration=  regSuccPage.validationRegConfirmation();
		Assert.assertEquals(successRegistration, "Your Account Has Been Created!");
		regSuccPage.clickContinue();
	}
	
}
