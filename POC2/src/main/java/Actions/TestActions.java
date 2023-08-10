package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Objects.TestObjects;


public class TestActions {
	
	TestObjects testObj;
	Actions acts;
	
	public TestActions(WebDriver driver) {
		testObj = PageFactory.initElements(driver, TestObjects.class);
		acts = new Actions(driver);
	}
	
	public void userClickonCappiccino() {
		testObj.Cappuccino.click();
	}
	
	public void usernavigatetocart() {
		testObj.cart.click();
	}
	
	public void userclickontotalamount() {
		testObj.TotalAmount.click();
	}
	
	public void userfillthepaymentdetailsforpayment() {
		testObj.Name.sendKeys("Ganesh");
		testObj.Email.sendKeys("Yadav@gmail.com");
		testObj.Checkbox.click();
		testObj.Submit.click();
		
	}
	
	

}
