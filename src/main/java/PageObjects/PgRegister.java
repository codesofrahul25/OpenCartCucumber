package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.javafaker.Faker;

public class PgRegister extends BasePage {
	
	Faker fake = new Faker();
	String password = "TestData321";
	public PgRegister(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txt_fname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txt_lname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txt_telephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txt_confirm_password;
	
	@FindBy(xpath = "//div[@class='col-sm-10']/label[@class='radio-inline'][2]/input")
	WebElement radio_no;
	
	@FindBy(xpath = "//div[@class='pull-right']//input[@type='checkbox']")
	WebElement radio_tc;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btn_continue;
	
	public void enterPersonalDetails()
	{
		txt_fname.sendKeys(fake.name().firstName());
		txt_lname.sendKeys(fake.name().lastName());
		txt_email.sendKeys(fake.internet().emailAddress());
		txt_telephone.sendKeys(fake.phoneNumber().cellPhone());	
	}
	
	public void enterPassword()
	{
		txt_password.sendKeys(password);
	}
	
	public void confirmPassword()
	{
		txt_confirm_password.sendKeys(password);
	}
	
	public void selectNewsLetter()
	{
		radio_no.click();
	}
	
	public void selectTC()
	{
		radio_tc.click();
	}
	
	public void clickContinue()
	{
		btn_continue.click();
	}
	
	public String getRegistrationPageTitle()
	{
		return driver.getTitle();
	}

}
