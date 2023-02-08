package groupExecution;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(groups = "Sanity")
	public void firstTest() {
		System.out.println("firstTest is a Sanity Test");
	}
	
	@Test(groups = "Regression")
	public void secondTest() {
		System.out.println("secondTest is a Regression Test");
	}

	@Test(groups = {"Sanity","Regression"})
	public void ThirdTest() {
		System.out.println("combination of sanity and Regression");
	}

}
