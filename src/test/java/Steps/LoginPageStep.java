package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	private static LoginPage loginpage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		String uname = prop.getProperty("USERNAME");
		String pass = prop.getProperty("PASSWORD");
		loginpage = new LoginPage();
		loginpage.userEnterValidUsernameAndPassword(uname, pass);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginpage.userClickOnLoginButton();
	}

}
