
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;


	public class FlipKart_Login {

				public static void main(String[] args) throws InterruptedException {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\windows\\Downloads\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.flipkart.com/");
					String Title=driver.getTitle();
					{System.out.println("Title is " +Title);
					}
					String Url =driver.getCurrentUrl();
					
					{System.out.println("Current Url is :" + Url);
					}
					
					if(Title.contentEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")){
						
					System.out.println("Title is correct pass the Test Script");
					
					}else{
						
						System.out.println("Title is Incorrect");
					}
					
					driver.findElement(By.linkText("Login & Signup"));{
						
						System.out.println("clicked on Login & Signup");
					}
					
					
			driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("Tarunshrivas@gmail.com");
					System.out.println("entered email id succesfully");
					
					driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("123456789");
					System.out.println("entered password succesfully");
					
					//clicked on login button
					driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
				    System.out.println("succesfully logged in");
				    Thread.sleep(5000);
				    
			//Searching of product on search Tab 
				    driver.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
				    Thread.sleep(5000);
					System.out.println("Searching performed"); 
					
			//Dropdown:	
			
					WebElement min=driver.findElement(By.className("fPjUPw"));
					//WebElement max=driver.findElement(By.xpath("//div[@class='_1qKb_B']//select[@class='fPjUPw']"));
					
				
					Select a=new Select(min);
					a.selectByValue("10000");
					System.out.println("Minimum Amount selected"); 
			
	}

}
