package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//input[@name='email']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(how = How.XPATH, using ="(//input[@type='password'])[1]")
	@CacheLookup
	WebElement txtPassword;
	
	
	
	
	
	

	public void setUserName(String uname)
	{
		txtUserName.sendKeys("8712303138");
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys("srikanth@123sri");
	}
	
	
	
	
}
	
	


