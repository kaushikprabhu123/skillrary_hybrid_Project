package chapter2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Notificationpopupinfirefox {

		public static void main(String[] agrs)
		{
			
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			driver.get("https://cineb.net");	
		
			
		}

	}

