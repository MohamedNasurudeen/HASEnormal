package groupExecution;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(groups = "Sanity")
	public void firstTest() {
		System.out.println("firstTest is a Sanity Test");
	}
	
	@Test(groups = "Smoke")
	public void secondTest() {
		System.out.println("secondTest is a Smoke Test");
	}

	@Test(groups = {"Sanity","Smoke"})
	public void ThirdTest() {
		System.out.println("combination of sanity and smoke");
	}
}
