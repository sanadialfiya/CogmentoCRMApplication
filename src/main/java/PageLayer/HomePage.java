package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.Wait;

public class HomePage extends BaseClass
{
	@FindBy(xpath="//div[@class='header item']")
	private WebElement homePageLogo;
	
//	   When user is on home page then validate the home page logo
//	    Then validate the home page title as "Cogmento CRM"
//	    Then validate the home page url
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo()
	{
		 return Wait.isDisplayed(homePageLogo);
	}
	
	public String validateTitle()
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	
	public String validateHomePageUrl()
	{
		String actualUrl = driver.getCurrentUrl();
		return actualUrl;
	}

}
