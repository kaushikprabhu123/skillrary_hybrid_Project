package chapter2;

import java.util.Set; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//try
		//{
			driver.get("https://www.naukri.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//System.out.println("Page loaded successfully");
		//}
		//catch(Exception e)
		//{
		//	System.out.println("Page not loaded successfully");
		//}
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child= driver.getWindowHandles();
		System.out.println(child);
		System.out.println("Number of child window "+child.size());
		for (String popupname : child)
		{
			driver.switchTo().window(popupname);
			System.out.println(driver.getTitle());
		}
		
		
		

	}

}
