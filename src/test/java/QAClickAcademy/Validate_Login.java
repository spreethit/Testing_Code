package QAClickAcademy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import QAClickAcademy.Base;
import QAClickAcademy.Homepg;
import QAClickAcademy.Loginpg;


public class Validate_Login extends Base{
	
@BeforeTest

public void initiate_browser() throws IOException
{
	driver = initialize_browser();
}

@Test(priority =1)

public void LinktoLogin()
{
	
	driver.get("https://qaclickacademy.com");
	Homepg hp = new Homepg(driver);
	hp.click_signin().click();
	
	
}

@Test (priority=2)
public void logincreds()
{
	Loginpg lp= new Loginpg(driver);
	
	lp.Send_username().sendKeys("spreethigupta@gmail.com");
	lp.Send_password().sendKeys("Same@141");
	lp.Click_submit().click();
	
	String exp_output = "Category:";

	LoggedIn_pg1 pg1 = new LoggedIn_pg1(driver);
	
	Assert.assertEquals(pg1.getfirstelement().getText(), exp_output);
	
	
}

@AfterTest
public void close_browser()
{
	
	driver.close();
	driver=null;
}



}
