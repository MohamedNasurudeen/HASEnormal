package mavenPackages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTables {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/test/batting");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list = driver.findElements(By.xpath("//table/descendant::tr"));
		for (int i = 0; i <list.size(); i++)
		{
			 driver.findElement(By.xpath(("//table/descendant::tr/td/a")));
			 System.out.println(list.get(i).getText());
		}
	driver.quit();			
	}
	

}
