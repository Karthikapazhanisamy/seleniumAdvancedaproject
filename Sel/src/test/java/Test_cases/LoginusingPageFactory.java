package Test_cases;

import org.testng.annotations.Test;

import day1.LoginPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class LoginusingPageFactory {
	WebDriver driver;

  @Test
  public void f() {
	  LoginPage login=PageFactory.initElements(driver, LoginPage.class);
  login.FORM("tutorial","tutorial");
  login.Click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demoaut.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
