package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
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
	@Test
	public void testA()
	{
		System.out.println("test");
	}
	@Test
	public void testB()
	{
		System.out.println("test");
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
