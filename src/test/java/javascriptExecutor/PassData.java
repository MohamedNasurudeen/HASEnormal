package javascriptExecutor;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.flipkart.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement pop = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 js.executeScript("arguments[0].click()",pop);
		WebElement searchTF = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		js.executeScript("arguments[0].value=arguments[1]",searchTF,"Headphones" );
	//	WebElement searchbutton = driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']//*[name()='g' and contains(@fill,'#2874F1')]//*[name()='path'][2]"));
		WebElement submitbutton = driver.findElement(By.xpath("(//*[@class='_34RNph'])[2]"));
		js.executeScript("arguments[0].click()",submitbutton );
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	//	driver.quit();
	}

}
