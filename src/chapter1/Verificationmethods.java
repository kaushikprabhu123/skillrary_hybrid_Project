package chapter1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificationmethods {
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		WebElement ele = driver.findElement(By.name("username"));
		if(ele.isDisplayed())
		{
			System.out.println("Pass : Element Displayed");
			ele.sendKeys("9597203648");
			
		}
		else
		{
			System.out.println("Fail : Element not displayed");
			
		}
		
		
	    driver.findElement(By.name("password")).sendKeys("Neevetha@123");
	    
	    WebElement ele2 = driver.findElement(By.xpath("//div[text()='Log In']"));
	    
	    if(ele2.isEnabled())
	    {
	    	System.out.println("Pass : Element is Enabled");
	    	ele2.click();
	    }
	    else
	    {
	    	System.out.println("Fail : Element is not Enabled");
	    }
	    
	    WebDriver driver1 = new ChromeDriver();
	    driver1.get("https://demo.actitime.com/login.do");
	    driver1.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    driver1.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    WebElement ele3 = driver1.findElement(By.id("keepLoggedInLabel"));
	    
	    if(ele3.isSelected())
	    {
	    	System.out.println("Pass : Element Selected");
	    	
	    }
	    else
	    {
	    	System.out.println("Fail : Element not selected");
	    	ele3.click();
	    }
	    
	}
}