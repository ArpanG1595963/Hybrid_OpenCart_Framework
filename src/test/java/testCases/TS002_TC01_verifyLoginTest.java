package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.LoginPage;
import pageObjects.StoreFrontPage;
import testBase.BaseClass;

public class TS002_TC01_verifyLoginTest extends BaseClass
	{
	@Test(groups = "Login")
		public void verifyLogin()
		{
		logger.info("<----Login test started----->");
		
			try 
			{
				logger.info("Try block executed");
				
				StoreFrontPage SFpage=new StoreFrontPage(driver);
				SFpage.clickMyAcoount();
				SFpage.clickLogin();
				
				LoginPage LPage=new LoginPage(driver);
				LPage.setUserID(p.getProperty("email"));
				LPage.setUserpwd(p.getProperty("password"));
				LPage.clickLoginBtn();
				
				AccountPage accPage=new AccountPage(driver);
				boolean targetPage=accPage.myAccountPageexists();
				if(targetPage==true)
				{
					Assert.assertTrue(targetPage);
				}
				else {
					Assert.fail();
				}
			}
				
			catch (Exception e) 
			{
				logger.info("Catch block executed");
				Assert.fail();
			}
		}
		
		
		
	}


