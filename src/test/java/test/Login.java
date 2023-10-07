package test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	@Before
	public void setUp() {
		System.out.println("Browser Opens");
	}
	@After
	public void tearDown() {
		System.out.println("Browser got closed");
	}
	
	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
	    
		System.out.println("user is navigated to login page");
	}

	@When("^user enters valid username (.+)$")
	public void user_enters_valid_username(String userName) {
	    
		System.out.println("userenters the UN"+userName);
		//int a = 9/0;
	}

	@When("^valid password (.+)$")
	public void valid_password(String password) {
	    System.out.println("user enter the pin"+password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   System.out.println("user clicks on login button");
	}

	@Then("user should be login successfuly")
	public void user_should_be_login_successfuly() {
	   System.out.println("user is login to the application");
	}


	

}
