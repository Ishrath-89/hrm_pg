package StepDefination;

import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import GenericUtils.DriverUtils;
public class LoginSteps {
	LoginPage pge=new LoginPage();
	
	@Given("Open the Url")
	public void open_the_url() throws InterruptedException {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@When("enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
	    pge.enterUsername(string);
	    pge.enterPassword(string2);
	}

	@When("Click Login button")
	public void click_login_button() {
	    pge.clickLogin();
	}

	@Then("Login Successful")
	public void login_successful() {
	    System.out.println("Login Successfull");
	}
}
