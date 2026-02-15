package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PgLogin extends BasePage {
	
	public PgLogin(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btn_login;
	
	public void enterEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}

}
