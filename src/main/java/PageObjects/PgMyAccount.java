package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PgMyAccount extends BasePage {

	public PgMyAccount(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement success_msg;
	
	public String getMyAccountPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getSuccessMessage()
	{
		return success_msg.getText();
	}
}
