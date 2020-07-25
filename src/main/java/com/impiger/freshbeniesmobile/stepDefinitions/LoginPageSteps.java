package com.impiger.freshbeniesmobile.stepDefinitions;

import org.testng.Assert;

import com.impiger.freshbeniesmobile.pages.HomePage;
import com.impiger.freshbeniesmobile.pages.LoginPage;
import com.impiger.freshbeniesmobile.testdata.Constants;
import com.impiger.util.TimeUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
	
    LoginPage loginpage;
    HomePage homepage;
	
		
	@Given("^app is opened and in login page$")
	public void app_is_opened_and_in_login_page() throws Throwable {
		loginpage=new LoginPage();
		loginpage.signin();
		TimeUtil.shortWait();
	}

	
	@Given("^enter invalid credentials$")
	public void enter_invalid_credentials() throws Throwable {
	    loginpage.enterInvalidCredentials();
	}

	
	@Then("^validate whether appropriate error mesage is thrown$")
	public void validate_whether_appropriate_error_mesage_is_thrown() throws Throwable {
	   Assert.assertTrue(loginpage.verifyLoginerror_msg());
	}
	
	
	@Then("^validate whether the forgotpassword link is present$")
	public void validate_whether_the_forgotpassword_link_is_present() throws Throwable {
	    Assert.assertTrue(loginpage.forgotpwdDisplay());
	}
	
	@Given("enter valid credentials")
	public void enter_valid_credentials() {
	    homepage=loginpage.enterValidCredentials();
	}

	@Then("validate whether homepage is displayed")
	public void validate_whether_homepage_is_displayed() {
	String text=homepage.verifyHomePageHeader();
	Assert.assertEquals(text, Constants.homepage_header);
	}
			
			
}
