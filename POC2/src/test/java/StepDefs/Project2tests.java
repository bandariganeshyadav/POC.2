package StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import Actions.TestActions;

public class Project2tests {
	
	TestActions ta = new TestActions(Hooks.driver);
	@Given("user Navigate to webpage")
	public void user_navigate_to_webpage() {
		Hooks.driver.get("https://seleniumbase.io/coffee/");

	}

	@Then("user get coffee named and price of availaible item")
	public void user_get_coffee_named_and_price_of_availaible_item() {

	}

	@And("user click on Cappuccino")
	public void user_click_on_cappuccino() throws Exception {
		ta.userClickonCappiccino();
		Thread.sleep(2000);

	}
	
	@And("user navigate to cart")
	public void user_navigate_to_cart() throws Exception {
		ta.usernavigatetocart();
		Thread.sleep(2000);

	}

	@And("user click o total amount")
	public void user_click_o_total_amount() throws Exception {
		ta.userclickontotalamount();
		Thread.sleep(2000);

	}

	@And("user fill the payment details for payment")
	public void user_fill_the_payment_details_for_payment() {
		ta.userfillthepaymentdetailsforpayment();

	}
	


}
