package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()=\"I am a Professional\"]")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\Neevetha Manickam\\Desktop\\Neevetha Manickam Resume.doc");
		Thread.sleep(5000);
		driver.close();
	}

}
