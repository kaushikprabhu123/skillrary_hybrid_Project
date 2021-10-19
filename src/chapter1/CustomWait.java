package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		while(true)
			{
			try 
			{
			driver.findElement(By.name("username")).sendKeys("9597203648");
			System.out.println("Pass : User name Element found");
			driver.findElement(By.name("password")).sendKeys("Neevetha@123");
			System.out.println("Pass : Password Element found");
			break;
			}
			catch(Exception e)
			{
				 System.out.println("Fail : Element not found");
			}
			}
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		

	}

}
