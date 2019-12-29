package testNg;

	import org.testng.annotations.Test;

	public class TestNgFeatures {

		
		@Test
		public void loginTest() {
		System.out.println("Login test");
		//int i=9/0;
		
		}
		@Test(dependsOnMethods="loginTest")
		public void HomePageTest() {
			System.out.println( "HomePageTest");
				
		} 
		@Test(dependsOnMethods="loginTest")
		public void RegPageTest() {
			System.out.println( "HomePage RegPageTest");
			
		}
		@Test
			public void SearchPageTest() {
			System.out.println( " SearchPageTest");	
	}
	}

