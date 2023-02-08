package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DependsOnMethods {
	WebDriver driver;
	
	@Test	
	public void openActiTime() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.findElement(By.className("atLogoImg")).isDisplayed())
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
		
	}
	@Test(dependsOnMethods = "openActiTime")
	public void loginActiTime() {
	driver.findElement(By.id("username")).sendKeys("admin" + Keys.TAB + "manager" + Keys.TAB + Keys.ENTER);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
	driver.quit();
	}

}
