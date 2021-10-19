package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomLoginScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signin");
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("9597203648");
		driver.findElement(By.id("email")).sendKeys("neevethamanickamms@gmail.com");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9597203648");
		driver.findElement(By.id("password")).sendKeys("Neevetha@123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		String Title = driver.getTitle();
		System.out.println("Page Tittle : " +Title);
		
		System.out.println("Page Tittle : "+driver.getCurrentUrl());
		
		if(Title.equals("Sign In - Zoom"))
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
