package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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

		@Test(priority=1,groups="Title")
		public void googleTitleTest() {
			String title=driver.getTitle();
				System.out.println(title);
		}
		@Test(priority=3,groups="Logo")
		public void googleLogoTest() {
			boolean b=driver.findElement(By.id(" //img[@id='hplogo']")).isDisplayed();
				System.out.println( b);
				
		}	@Test(priority=2,groups="Links")
				public void SearchLink() {
					boolean c=driver.findElement(By.className("gNO89b")).isDisplayed();
					System.out.println( c);		
				
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}


























}
