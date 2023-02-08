package mavenPackages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartQty {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).submit();
	//	List<WebElement> page = driver.findElements(By.xpath("//a[contains(@class,'ge-49M')]"));
		FlipkartPomPage1 fpp = new FlipkartPomPage1(driver);
		int sum=0;
        for (int i = 0; i <17; i++)
        {
        			if (fpp.getnextbutton1().isEnabled()) {
		   List<WebElement> modelnames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));		  
			 sum=sum+modelnames.size();
			 Thread.sleep(2000);
			 fpp.getnextbutton1().click();
			 Thread.sleep(2000);
			} 
		}
        List<WebElement> modelnames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        sum=sum+modelnames.size();
        System.out.println("The Total no of iphone is :"+sum);
        driver.quit();
	}

}
