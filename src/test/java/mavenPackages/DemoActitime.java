package mavenPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoActitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'your')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'Log')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class,'pwd')]")).sendKeys("manager");
			
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.cssSelector("a[id='logoutLink']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
