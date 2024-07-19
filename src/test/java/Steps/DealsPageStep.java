package Steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;
import Utility.ExcelReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageStep extends BaseClass {
	private static DealsPage dealsPage;
	static String ExcelPath = System.getProperty("user.dir")+"/src/main/java/TestData/TestDataCogmenoDealsPage.xlsx";
	//String ExcelPath = "C:\\Users\\Supriya Pandit\\OneDrive\\Documents\\TestDataDealsPage.xlsx";
	
	@When("user click on deals link and click on create button")
	public void user_click_on_deals_link_and_click_on_create_button() {
	   dealsPage = new DealsPage();
	   dealsPage.clickOnDealsLinkAndCreateButton();
	    
	}
	@Then("user enter details from excel sheet {string} and {int}")
	public void user_enter_details_from_excel_sheet_and(String SheetName, Integer RowNumber) throws IOException {
	   ExcelReader reader = new ExcelReader();
	   List<Map<String,String>> testData = reader.getAllSheetTestData(ExcelPath, SheetName);
	   String title = testData.get(RowNumber).get("Title");
	   String description = testData.get(RowNumber).get("Description");
	   String amount = testData.get(RowNumber).get("Amount");
	   dealsPage.enterDealsDetails(title, description, amount);
	}
	@Then("user click on delete button and confirm delete")
	public void user_click_on_delete_button_and_confirm_delete() {
		
		dealsPage.clickOnDelete();
	   
	}


}
