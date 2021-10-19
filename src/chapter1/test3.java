package chapter1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skillrary.com/XphNGJKpk");
	driver.navigate().to("https://www.youtube.com/");
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	Set<String> child = driver.getWindowHandles();
	System.out.println(child);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	

	}

}
