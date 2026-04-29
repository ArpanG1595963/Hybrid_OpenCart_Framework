package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.StoreFrontPage;
import pageObjects.productSearchPage;
import testBase.BaseClass;

public class TS003_TC02_NoProductExists extends BaseClass
{
	@Test(groups = "ProductSearch")
	public void verifyNoProductExists()
	{
		StoreFrontPage sF2=new StoreFrontPage(driver);
		sF2.clickSearch();
		sF2.setSearch(p.getProperty("Noproductavailable"));
		sF2.clickSearchIcon();
		
		productSearchPage pSearPage=new productSearchPage(driver);
		boolean prodstat=pSearPage.ProductNotexists();
		if(prodstat==true)
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
}
