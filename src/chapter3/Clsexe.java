package chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clsexe {

		@FindBy(name="username")
		private WebElement username;
		@FindBy(name="password")
		private WebElement password;
		@FindBy(xpath="//div[text()='Log In']")
		private WebElement login;
		
		public Clsexe(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public void username(String us)
		{
			username.sendKeys(us);
			
		}
		
		public void password(String pwd)
		{
			password.sendKeys(pwd);
		}
		 public void login()
		 {
			 login.click();
		 }



}
