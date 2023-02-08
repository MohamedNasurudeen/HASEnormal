package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserInGrid {
	WebDriver driver;
    @Parameters("Browser")
	@BeforeClass
	public void classSetup(String BROWSER) throws MalformedURLException {
		
    	URL url = new URL("http://169.254.27.37:4444/wd/hub");
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setPlatform(Platform.WINDOWS);
    	if(BROWSER.equals("chrome"))
    		cap.setBrowserName("chrome");
    	else if(BROWSER.equals("firefox"))
    	    cap.setBrowserName("firefox");
    	
        driver = new RemoteWebDriver(url, cap);
    	
	}
	
    @Test
    public void crossBrowserTest() throws InterruptedException {
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	Thread.sleep(2000);
    	driver.quit();
    }
    
	
}
