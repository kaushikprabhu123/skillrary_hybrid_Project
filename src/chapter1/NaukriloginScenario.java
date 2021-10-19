package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriloginScenario {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/profile?id=&utm_campaign=login&utm_medium=mailer&utm_source=mailerAutoLogin");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("neevethamanickamms@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Neevetha@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String Title = driver.getTitle();
		System.out.println("Page Tittle : " +Title);
		
		System.out.println("Page Tittle : "+driver.getCurrentUrl());
		
		if(Title.equals("Profile | Mynaukri"))
		{
			System.out.println("Pass : Home Page is displayed");
		}
		else
		{
			System.out.println("Fail : Home Page is not displayed");
		}
		
		
		
	}

}
