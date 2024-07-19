package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.HandleDropDown;
import Utility.Wait;

public class CompanyPage extends BaseClass {
	@FindBy(xpath = "//i[@class='building icon']")
	private WebElement companyLink;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createButton;

	@FindBy(xpath = "//label[text()='Name']/parent::div/descendant::input")
	private WebElement companyName;

	@FindBy(xpath = "//input[@name='url']")
	private WebElement companyWebsite;

	@FindBy(xpath = "//div[@name='channel_type']")
	private WebElement socialChannel;

	@FindBys(@FindBy(xpath = "//div[@name='channel_type']/descendant::span"))
	private List<WebElement> listSocialChannels;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//i[@class='trash icon']")
	private WebElement delete;

	@FindBy(xpath = "//button[@class='ui red button']")
	private WebElement confirmDelete;

	public CompanyPage() {
		PageFactory.initElements(driver, this);

	}
	
	
//	 When user click on companies link and click on create buttom
//	    Then user enter name as "MasterCard" website as "https://www.mastercard.com" and social channels as "Linkedin"
//	    Then click on save button
//	    And click on delete button and click on confirm delete
	
	public void clickOnCompaniesLinkAndCreate()
	{
		Wait.click(companyLink);
		Wait.click(createButton);
	}
	
	public void enterCompanyDetails(String company,String website,String socialchannel)
	{
		Wait.sendkeys(companyName, company);
		Wait.sendkeys(companyWebsite, website);
		Wait.click(socialChannel);
		
		HandleDropDown.selectItem(listSocialChannels, socialchannel);
	}
	
	public void clickOnSave()
	{
		Wait.click(saveButton);
		
	}
	
	public void clickOnDeleteAndClickOnConfirmDelete()
	{
		Wait.click(delete);
		Wait.click(confirmDelete);
	}
}
