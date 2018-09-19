package QAClickAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedIn_pg1 {
	
	public WebDriver driver;
	
	public LoggedIn_pg1 (WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	By firstelement = By.xpath("//div[contains(text(),'Category:')]");
	
	public WebElement getfirstelement()
	{
		return driver.findElement(firstelement);
	}

}
