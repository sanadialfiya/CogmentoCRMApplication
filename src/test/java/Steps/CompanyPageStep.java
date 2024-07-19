package Steps;

import BaseLayer.BaseClass;
import PageLayer.CompanyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyPageStep extends BaseClass
{
	
	private static CompanyPage companyPage;
	
	@When("user click on companies link and click on create buttom")
	public void user_click_on_companies_link_and_click_on_create_buttom() {
		
	  companyPage = new CompanyPage();
	  companyPage.clickOnCompaniesLinkAndCreate();
	}

	@Then("user enter name as {string} website as {string} and social channels as {string}")
	public void user_enter_name_as_website_as_and_social_channels_as(String companyName, String website, String socialChannel) {
		companyPage.enterCompanyDetails(companyName, website, socialChannel);
	}

	@Then("click on save button")
	public void click_on_save_button() {
		companyPage.clickOnSave();
	}

	@Then("click on delete button and click on confirm delete")
	public void click_on_delete_button_and_click_on_confirm_delete() {
		companyPage.clickOnDeleteAndClickOnConfirmDelete();
	}

}
