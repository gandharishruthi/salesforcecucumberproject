package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.Assert;

import com.training.PageFactory.PageFactory;
import com.training.base.BasePage;
import com.training.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps extends BaseTest {
	

     PageFactory  pageFactory = new PageFactory();
		
		BasePage page;

	
		@Before
		public void setup() throws IOException   {
			launchapplication();
			
		}
	
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
	    
	page=pageFactory.initialize(pageName);
	}
	
	@When("User enters into textbox {string} {string}")
	public void user_enters_into_textbox(String LogicalName, String value) {
	    page.enterintotextbox(LogicalName,value);
	}
	
	@Then("User clicks on  button {string}")
	public void user_clicks_on_button(String LogicalName) {
	   page.clickonbutton(LogicalName);
	}

	@When("User clicks on tab {string}")
	public void user_clicks_on_tab(String LogicalName) {
	    page.clickontab(LogicalName);
	}
	@Then("User moves to element {string}")
	public void user_moves_to_element(String LogicalName) {
	    // Write code here that turns the phrase above into concrete actions
	    page.movetoelement(LogicalName);
	}

   @Then("check the error message {string} {string}")
	public void check_the_error_message(String LogicalName, String expectederror) {
		
	Assert.assertEquals(page.checkerrormessage(LogicalName) , expectederror);
	System.out.println("Expected message: "+expectederror+ "Actual error message:" +page.checkerrormessage(LogicalName));
		
		
	}
   @When("User close the child window {string};")
   public void user_close_the_child_window(String LogicalName) {
       page.closethechildwindow(LogicalName);
   }
   @Then("User close the alert {string}")
   public void user_close_the_alert(String LogicalName) {
       page.closethealert(LogicalName);
       
   }


   @When("User selects  from dropdown {string} {string}")
   public void user_selects_from_dropdown(String LogicalName, String value) {
      page.selectfromdropdown(LogicalName, value);
   }


   @Then("User clears the textbox {string}")
   public void user_clears_the_textbox(String LogicalName) {
      page.cleartextbox(LogicalName);
   }

   @Given("Verify the opitons of dropdown {string}")
   public void verify_the_opitons_of_dropdown(String LogicalName) {
       page.verifytheoptionsofdropdown(LogicalName);
   }

   @Then("User switches to frame {string}")
   public void user_switches_to_frame(String LogicalName) {
       page.switchestoframe(LogicalName);
   }
   @When("User clicks on link {string}")
   public void user_clicks_on_link(String LogicalName) {
       page.clickonlink(LogicalName);
   }
   
   
  
   
   

   


   
   
   
   
   
}
    //page.clickonbutton(LogicalName);
	//page.enterintotextbox(LogicalName, value);
	//page.clickonbutton(LogicalName);
	
