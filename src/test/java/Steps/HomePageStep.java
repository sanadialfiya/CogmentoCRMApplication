package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	protected static HomePage homePage;

	@When("user is on home page then validate the home page logo")
	public void user_is_on_home_page_then_validate_the_home_page_logo() {
		homePage = new HomePage();
		boolean actualLogo = homePage.validateLogo();
		Assert.assertEquals(actualLogo, true);
	}

	@Then("validate the home page title as {string}")
	public void validate_the_home_page_title_as(String expectedTitle) {
		String actualTitle = homePage.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Then("validate the home page url")
	public void validate_the_home_page_url() {
		String actualUrl = homePage.validateHomePageUrl();
		Assert.assertEquals(actualUrl.contains("cogmento"),true);
	}
	
	@AfterStep
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}
