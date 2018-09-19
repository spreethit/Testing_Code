package QAClickAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepg {
	
	public WebDriver driver;
	
	public Homepg (WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Signin_link = By.xpath("//span[contains(text(),'Login')]");
	
	public WebElement click_signin()
	{
		return driver.findElement(Signin_link);
	}

}
