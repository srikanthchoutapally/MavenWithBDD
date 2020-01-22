package stepdepfination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.loginpage;

public class StepDefination {
	WebDriver driver;
	public loginpage lp;
	
	@Given("^User Lanch chrome browser$")
	public void user_Lanch_chrome_browser() throws Throwable {
		lp = new loginpage(driver);
		 driver=new ChromeDriver();
		
	}

	@When("^User open url$")
	public void user_open_url() throws Throwable {
		
	   driver.get("https://www.facebook.com/");
	}

	
	@When("^User enters UserName  and password$")
	public void user_enters_UserName_and_password() throws Throwable {
	//	 lp.setUserName("8712303138"); 
	//	 lp.setPassword("srikanth@123sri");
	}

	    
	
	
	/*
	 * @When("^User enters UserName  and password$") public void
	 * user_enters_UserName_and_password() throws Throwable {
	 * lp.setUserName("8712303138"); lp.setPassword("K");
	 */
}