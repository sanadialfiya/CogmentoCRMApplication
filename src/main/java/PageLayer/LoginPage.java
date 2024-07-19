package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Utility.Wait;

public class LoginPage extends BaseClass {

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void userEnterValidUsernameAndPassword(String Uname, String pass) {
		Wait.sendkeys(username, Uname);
		Wait.sendkeys(password, pass);
	}

	public void userClickOnLoginButton() {
		Wait.click(loginbutton);
	}

}
