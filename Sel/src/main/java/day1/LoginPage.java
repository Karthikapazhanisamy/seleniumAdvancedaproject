package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(how=How.NAME, using="userName")
	WebElement Username;
	@FindBy(how=How.NAME, using="password")
	WebElement Password;
	@FindBy(how=How.NAME, using="login")
	WebElement Login;
	
			public LoginPage(WebDriver driver)
			{
		this.driver=driver;
			}
			public void FORM(String username, String Passwd)
			{
				Username.sendKeys("username");
				Password.sendKeys("Passwd");
			}
			
			public void Click()
			{
				Login.click();
			}
	
	}

