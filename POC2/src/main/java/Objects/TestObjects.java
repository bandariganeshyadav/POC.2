package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestObjects {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[2]/ul/li[3]/div/div")
	public WebElement Cappuccino;
	
	@FindBy(xpath = "//*[@id=\"app\"]/ul/li[2]/a")
	public WebElement cart;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[1]/button")
	public WebElement TotalAmount;
	
	@FindBy(id = "name")
	public WebElement Name;
	
	@FindBy(id = "email")
	public WebElement Email;
	
	@FindBy(id = "promotion")
	public WebElement Checkbox;
	
	@FindBy(id = "submit-payment")
	public WebElement Submit;


}
