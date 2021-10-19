package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedINLoginScenario {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.id("username")).sendKeys("9597203648");
		driver.findElement(By.id("password")).sendKeys("Neevetha@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String Title = driver.getTitle();
		System.out.println("Page Tittle : " +Title);
		
		System.out.println("Page Tittle : "+driver.getCurrentUrl());
		
		if(Title.equals("Feed | LinkedIn"))
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
