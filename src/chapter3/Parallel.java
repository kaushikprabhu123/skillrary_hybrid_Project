package chapter3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	@Parameters({"browser"}) 
	@Test
	public void demo(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}

	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("9597203648");
	driver.findElement(By.id("password")).sendKeys("Neevetha@123");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	String Title = driver.getTitle();
	Reporter.log(Title,true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
}
}
