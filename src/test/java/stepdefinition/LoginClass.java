package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Login;

public class LoginClass 
{
	public static WebDriver driver;
	Login login;
	@Given("launch chrome browser")
	public void launch_chrome_browser() 
	{
	    driver=new ChromeDriver();
	    login=new Login(driver);
	}

	@When("enter url {string}")
	public void enter_url(String url) 
	{
	   driver.get(url);
	}

	@When("enter username {string} and password {string}")
	public void enter_username_and_password(String user, String pass) 
	{
		login.getUsername(user);
		login.getPassword(pass);
	}

	@When("click on submit")
	public void click_on_submit() 
	{
		login.getClick();
	}

	@Then("page title {string}")
	public void page_title(String string) 
	{
	   
	}
	@When("close browser")
	public void close_browser()
	{
	    
	}




}
