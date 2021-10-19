package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario21 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapp.skillrary.com/");
        driver.findElement(By.linkText("LOGIN")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[id='toPasswordRecoveryPageLink']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[id='loginPasswordPage']")).click();      
    }

}