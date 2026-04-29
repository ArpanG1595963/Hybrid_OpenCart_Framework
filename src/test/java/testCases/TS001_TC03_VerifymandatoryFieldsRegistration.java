package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegistrationPage;
import pageObjects.StoreFrontPage;
import testBase.BaseClass;

public class TS001_TC03_VerifymandatoryFieldsRegistration extends BaseClass
{
	@Test (priority = 1, groups = "Registration")
	public void verifyFirstNameField()
	{
		StoreFrontPage sf=new StoreFrontPage(driver);
		sf.clickMyAcoount();
		sf.clickRegister();
		
		RegistrationPage regPage=new RegistrationPage(driver);
		regPage.setlastName(randomString());
		regPage.setEmail(randomString()+"@xyz.com");
		regPage.setTeleno("+91"+randomNumeric());
		String pwd=randomAlpha();
		regPage.setPassword(pwd);
		regPage.setConfirmPassword(pwd);
		regPage.ClickPrivacyPol();
		regPage.clickBtnContinue();
		boolean mandortyFNameError= regPage.errorFirstNameErrorExists();
		if(mandortyFNameError==true)
		{
			Assert.assertTrue(mandortyFNameError);
		}
		else {
			Assert.fail();
		}
		
	}
	
	
	@Test(priority = 2)
	public void verifyLastNameField()
	{
		StoreFrontPage sf=new StoreFrontPage(driver);
		sf.clickMyAcoount();
		sf.clickRegister();
		
		RegistrationPage regPage=new RegistrationPage(driver);
		regPage.setFirstName(randomString());
		regPage.setEmail(randomString()+"@xyz.com");
		regPage.setTeleno("+91"+randomNumeric());
		String pwd=randomAlpha();
		regPage.setPassword(pwd);
		regPage.setConfirmPassword(pwd);
		regPage.ClickPrivacyPol();
		regPage.clickBtnContinue();
		boolean mandortyLNameError= regPage.errorLastNameErrorExists();
		if(mandortyLNameError==true)
		{
			Assert.assertTrue(mandortyLNameError);
		}
		else {
			Assert.fail();
		}
	}
	
	/*@Test(dataProvider = "EmailregistrationData" , dataProviderClass = DataProviders.class)
	public void EmailCheckDDTRegistration(String email , String result)
	{
		StoreFrontPage sf=new StoreFrontPage(driver);
		sf.clickMyAcoount();
		sf.clickRegister();
		
		RegistrationPage regPage=new RegistrationPage(driver);
		regPage.setFirstName(randomString());
		regPage.setlastName(randomString());
		 if(email == null || email.trim().isEmpty()) {
		        regPage.setEmail("");
		    } else {
		        regPage.setEmail(email);
		    }
		regPage.setTeleno("+91"+randomNumeric());
		String pwd=randomAlpha();
		regPage.setPassword(pwd);
		regPage.setConfirmPassword(pwd);
		regPage.ClickPrivacyPol();
		regPage.clickBtnContinue();
		
		result = result.trim().toLowerCase();
	    RegisteredSuccussfulPage regsucPage = new RegisteredSuccussfulPage(driver);
	    
	   
	    	 if(result.equals("valid"))
	    	 {
	    		  Assert.assertTrue(regsucPage.registeredSuccessPageExists(),
	 	 	                "Expected success page for valid email");

	 	 	        regsucPage.clickLogout();
	    	 }
	    		
	    	 	
	 	    else if(result.equals("invalid"))
	 	    {
	 	        boolean errorDisplayed = regsucPage.registeredSuccessPageExists();

	 	        Assert.assertFalse(errorDisplayed);
	 	    }
	  
}
*/

}