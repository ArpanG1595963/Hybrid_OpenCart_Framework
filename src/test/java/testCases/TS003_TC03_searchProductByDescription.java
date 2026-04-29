package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.StoreFrontPage;
import pageObjects.productSearchPage;
import testBase.BaseClass;

public class TS003_TC03_searchProductByDescription extends BaseClass
{
	@Test(groups = "ProductSearch")
	public void verifyProductnotexist()
	{
		StoreFrontPage Sfpage=new StoreFrontPage(driver);
		Sfpage.clickSearch();
		Sfpage.setSearch("op");
		Sfpage.clickSearchIcon();
		
		productSearchPage pSearchPage=new productSearchPage(driver);
		if(pSearchPage.ProductNotexists()==true)
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
	@Test(priority = 2)
	public void verifyprodByDescription()
	{
		productSearchPage productSearchPage=new productSearchPage(driver);
		productSearchPage.clearKeyword();
		productSearchPage.setKeyword(p.getProperty("productKeyword"));
		productSearchPage.clickCheckbox();
		productSearchPage.clickSearch();
		boolean targetProdByDesc =productSearchPage.searchedProdExistsByDescription();
		if(targetProdByDesc==true)
			Assert.assertTrue(targetProdByDesc);
		else {
			Assert.fail();
		}
		
		
	}


}
