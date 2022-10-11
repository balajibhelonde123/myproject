package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	@FindBy (xpath="//button[@value='1']")
	private WebElement login;
	
	@FindBy (xpath="(//div[@data-visualcompletion='ignore'])[9]")
	private WebElement Account;

	
	public  Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername()
	{
		username.sendKeys("govindbhelonde1996@gmail.com");
	}
	public void sendpassword()
	{password.sendKeys("Govind@123");}
	public void clickloginbuton() {
	login.click();
	}
	public void clickonAcount() {
		Account.click();
		}
}
