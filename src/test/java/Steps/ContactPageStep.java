package Steps;

import java.util.List;

import PageLayer.ContactPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageStep {
	private static ContactPage contactPage;
	@When("user click on contacts link and click on create button")
	public void user_click_on_contacts_link_and_click_on_create_button() {
	  contactPage = new ContactPage();
	  contactPage.clickContactLinkAndCreateButton();
	}
	@Then("user enter firstname, lastname and select status")
	public void user_enter_firstname_lastname_and_select_status(DataTable dataTable) {
	   List<List<String>> ls = dataTable.asLists();
	   String fname = ls.get(0).get(0);
	   String lname = ls.get(0).get(1);
	   String status = ls.get(0).get(2);
	   contactPage.enterdetails(fname, lname, status);
	   
	}
	@Then("user click on save button")
	public void user_click_on_save_button() {
	    contactPage.clickSave();
	}
}
