package chapter1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.naukri.com/");

	}

}
