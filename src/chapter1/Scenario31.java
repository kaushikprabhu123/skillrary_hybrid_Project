package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario31 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.facebook.com/?locale=en_GB");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[id='forgot-password-link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9597203648");
		driver.findElement(By.cssSelector("button[name='did_submit']")).click();
		
		

	}

}
