package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*setUp the system property for chrome
launchBrowser
Login for App
Enter Url
Google title test
Logout Method
 closeBrowser
 deleteAllCookies*/

public class TestNGBasics {
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setUp the system property for chrome");
		}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	
	@BeforeClass
    public void Login() {
	System.out.println("Login for App");
	
}
@BeforeMethod
public void enterUrl() {
	System.out.println("Enter Url");
}


//TestCase-------Starting with @test
@Test
public void googleTitleTest() {
		System.out.println("Google title test");
}

@Test
public void googleTitleTest2() {
		System.out.println("googleTitleTest2");
}
//PostCondition-------Starting with @test
@AfterMethod
public void Logout() {
	System.out.println("Logout Method");
}


@AfterTest
public void deleteAllCookies() {
	System.out.println(" deleteAllCookies");
}

@AfterClass
public void closeBrowser() {
	System.out.println(" closeBrowser");
}

@AfterSuite
public void generateTestReport() {
	System.out.println("generateTestReport");
}

}







