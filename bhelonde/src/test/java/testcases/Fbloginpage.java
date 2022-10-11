package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclasses.Loginpage;

public class Fbloginpage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Exe\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		// 1st test cases
		
		driver.get("https://www.facebook.com/");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.sendusername();
		loginpage.sendpassword();
		loginpage.clickloginbuton();
		loginpage.clickonAcount();
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		if (url.equals("https://www.facebook.com"));
//		{
//		System.out.println("pass");
//		}
			}}

