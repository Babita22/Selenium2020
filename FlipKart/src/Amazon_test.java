
	
	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Amazon_test {

            public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			String Title=driver.getTitle();
			{System.out.println("Title is " +Title);
			}
			String Url =driver.getCurrentUrl();
			
			{System.out.println("Current Url is :" + Url);
			}
			
			if(Title.contentEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
				
			System.out.println("Title is correct pass the Test Script");
			
			}else{
				
				System.out.println("Title is Incorrect");
			}
			
			/*driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();{
				
				System.out.println("Hello, Sign in");
			}
			
			
	        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Babita20das@gmail.com");
			System.out.println("entered email id succesfully");
			
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			System.out.println("Clicked on continue button succesfully");
			
			
			driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456789");
			System.out.println("entered password succesfully");
			
			//clicked on login button
			driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();
		    System.out.println("succesfully logged in");
		    Thread.sleep(5000);*/
		    
		
			//Searching of product on search Tab 
		    driver.findElement(By.name("field-keywords")).sendKeys("Timex watch men",Keys.ENTER);
		    Thread.sleep(5000);
			System.out.println("Searching performed");
			
			  Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@class='s-desktop-container']//ul[8]//li[1]")).click();;
				
					System.out.println("Analog selected");
		
            }
	}
