package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.HandleDropDown;
import Utility.Wait;

public class ContactPage extends BaseClass{
	
	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contactlink;
	
	@FindBy(xpath= "//a[@href='/contacts/new']")
	private WebElement createcontact;
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(name="status")
	private WebElement status;
	
	@FindBys(@FindBy(xpath="//div[@class='visible menu transition']/descendant::span"))
	private List<WebElement> statusList;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickContactLinkAndCreateButton()
	{
		Wait.click(contactlink);
		Wait.click(createcontact);
	}
	
	public void enterdetails(String Fname, String Lname, String Status)
	{
		Wait.sendkeys(firstname, Fname);
		Wait.sendkeys(lastname, Lname);
		Wait.click(status);
		HandleDropDown.selectItem(statusList, Status);
	}
	
	public void clickSave()
	{
		Wait.click(save);
	}

}
