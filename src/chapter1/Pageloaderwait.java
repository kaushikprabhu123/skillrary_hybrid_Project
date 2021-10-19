package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloaderwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		try 
		{
		driver.get("https://www.instagram.com/");
		System.out.println("Pass : Page loaded");
		}
		catch(Exception e)
		{
			System.out.println("Fail : Page not loaded");
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("9597203648");
		driver.findElement(By.name("password")).sendKeys("Neevetha@123");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		

	}

}
