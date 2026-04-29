package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.LoginPage;
import pageObjects.StoreFrontPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TS002_TC02_DataDriventTestLogin extends BaseClass

{
	@Test(dataProvider ="LoginData" ,dataProviderClass = DataProviders.class , groups = "Login" )
	public void verify_DDTlogin(String email, String pwd, String exp_res)
	{
		try {
			StoreFrontPage sPage=new StoreFrontPage(driver);
			sPage.clickMyAcoount();
			sPage.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserID(email);
			lp.setUserpwd(pwd);
			lp.clickLoginBtn();
			
			AccountPage myAccountPage=new AccountPage(driver);
			boolean targetPage= myAccountPage.myAccountPageexists();
			
			if(exp_res.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					myAccountPage.clickLogout();
					Assert.assertTrue(true);
				}
				else {
					Assert.fail();
				}
			}
			if(exp_res.equalsIgnoreCase("Invalid")) {
				if(targetPage==true)
				{
					myAccountPage.clickLogout();
					Assert.fail();
				}
				else {
					Assert.assertTrue(true);
				}
			}
			
		} catch (Exception e) {
			Assert.fail();
		}
			
		
	}
	

}
