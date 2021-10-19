package chapter2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class facebookscenario {

			public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://en-gb.facebook.com/login/web/");
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//a[contains(text(),'Sign up for Facebook')]")).click();
				WebElement ele = driver.findElement(By.name("birthday_month"));
				Select s = new Select(ele);
				s.selectByValue("1");
				s.selectByIndex(0);
				s.selectByVisibleText("Jun");
				
				if(s.isMultiple())
				{
					System.out.println(s.isMultiple());
				}
				ArrayList<String> a = new ArrayList<String>();
				List<WebElement> alltheoption = s.getOptions();
				for(WebElement opt : alltheoption)
				{
					
					String option = opt.getText();
					System.out.println(option);
					a.add(option);
				}
				Collections.sort(a);
				System.out.println("********After Sorting List*************");
				
				for(Object o : a)
				{
					System.out.println(o);
				}
				
				driver.close();
			}
}
