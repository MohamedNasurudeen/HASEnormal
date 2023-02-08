package mavenPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='main-navigation__desktop-navigation']/descendant::button[contains(text(),'Rankings')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Players ')])[1]")).click();
		driver.findElement(By.linkText("Full Table")).click();
		//driver.findElement(By.xpath("//div[@data-cricket-role='batting']//a[@class='btn'][normalize-space()='Full Table']")).click();
	    //full table
		//List<WebElement> list = driver.findElements(By.xpath("//table[@class='table rankings-table']"));
			List<WebElement> list = driver.findElements(By.xpath("//td[@class='table-body__cell rankings-table__name name']"));
		//List<WebElement> list = driver.findElements(By.xpath("//table/descendant::tr"));
		System.out.println(list.size());
		for (WebElement Element : list) {
			System.out.println(Element.getText());
				}
		driver.quit();
		
		
		
	}

}
