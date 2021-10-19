package chapter2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.myntra.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
				Actions ac = new Actions(driver);
				ac.contextClick(ele).perform();
				
	}

}
