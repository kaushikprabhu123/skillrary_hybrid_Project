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

	public class Multiselectdropdown {


		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/index.php");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			WebElement ele = driver.findElement(By.name("cars"));
			Select s = new Select(ele);
			s.selectByIndex(0);
			s.selectByValue("299");
			
			s.deselectByIndex(0);
            s.deselectByValue("299");
            
            s.selectByIndex(0);
			s.selectByValue("299");
            
			System.out.println(s.isMultiple());
			
			if(s.isMultiple())
					{
				s.deselectAll();
					}
			List<WebElement> opt = s.getOptions();
			System.out.println(opt.size());
			ArrayList<String> a = new ArrayList<String>();
			
			for(WebElement alltheoptions : opt)
			{
             	String text = alltheoptions.getText();
				System.out.println(text);
				a.add(text);
			}
			
			Collections.sort(a);
			System.out.println("******After Sorting **********");
			for(Object elements : a)
			{
				System.out.println(elements);
			}
			
	
            
		}
}
