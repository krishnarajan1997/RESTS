package com.stepdefinition;

import org.helperclass.BaseClass;
import org.junit.Assert;
import org.pom.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Mainclass extends BaseClass{
	@Given("enter the valid data to username and password")
	public void enter_the_valid_data_to_username_and_password() {
		
		Login l=new Login();
sendKey(l.getUser(), "krishnarajan");
sendKey(l.getPass(), "krishnarajan");
}

	@When("click the login button")
	public void click_the_login_button() {
		Login l=new Login();
		elementClick(l.getLog());
}

	@Then("verify the outcome result")
	public void verify_the_outcome_result() {
		Assert.assertTrue(false);

}

	@Given("Enter  invalid user and password")
	public void enter_invalid_user_and_password() {
		
		Login l=new Login();
sendKey(l.getUser(), "krishnaraj");
sendKey(l.getPass(), "krishnaraj");
}

	@When("Click login")
	public void click_login() {
		Login l=new Login();
		elementClick(l.getLog());

}

	@Then("check the result")
	public void check_the_result() {
		Assert.assertTrue(false);
	}

	@Given("pass the data to username only")
	public void pass_the_data_to_username_only() {
	
		Login l=new Login();
		sendKey(l.getUser(), "krishnaraj");
		sendKey(l.getPass(), "");
}

	@When("click the log button in page")
	public void click_the_log_button_in_page() {
		Login l=new Login();
elementClick(l.getLog());
}

	@Then("Check the outcome result")
	public void check_the_outcome_result() {
		Assert.assertTrue(false);
	}
}
