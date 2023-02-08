package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataAndClickUsingJSE {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value=arguments[1]", searchTF,"Headphones");
		
		 WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click()", searchButton);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
