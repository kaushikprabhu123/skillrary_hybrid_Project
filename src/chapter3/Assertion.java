package chapter3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion {
		public WebDriver driver;
		@BeforeMethod
		public void openapp()
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/profile?id=&utm_campaign=login&utm_medium=mailer&utm_source=mailerAutoLogin");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@Test
		public void login()
		{
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("neevethamanickamms@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("Neevetha@123");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			String Title = driver.getTitle();
			System.out.println("Page Tittle : " +Title);
			
			String url = driver.getCurrentUrl();
			System.out.println("Page URL : "+url);
			
		    Assert.assertEquals(Title, "Neevethaaaaaaaa");
			Reporter.log(url,true);
			Reporter.log(Title,true);
			
		}
		
		
		@AfterMethod
		public void closeapp()
		{
			driver.close();
		}
		
		

	}


