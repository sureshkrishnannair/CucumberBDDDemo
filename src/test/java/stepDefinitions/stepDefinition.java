package stepDefinitions;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	//Scenario: Verify User Login to the application regular Expression1
	//Scenario: Verify User Login to the application regular Expression2
	
	@Given("^Application is displayed on the screen$")
    public void application_is_displayed_on_the_screen() throws Throwable {
       System.out.println("1");
    }
    @When("^user enter username with \"([^\"]*)\"$")
    public void user_enter_username_with_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
    @And("^user click on login button$")
    public void user_click_on_login_button() throws Throwable {
    	System.out.println("2");
    }
    @Then("^user lands on client info screen$")
    public void user_lands_on_client_info_screen() throws Throwable {
    	System.out.println("2");
    }
    
    
//Scenario: Verify User Login to the application Data Table
    @Given("^user lands on checkout page$")
    public void user_lands_on_checkout_page() throws Throwable {
    	System.out.println("2");
    }

    @When("^user clicks on buy button$")
    public void user_clicks_on_buy_button() throws Throwable {
    	 System.out.println("1");
    }
    @And("^user click on proceed$")
    public void user_click_on_proceed() throws Throwable {
    	 System.out.println("1");
    }
    @Then("^user lands on confirmation page$")
    public void user_lands_on_confirmation_page() throws Throwable {
    	 System.out.println("1");
    }    
    @Then("^user prints the follwoing details$")
    public void user_prints_the_follwoing_details(DataTable data) throws Throwable {
    	
    List<List<String>> obj=data.asLists();
    	
    System.out.println("name1"+obj.get(0).get(0));
    System.out.println("age"+obj.get(0).get(3));
        
    }
    
    //===============================================================================//
    
    @Given("^user lands on login page first time$")
    public void user_lands_on_login_page_first_time() throws Throwable {
        System.out.println("sc3");
    }

    @When("^user enter (.+) and (.+)$")
    public void user_enter_and(String username, String password) throws Throwable {
    	System.out.println("username"+username+"password"+password);
    }

    @And("^user lands on next page$")
    public void user_lands_on_next_page() throws Throwable {
    	System.out.println("sc3");
    }

    @Then("^user click on proceed once$")
    public void user_click_on_proceed_once() throws Throwable {
    	System.out.println("sc3");
    }

//==================================================================================//
    
    @Given("^validate browser$")
    public void validate_browser() throws Throwable {
        System.out.println("validate browser");
    }

    @When("^browser is launched$")
    public void browser_is_launched() throws Throwable {
       System.out.println("browser launched");
    }

    @Then("^check browser is started$")
    public void check_browser_is_started() throws Throwable {
       System.out.println("browser started");
    }

//======================================================================================//
    @Given("^Account page is launched$")
    public void account_page_is_launched() throws Throwable {
        System.out.println("Account page launched");
    }

    @When("^user enter Account details$")
    public void user_enter_account_details() throws Throwable {
       System.out.println("account details");
    }

    @Then("^user lands on Account details$")
    public void user_lands_on_account_details() throws Throwable {
    	System.out.println("user lands on Account details");
    }

    @And("^user click on Account$")
    public void user_click_on_account() throws Throwable {
    	System.out.println("user click on Account");
    }


}
