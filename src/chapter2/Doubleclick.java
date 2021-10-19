package chapter2;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Doubleclick
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//select[@class = 'chosen-select']"));
		Select s = new Select(ele);
		s.selectByIndex(1);
		driver.findElement(By.xpath("(//a[text()='Cucumber']) [2]")).click();
		WebElement ele3 = driver.findElement(By.id("add"));
		Thread.sleep(2000);
		Actions a =new Actions(driver);
		a.doubleClick(ele3).perform();
		Thread.sleep(5000);
		driver.close();

	}
	
}
