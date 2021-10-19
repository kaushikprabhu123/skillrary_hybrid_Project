package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownclickbyjavasriptexecutor {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//js.executeScript("window.scrollBy(0,20000)");
		//js.executeScript("window.scrollBy(500,0)");
		//js.executeScript("window.scrollBy(0,-20000)");
		//js.executeScript("window.scrollBy(-500,0)");
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Bedtime Originals Twinkle Toes Pink Elephant Plush, Hazel']"));
		Point Loc = ele.getLocation();
		int x = Loc.getX();
		int y = Loc.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		js.executeScript("arguments[0].click();",ele);
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
