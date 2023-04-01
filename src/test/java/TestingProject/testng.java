package TestingProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	
	
	@BeforeClass
	public void test1()
	{
		System.out.println("@BeforeClass testing");
	}
	
	@BeforeMethod
	public void test2()
	{
		System.out.println("@BeforeMethod testing");
	}
	
	@Test
	public void test3()
	{
		System.out.println("@Test method testing");
	}
	
	@AfterMethod
	public void test4()
	{
		System.out.println("@AfterMethod testing");
	}
	
	@AfterClass
	public void test5()
	{
		System.out.println("@AfterClass testing");
	}

}
