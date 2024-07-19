package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.Wait;

public class DealsPage extends BaseClass{
	
	@FindBy(xpath="//a[@href='/deals']")
	private WebElement dealsLink;
	
	@FindBy(xpath="//a[@href='/deals/new']")
	private WebElement createButton;
	
	@FindBy(name="title")
	private WebElement title;
	
	@FindBy(name="description")
	private WebElement description;
	
	@FindBy(name="amount")
	private WebElement amount;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//i[@class='trash icon']")
	private WebElement delete;
	
	@FindBy(xpath="//button[@class='ui red button']")
	private WebElement confirmDelete;
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	When user click on deals link and click on create button
//    Then user enter details from excel sheet "<SheetName>" and <RowNumber>
//    And user click on save button
//    And user click on delete button and confirm delete
	
	public void clickOnDealsLinkAndCreateButton()
	{
		Wait.click(dealsLink);
		Wait.click(createButton);
	}
	
	public void enterDealsDetails(String Title, String Description, String Amount)
	{
		Wait.sendkeys(title, Title);
		Wait.sendkeys(description, Description);
		Wait.sendkeys(amount, Amount);
	}
	
	public void clickOnDelete()
	{
		//Wait.click(save);
		Wait.click(delete);
		Wait.click(confirmDelete);
	}
}
