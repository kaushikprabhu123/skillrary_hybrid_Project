package chapter2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Naukriupdateresume {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("neevethamanickamms@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("Neevetha@99");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\Neevetha Manickam\\Desktop\\Neevetha Manickam.pdf");
			Thread.sleep(5000);
			
		

	}

}
