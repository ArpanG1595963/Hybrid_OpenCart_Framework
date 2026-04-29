package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;

import testBase.BasePage;

public class productSearchPage extends BasePage
{
	public productSearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[text()=\"iMac\"]")
	WebElement searchedProdName;
	
	@FindBy(xpath = "//*[text()=\"There is no product that matches the search criteria.\"]")
	WebElement msgNoProduct;
	
	@FindBy(xpath = "//*[@placeholder=\"Keywords\"]")
	WebElement txtKeyword;
	
	@FindBy(xpath="//*[text()='Search in product descriptions']")
	WebElement chkboxSearch;
	
	@FindBy(xpath="//*[@value=\"Search\"]")
	WebElement btnSearch;
	
	@FindBy(xpath="//img[@title=\"iMac\"]")
	WebElement prodBydescription;
	
	public String verifysearchedprodName()
	{
		return  searchedProdName.getText();
	}
	
	public boolean ProductNotexists()
	{
		return msgNoProduct.isDisplayed();
	}
	
	public void setKeyword(String KeyW)
	{
		txtKeyword.sendKeys(KeyW);
	}
	public void clickCheckbox()
	{
		chkboxSearch.click();
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	public void clearKeyword()
	{
		txtKeyword.clear();
	}
	public boolean searchedProdExistsByDescription()
	{
		return prodBydescription.isDisplayed();
	}
}
