package StepDefination;

import Page.Admin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps {
	Admin adn=new Admin();
	@Given("Click the Admin button and Add")
	public void click_the_admin_button_and_add() {
	    
	}

	@When("enter valid Userrole {string},EmployeeName {string},Status {string},Username {string},Password {string}")
	public void enter_valid_userrole_employee_name_status_username_password(String string, String string2, String string3, String string4, String string5) {
	    
	}

	@When("Click Save button")
	public void click_save_button() {
	    
	}

	@Then("Save Successful")
	public void save_successful() {
	    
	}
}
