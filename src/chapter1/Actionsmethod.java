package chapter1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionsmethod {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9597203648");
			driver.findElement(By.name("password")).sendKeys("Neevetha@123");
			driver.findElement(By.xpath("//div[text()='Log In']")).submit();
			//driver.findElement(By.xpath("//div[text()='Log In']")).click();
			WebElement ele = driver.findElement(By.xpath("//input[@autocapitalize='none']"));
			ele.sendKeys("Kanimozhi");
			Thread.sleep(3000);
			ele.clear();
			ele.sendKeys("Kanimozhi");
		}

	}

