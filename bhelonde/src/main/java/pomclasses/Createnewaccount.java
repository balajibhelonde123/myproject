package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Createnewaccount {
	
	@FindBy(xpath ="(//a[@role='button'])[2]")
	  private  WebElement create;
	
	@FindBy(xpath ="(//input[@type='text'])[2]")
	  private  WebElement fname;
	
	@FindBy(xpath ="(//input[@type='text'])[3]")
	  private  WebElement lname;
	@FindBy(xpath ="(//input[@type='text'])[4]")
	  private  WebElement mob;
	
	@FindBy(xpath ="((//input[@type='password'])[2]")
	  private  WebElement pass;
	
	@FindBy(xpath ="(//select[@name='birthday_day'])")
	  private  WebElement day;
	@FindBy(xpath ="//select[@name='birthday_month']")
	  private  WebElement month;
	@FindBy(xpath ="(//select[@name='birthday_year'])")
	  private  WebElement year;
	
	@FindBy(xpath ="(//label[@class='_58mt'])[2]")
	  private  WebElement male;
	@FindBy(xpath ="(//button[@type='submit'])[2]")
	  private  WebElement submit;
	
	public  Createnewaccount(WebDriver driver)
	{PageFactory.initElements(driver,this);
		
	}
	
	public void creatnesac()
	{
		create.click();}
	public void info() {
		fname.sendKeys("Balaji");
		lname.sendKeys("Bhelonde");
		mob.sendKeys("9763232524");
		pass.sendKeys("Balaji@123");
	}
	
	public void selectday()
	{  Select s=new Select(day);
	s.selectByIndex(12);
	}
	public void selectmonth()
	{ Select m=new Select(month);
  m.selectByIndex(7);}
	
	public void selectyear()
	{ Select n=new Select(year);
  
  n.selectByValue("1992");
	}
	
	public void maleandsub()
	{
		male.click();
		submit.click();
	}
}
