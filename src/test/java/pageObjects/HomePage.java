package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Register'][@class='btn btn-black navbar-btn']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[text()='Login'][@class='btn btn-black navbar-btn']")
	WebElement lnkLogin;
	
	@FindBy(xpath="//*[@title=\"OpenCart - Demo\"]")
	WebElement imgTitle;
	
	@FindBy(xpath="//*[contains(@class ,\"chat-provider__trigger -\")]")
	WebElement chatAI;
	
	@FindBy(xpath = "//a[@href='https://demo.opencart.com/']")
	WebElement lnkStoreFront;
	
	@FindBy(xpath="//a[@href='https://demo.opencart.com/TlbeVW/']")
	WebElement lnkAdminPage;
	
	
	@FindBy(xpath="//a[text()=\"Official Documentation\"]")
	WebElement lnkOfficialDocuments;
	
	
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}

	public void clickChatAI()
	{
		chatAI.click();
	}
	
	public void clicklnkStoreFront()
	{
		lnkStoreFront.click();
	}
	
	public void clickAdminStore()
	{
		lnkAdminPage.click();
	}
	
	public void clickOfficialDocument() 
	{
		lnkOfficialDocuments.click();
	}
	
}
