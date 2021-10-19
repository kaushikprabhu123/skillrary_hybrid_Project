package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("msneevetha@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Neevetha@99");
		driver.findElement(By.name("login")).click();
		

	}

}
