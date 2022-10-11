package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	
	 public static WebDriver openchromebrowser()
	 {
		 System.setProperty("webdriver.chrome.driver","F:\\Exe\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			return driver;
	 }public static WebDriver openfirefoxbrowser()
	 {
		 System.setProperty("webdriver.gecko.driver","F:\\Exe\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			return driver;
	 }public static WebDriver openoperabrowser()
	 {
		 System.setProperty("webdriver.opera.driver","F:\\Exe\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new OperaDriver();
			return driver;
	 }
}
