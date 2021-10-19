package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameSwitchto {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Core Java for Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.findElement(By.xpath("//img[@title=\"Core Java for Selenium\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"close_cookies\"]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@class=\"entypo-twitter\"]")).click();
	}

}
