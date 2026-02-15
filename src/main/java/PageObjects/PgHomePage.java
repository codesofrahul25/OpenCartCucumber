package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PgHomePage extends BasePage {

	public PgHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='dropdown-toggle']/span[1]")
	WebElement btn_myAccount;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[1]")
	WebElement btn_register;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[2]")
	WebElement btn_login;

	public void clickBtnMyAccount() {
		btn_myAccount.click();
	}
	
	public void clickBtnRegister() {
		btn_register.click();
	}

	public void clickBtnLogin() {
		btn_login.click();
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

}
