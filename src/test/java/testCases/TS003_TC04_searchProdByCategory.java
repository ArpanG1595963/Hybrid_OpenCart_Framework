package testCases;

import java.util.Locale.Category;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.StoreFrontPage;
import pageObjects.productSearchPage;
import testBase.BaseClass;

public class TS003_TC04_searchProdByCategory extends BaseClass

{
	@Test(groups = "productSearch")
	public void searchProdByCorrectCategory()
	{
		logger.info("---->Searching product by Correct Category_TC Started<----");
		
		StoreFrontPage SfPage=new StoreFrontPage(driver);
		SfPage.clickSearchIcon();;
		
		productSearchPage productSearchPage=new productSearchPage(driver);
		productSearchPage.clearKeyword();
		productSearchPage.setKeyword(p.getProperty("searchProductName"));
		productSearchPage.selectCategory(p.getProperty("correctCategory"));
		productSearchPage.clickSearch();
		if(productSearchPage.searchedProdExistsByDescription()==true)
		{
			Assert.assertTrue(productSearchPage.searchedProdExistsByDescription());
			logger.info("---->Searching product by Correct Category : Passed<----");
		}
			
		else {
			Assert.fail();
			logger.info("---->Searching product by Correct Category : Failed<----");
		}
		
		
		}
	
	@Test(priority = 2 , groups = "productSearch")
	public void searchProdByWrongCategory()
	{
		logger.info("---->Searching product by Wrong Category_TC started<----");
		
		productSearchPage productSearchPage=new productSearchPage(driver);
		productSearchPage.clearKeyword();
		productSearchPage.setKeyword(p.getProperty("searchProductName"));
		productSearchPage.selectCategory(p.getProperty("wrongCategory"));
		productSearchPage.clickSearch();
		
		boolean prodNotexist=productSearchPage.ProductNotexists();
		if(prodNotexist==true)
		{
			Assert.assertTrue(true);
			logger.info("---->Searching product by Wrong Category : Passed<----");
		}
			
		else {
			Assert.fail();
			logger.info("---->Searching product by Wrong Category : Failed<----");
		}
		
		
	}
}
