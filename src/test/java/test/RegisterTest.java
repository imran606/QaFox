package test;

import io.cucumber.java.en.*;

public class RegisterTest {
	
	@Given ("^User navigate to the registration page$") // ^ and $ symbols are not mandatory (^ represents starts with and $ represents ends with )
	public void User_navigate_to_the_registration_page() {
		
		System.out.println(">> user is navigated to the registration page");
		
	}
	@When ("User enter the first name {string} into the first name textfield")
	public void User_enter_the_first_name_into_the_first_name_textfield(String firstNameText) {
		System.out.println(">> User enters the firstname"+firstNameText+ " into the first name text field");
		
	}
	
	@And("User enters the last name {string} into the last name text field")
	public void User_enters_the_last_name_into_the_last_name_text_field(String lastNameText) {
	
	System.out.println(">> User enters the last name  "+lastNameText);
	
}
	
	@And("User enters the Email {string} into email textfield")
	public void User_enters_the_Email_into_email_textfield(String emailText) {
		System.out.println(">>User_enters_the_Email_into_email_textfield");
		
		
	}
	
	@And("User enters the Telephone {string} into telephone textfield")
	public void User_enters_the_Telephone_into_telephone_textfield(String emailText) {
		
		System.out.println(">>User enters the Telephone into telephone textfield");
	}
	
	@And("User enters the password {string} into password text field")
	public void User_enters_the_password_into_password_text_field(String passwordText) {
		System.out.println(">>User enters the password into password textfield");
		
	}
	
	@And("user enters the confirmpassaword {string} into confirmpassword text field")
	public void user_enters_the_confirmpassaword_into_confirmpassword_text_field(String confirmPassword) {
		System.out.println(">>user enters the confirm password into confirm password textfield");
		
	}
	
	@And("Select Yes for newslettr")
	public void Select_Yes_for_newslettr() {
		System.out.println(">>User select the newslettr option");
		
	}
	
	@And("Click on privacy policy checkbox")
	public void Click_on_privacy_policy_checkbox() {
		System.out.println(">>user clicks on the privacy policy");
		
	}
	@And("User dont enter any details into the fields")
	public void User_dont_enter_any_details_into_the_fields() {
		System.out.println(">>dont enter anything");
		
	}
	
	@And("click on continue button")
	public void click_on_continue_button(){
		System.out.println(">> User clicked on continue button");
		
	}
	
	@Then("Account should got successfully created")
	public void Account_should_got_successfully_created() {
		System.out.println(">> account should get successfilly created and confirmation message is displayed");
		
	}
	@Then("Proper error message should be display")
	public void Proper_error_message_should_be_display() {
		System.out.println(">>proper error message is displayed");
	}

}
