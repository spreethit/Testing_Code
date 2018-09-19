package QAClickAcademy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpg {
	
	public Loginpg (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public WebDriver driver;
	
	@FindBy(id= "user_email")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement LoginBtn;
	
	
	public WebElement Send_username()
	{
		return username;

		
	}
	
	public WebElement Send_password()
	
	{
		return password;
	}
	
	public WebElement Click_submit()
	{
		return LoginBtn;
		
	}
	

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement exp_out_text;
	
	public WebElement Login_Wrong()
	{
		return exp_out_text;
	}

	
	
	
}
