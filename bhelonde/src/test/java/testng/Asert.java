package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asert {
	
	SoftAssert soft;
	@BeforeClass
	public void beforeClass()
	{
		
		 soft=new SoftAssert();
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
  public void beforeMethod()
  {
		System.out.println("beforemethod");
		soft=new SoftAssert();
  }
	@Test
	public void testC()
	{
		System.out.println("testc");
		
	}
	@Test()
	public void testB()
	{
		System.out.println("testB");
		
//		// actual is equal to Expected  ==>Test case .. pass
//		// Actual is no equal to Expected ===>	Test cases.. Fail
//		Assert.assertEquals("Hi","hi" ,"hi is not prsent");
//		
//	//	actual is equal to Expected  ==>Test case .. fail
//	// Actual is no equal to Expected ===>	Test cases.. pass
//		
//		Assert.assertNotEquals("hi","hi");
//		
//		
//		String url="http//www.facebook.com";
//		boolean Result =url.equals("http//www.facebook.com");
//		
//		//Result== True  test cases ==pass
//		//Result== Fail  test cases ==Fail
//		Assert.assertTrue(Result);
//		
//		
//		String url1="http//www.facebook.com";
//		boolean Result1 =url1.equals("http//www.facebook.com");
//		
//		//Result== True  test cases ==fail
//		//Result== Fail  test cases ==pass
//
//          Assert.assertFalse(Result1);
//        
//          
//          //forcefully Failed the test cases
//          Assert.fail();
	
				soft.assertEquals("Hi","Halo","Hi is not prasent");
		
		soft.assertEquals("Hallo","Hal");
		
		soft.assertEquals("Bye","Bye");
		
		soft.assertAll();

//		
		
	}
	@Test()
	public void testA()
	{
		System.out.println("testA");
		
//		Assert.assertEquals("Hi","Hi","Hi is not prasent");
//		System.out.println("Here is code");
//		
//		Assert.assertEquals("Hallo","Hallo");
//		
//		Assert.assertEquals("Hallo","Hallo");
		
		
		
		soft.assertEquals("Hi","Halo","Hi is not prasent");
		
		
		soft.assertEquals("Hallo","Haydra");
		
		soft.assertEquals("Bye","B");
		
		soft.assertAll();
		
		
	}
	
	
	@Test()
	public void testD()
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
