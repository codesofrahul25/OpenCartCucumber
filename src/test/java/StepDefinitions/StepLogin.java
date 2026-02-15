package StepDefinitions;

import org.testng.Assert;

import Utility.TestContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepLogin {
	
	public TestContextSetup ts;
	
	public StepLogin(TestContextSetup ts)
	{
		this.ts = ts;
	}
	
	@When("user clicks on MyAccount and clicks on login")
	public void user_clicks_on_my_account_and_clicks_on_login() {
	    ts.homepage.clickBtnMyAccount();
	    ts.homepage.clickBtnLogin();
	}

	@Then("user should be navigated to loginpage")
	public void user_should_be_navigated_to_loginpage() {
	    String title = ts.login.getLoginPageTitle();
	    Assert.assertEquals(title, "Account Login");
	}

	@Then("^user enters (.+) and (.+) and clicks on login$")
	public void user_enters_abd_gmail_com_and_test_and_clicks_on_login(String email, String password) {
	    ts.login.enterEmail(email);
	    ts.login.enterPassword(password);
	    ts.login.clickLogin();
	}

	@Then("user navigates to homepage")
	public void user_navigates_to_homepage() {
	    String title = ts.myaccount.getMyAccountPageTitle();
	    Assert.assertTrue(true);
	}

}
