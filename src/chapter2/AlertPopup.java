package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[text()='Cucumber']) [2]")).click();
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss(); 
		driver.close();
	}

}
