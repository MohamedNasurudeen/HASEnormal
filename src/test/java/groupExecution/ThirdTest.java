package groupExecution;

import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(groups = "Smoke")
	public void firstTest() {
		System.out.println("firstTest is a Smoke Test");
	}
	
	@Test(groups = "Regression")
	public void secondTest() {
		System.out.println("secondTest is a Regression Test");
	}
	
	@Test
	public void sampleTest() {
		System.out.println("sample");
	}

	@Test(groups = {"Smoke","Regression"})
	public void thirdTest() {
		System.out.println("combination of Smoke and Regression");
	}

}
