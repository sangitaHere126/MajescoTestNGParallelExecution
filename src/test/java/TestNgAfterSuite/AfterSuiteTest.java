package TestNgAfterSuite;

import org.testng.annotations.AfterSuite;

public class AfterSuiteTest {

	
	 public static void afterSuite() {
	 System.out.println("afterSuit 25-0-19"); }
	 
	 public static void main(String args[]) { afterSuite();
	}
	

	/*@AfterSuite
	public void messageAfterSuite1() {
		System.out.println("afterSuit 25-0-19");
	}*/

}
