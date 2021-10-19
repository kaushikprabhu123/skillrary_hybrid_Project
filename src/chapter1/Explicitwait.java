package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait W = new WebDriverWait(driver,10);
		WebElement ele = driver.findElement(By.name("username"));
		W.until(ExpectedConditions.visibilityOf(ele)).sendKeys("9597203648");
		String Title = driver.getTitle();
		System.out.println("Title : "+Title);
		W.until(ExpectedConditions.titleContains("Instagram"));
		driver.findElement(By.name("password")).sendKeys("Neevetha@123");
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='Log In']"));
		W.until(ExpectedConditions.elementToBeClickable(ele2)).click();
		
		
		
		
		

	}

}
