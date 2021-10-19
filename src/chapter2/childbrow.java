package chapter2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrow{

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		System.out.println("before removeing parent "+child.size());
		
		child.remove(parent);
		System.out.println("after removeing parent "+child.size());
		
		for(String allwin:child) {
			driver.switchTo().window(allwin);
			driver.close();
		}

	}

}