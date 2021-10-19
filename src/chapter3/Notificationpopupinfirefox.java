package chapter3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Notificationpopupinfirefox {

		public static void main(String[] agrs)
		{
			
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver = new FirefoxDriver(option);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://cineb.net/");	
		
			
		}

	}

