package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{

public WebDriver ldriver;
	
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(id="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement submit;
	
	public void getUsername(String user)
	{
		username.sendKeys(user);
	}
	public void getPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void getClick()
	{
		submit.click();
	}

}
