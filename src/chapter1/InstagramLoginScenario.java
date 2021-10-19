package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginScenario {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		try
		{
			driver.get("https://www.instagram.com/");
			System.out.println("Page is loaded");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Page is not loaded");
		}
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("9597203648");
		//driver.findElement(By.name("username")).sendKeys("9597203648");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9597203648");
		driver.findElement(By.name("password")).sendKeys("Neevetha@123");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
		String Title = driver.getTitle();
		System.out.println("Page Tittle : " +Title);
		
		System.out.println("Page Tittle : "+driver.getCurrentUrl());
		
		if(Title.equals("Instagram"))
		{
			System.out.println("Pass : Home Page is displayed");
		}
		else
		{
			System.out.println("Fail : Home Page is not displayed");
		}
		
		driver.close();
		
	}

}
