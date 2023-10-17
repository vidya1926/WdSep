package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotation extends Commonfuntalities{
	@Test
	public void test1() {
		System.out.println("Actual Testcase");
	}
	@Test
	public void test2() {
		System.out.println("Actual Testcase2");
	}

	

}
