package chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginscriptbyFindBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		Clsexe ce = new Clsexe(driver);
		ce.username("9597203648");
		ce.password("Neevetha@123");
		ce.login();
		

	}

}
