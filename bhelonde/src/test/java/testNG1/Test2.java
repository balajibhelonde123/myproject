package testNG1;



	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Test2 {
		@BeforeSuite
		public void beforesiute()
		{
			System.out.println("beforesuite");
		}
		@BeforeTest
		public void beforetest()
		{
			System.out.println("beforetest test2");
		}
	    @BeforeClass
	     public void beforeclass()
		{
			System.out.println("before class");
		}
		
		
	    @BeforeMethod
	    public void beforemethod()
		{
			System.out.println("before method");
		}
	    @Test
	      public void testC()
	      {
	    	System.out.println("test C");
	      }
	    @Test
	    public void testD()
	    {
	  	System.out.println("test D");
	    }
	    @AfterMethod
	    public void aftermethod()
		{
			System.out.println("after method");
		}
	    @AfterClass
	    public void afterclass()
		{
			System.out.println("after class");
		}
	    
	    
	    @AfterTest
		public void aftertest()
		{
			System.out.println("aftertest test2");
		}

	    @AfterSuite
		public void befresiute()
		{
			System.out.println("aftersuite");
		}

}
