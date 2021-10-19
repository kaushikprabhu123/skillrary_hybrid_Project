package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario11 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapp.skillrary.com/");
        driver.findElement(By.linkText("LOGIN")).click();
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("user");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("user");
		driver.findElement(By.cssSelector("button[id='last']")).click();
		driver.close();
		
    }

}
