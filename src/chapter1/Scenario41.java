package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario41 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[id='toPasswordRecoveryPageLink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='forgetPasswordEmailOrUsername']")).sendKeys("Neevetha");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='toLoginPageLink']")).click();
	}

}
