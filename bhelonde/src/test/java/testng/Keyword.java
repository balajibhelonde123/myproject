package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass");
	}
	@BeforeMethod
  public void beforeMethod()
  {
		System.out.println("beforemethod");
  }
	@Test(enabled=false)
	public void testA() throws InterruptedException
	{
		System.out.println("testA");
		Thread.sleep(5000);
		System.out.println("As");
	}
	@Test()
	public void testB()
	{
		System.out.println("testB");
	}
	@Test()
	public void testc()
	{
		System.out.println("testC");
	}
	
	
	@Test()
	public void testd()
	{
		System.out.println("testD");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterclass");
	}

	
}
