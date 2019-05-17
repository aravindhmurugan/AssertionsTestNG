package MyTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Testcases {

	@Test
	public void test1() {
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("Open the browser");
		Assert.assertEquals(true, true);
		
		System.out.println("Enter user name");
		System.out.println("Enter password");
		System.out.println("Click on login button");
		Assert.assertEquals(true, true);
		
		System.out.println("validate home page");
		softAssert1.assertEquals(true, false, "Home page title not matched");
		System.out.println("create a contact");
		softAssert1.assertEquals(true, false, "contact not created");
		System.out.println("create a deal");
		softAssert1.assertEquals(true, false, "deal not created");
		
		softAssert1.assertAll();
		
	}
	
	@Test
	public void test2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("Close the browser");
		softAssert2.assertEquals(true, false);
		softAssert2.assertAll();
	}

}
