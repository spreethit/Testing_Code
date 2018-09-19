package QAClickAcademy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import QAClickAcademy.Base;
import QAClickAcademy.Homepg;
import QAClickAcademy.Loginpg;

public class HomepageBtnTest extends Base{
	
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

@Test (priority=2, dataProvider = "send_data")
public void logincreds(String uname, String pass)
{
	Loginpg lp= new Loginpg(driver);
	
	lp.Send_username().sendKeys(uname);
	lp.Send_password().sendKeys(pass);
	lp.Click_submit().click();
	String exp_output = "Invalid email or password.";
	Assert.assertEquals(lp.Login_Wrong().getText(), exp_output);
	
	//driver.navigate().refresh();
	lp.Send_username().clear();
	

	
}

@AfterTest
public void close_browser()
{
	
	driver.close();
	driver=null;
}

@DataProvider

public Object[][] send_data()
{
	Object[][] data = new Object[4][2];
	data[0][0] = "";
	data[0][1] = "Same@141";
	data[1][0] = "abc@myemail";
	data[1][1]= "123";
	data[2][0]= "";
	data[2][1]= "";
	data[3][0] = "spreethigupta";
	data[3][1] = "123";
return data;	
}


}
