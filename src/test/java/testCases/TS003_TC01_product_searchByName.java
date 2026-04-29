package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.StoreFrontPage;
import pageObjects.productSearchPage;
import testBase.BaseClass;

public class TS003_TC01_product_searchByName extends BaseClass
{
	@Test(priority = -1 , groups = "ProductSearch")
	public void search_product() throws InterruptedException
	{
		StoreFrontPage sfPage=new StoreFrontPage(driver);
		sfPage.clickSearch();
		sfPage.setSearch(p.getProperty("searchProductName"));
		sfPage.clickSearchIcon();
		
		
		productSearchPage pSearPage=new productSearchPage(driver);
		String prodN=pSearPage.verifysearchedprodName();
		if(prodN.equalsIgnoreCase(p.getProperty("searchProductName")))
		{
			Assert.assertTrue(true);
			Thread.sleep(2000);
		}
		
		else {
			Assert.fail();
		}
	}
	
	
}
