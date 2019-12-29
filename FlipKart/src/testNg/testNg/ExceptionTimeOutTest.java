package testNg;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	/*@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteLoopTest() {
		
		int i=1;
		while(i==1) {
		System.out.println(i);			
}	

}*/
	@Test(expectedExceptions=NumberFormatException.class)
	public void Test() {
		String t="100A";	
		System.out.println(Integer.parseInt(t));	
	
	}}