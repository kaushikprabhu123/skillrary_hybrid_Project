package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLoginScript {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.name("identifier")).sendKeys("neevethamanickamms@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Neevetha@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
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
