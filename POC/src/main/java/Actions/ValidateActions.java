package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Objects.ValidateObjects;

public class ValidateActions {
	
	ValidateObjects ValidObj;
	Actions acts;
	
	public ValidateActions(WebDriver driver) {
		ValidObj = PageFactory.initElements(driver, ValidateObjects.class);
		acts = new Actions(driver);
	}
	
	public void enterUserName(String s) {
		ValidObj.userName.sendKeys(s);
	}
	
	public void enterUserPassword(String s1) {
		ValidObj.UserPassword.sendKeys(s1);
	}
	
	public void userClickonLoginBtn() {
		ValidObj.loginBtn.click();
	}
	
	public String getProductName() {
		return ValidObj.productName.getText();
	}
	
	public String getProductPrice() {
		return ValidObj.productPrice.getText();
	}
	
	public void clickAddToCart() {
		ValidObj.addToCartBtn.click();
	}
	
	public void openCart() {
		ValidObj.cartBtn.click();
	}
	
	public void checkout() {
		ValidObj.checkout.click();
		ValidObj.firstName.sendKeys("Ganesh");
		ValidObj.lastName.sendKeys("Yadav");
		ValidObj.postalCode.sendKeys("500083");
		ValidObj.continueBtn.click();
	}
	
	public String getActualProductName() {
		return ValidObj.actualProductName.getText();
	}
	
	public String getActualProductPrice() {
		return ValidObj.actualProductPrice.getText();
	}
	
	public String verifyConfirmationMessage() {
		ValidObj.finishBtn.click();
	return	ValidObj.confirmationMsg.getText();
	}

}
