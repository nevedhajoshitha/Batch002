package TestNG;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Basic {

	@BeforeClass
	public void bc() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("after class");
	}
	
	@Test(groups = {"setA"},dependsOnGroups  = {"setB"})
	public void tc1() {
		Reporter.log("This is a test case");
		System.out.println("first test case");
		}
	
	@Test(priority = 2, invocationCount = 2, groups = {"setA"})
	
	public void tc2() {
		System.out.println("second test case");
		}
	
	@Test(priority = -4, groups = {"setB"})
	public void tc3() {
		throw new SkipException("test is skipped");
//		System.out.println("third test case");
//		Reporter.log("This is the last one");
		}
	}
