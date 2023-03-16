package org.stepdefinition;

import org.test.BaseClass;
import org.test.FaceBookPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FacebookClass extends BaseClass{
	FaceBookPojo fp ;
	@Given("Need to launch the browse and maximize the app")
	public void need_to_launch_the_browse_and_maximize_the_app() {
	  browserLaunch();
	  maxWin();
	}

	@When("Set the url")
	public void set_the_url() {
	   url("https://www.facebook.com/");
	}

	@When("Set the user id")
	public void set_the_user_id() {
		fp = new FaceBookPojo();
	   sendValues("Jenij45@gmail.com", fp.getUserTxt());
	}

	@When("Set the password")
	public void set_the_password() {
		Assert.assertTrue(false);
		sendValues("254579", fp.getPassTxt());
	    
	}

	@When("Login the fb")
	public void login_the_fb() {
		
		click(fp.getLog());
	   
	}

	@Then("close the app")
	public void close_the_app() {
	  
	}



}
