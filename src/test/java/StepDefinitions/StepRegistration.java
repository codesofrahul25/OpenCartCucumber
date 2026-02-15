package StepDefinitions;

import org.testng.Assert;

import Utility.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepRegistration {

	public TestContextSetup ts;

	public StepRegistration(TestContextSetup ts) {
		this.ts = ts;
	}

	@Given("user is on OpenCart homepage")
	public void user_is_on_open_cart_homepage() {
		String title = ts.homepage.getHomePageTitle();
		Assert.assertEquals(title, "Your Store");
	}

	@When("user clicks on MyAccount and clicks on Register")
	public void user_clicks_on_my_account_and_clicks_on_register() {
		ts.homepage.clickBtnMyAccount();
		ts.homepage.clickBtnRegister();
	}

	@Then("user should navigated to Registration page")
	public void user_should_navigated_to_registration_page() {
		String title = ts.register.getRegistrationPageTitle();
		Assert.assertEquals(title, "Register Account");
	}

	@When("user enters personal details, password and clicks on continue")
	public void user_enters_personal_details_password_and_clicks_on_continue() {
		ts.register.enterPersonalDetails();
		ts.register.enterPassword();
		ts.register.confirmPassword();
		ts.register.selectNewsLetter();
		ts.register.selectTC();
		ts.register.clickContinue();
	}

	@Then("user should get success message")
	public void user_should_get_success_message() {
		String title = ts.myaccount.getMyAccountPageTitle();
		Assert.assertEquals(title, "Your Account Has Been Created!");
		String success = ts.myaccount.getSuccessMessage();
		Assert.assertEquals(success, "Your Account Has Been Created!");
	}

}
