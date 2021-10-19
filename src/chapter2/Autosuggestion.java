package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		ele.sendKeys("dress");
		Thread.sleep(3000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class = 'desktop-suggestion null']"));
		System.out.println("Search string matching count : "+ele1.size());
		for(WebElement ele2 : ele1)
		{
			System.out.println("Autosuggestions are : "+ele2.getText());
		}	

	}

}
