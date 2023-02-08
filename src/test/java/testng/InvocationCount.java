package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 2)
	public void test0() {
		Reporter.log("test0",true);
	}
	
	@Test(priority = -5,invocationCount = 3)	
	public void test1() {
		Reporter.log("test1",true);
	}

	@Test(enabled = false)
	public void test3() {
		Reporter.log("test3",true);
	}
	
	@Test(enabled = true)
	public void test4() {
		Reporter.log("test4",true);
	}
	@Test(invocationCount = 2)
	public void openGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
		Reporter.log("openGoogle",true);
}
	@Test(priority = 1)
	public void test2() {
		Reporter.log("test2",true);
	}
	

}
