package mavenPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartDyamic {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).submit();
		List<WebElement> modelnames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(modelnames.size());
		System.out.println("iphone model	                                	price "); 
		System.out.println("*************************************************************************");
		for (int i = 0; i < modelnames.size(); i++) 
		{
			System.out.println(modelnames.get(i).getText() +"  	      "+ prices.get(i).getText() );
			
		}
		
		
		
		driver.quit();
		
		
	}

}
