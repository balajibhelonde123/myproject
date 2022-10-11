package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclasses.Createnewaccount;

public class Creatnewtestcases {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Exe\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//test cases 1
		driver.get("https://www.facebook.com/");
		
		Createnewaccount createnewaccount=new Createnewaccount(driver);
		
		createnewaccount.creatnesac();
		Thread.sleep(3000);
		createnewaccount.info();
		createnewaccount.selectday();
		createnewaccount.selectmonth();
		createnewaccount.creatnesac();
		createnewaccount.maleandsub();
		
	}

}
