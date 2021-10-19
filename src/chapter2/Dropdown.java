package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("url"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("search-alias=automotive-intl-ship");
		s.selectByVisibleText("Beauty & Personal Care");
		
		System.out.println(s.isMultiple());
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		
		for(WebElement alltheoptions : opt)
		{
			System.out.println(alltheoptions.getText());
		}
		driver.close();
		
	}

}
