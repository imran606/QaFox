package test;

import io.cucumber.java.en.*;

public class Search {

	@Given("user opens the application")
	public void user_opens_the_application() {
	   System.out.println("application is open");
	}

	@When("user enters the valid product into the search textfield")
	public void user_enters_the_valid_product_into_the_search_textfield() {
	    System.out.println("user enters the valid product into searchfield");
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
	 System.out.println("user clicks on search button");
	}

	@Then("valid product should get displayed in search result")
	public void valid_product_should_get_displayed_in_search_result() {
	    System.out.println("valid product is displayed");
	}

	@When("user enters the invalid product into the search textfield")
	public void user_enters_the_invalid_product_into_the_search_textfield() {
       System.out.println("user should be able to search for invalid product");
	}

	@Then("proper error message should be displayed")
	public void proper_error_message_should_be_displayed() {
      System.out.println("proper error message is displayed");
	}


}
