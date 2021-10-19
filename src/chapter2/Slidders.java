package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidders {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@onchange=\"range.value=value\"]"));
		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		ac.dragAndDropBy(ele, 100, 0).perform();
		Thread.sleep(3000);
		ac.dragAndDropBy(ele, -100, 0).perform();
		Thread.sleep(3000);
		System.out.println("done");
		driver.close();


	}

}
