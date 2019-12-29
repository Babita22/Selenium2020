package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	//1/4/7
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}

	@Test()
	public void googleTitleTest() {
		String title=driver.getTitle();
			System.out.println(title);
			
			
			//Validating
			Assert.assertEquals(title, "Google","Title is not match");
	
			//Failed Case for validation
			
	//Assert.assertEquals(title, "Google","Title is not match");
	}
	
	public void googleLogoTest() {
		boolean b=driver.findElement(By.id(" //img[@id='hplogo']")).isDisplayed();
			System.out.println( b);
			
			
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
	}

