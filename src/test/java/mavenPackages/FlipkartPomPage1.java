package mavenPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPomPage1 
{
	public FlipkartPomPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextbutton;
	
	public WebElement getnextbutton1()
	{
		return nextbutton;
	}

	
	
	

}
 