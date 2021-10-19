package chapter1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getters {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMI0ffylbHZ8gIVzl1gCh1LngwkEAAYASAAEgLeYvD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMI0ffylbHZ8gIVzl1gCh1LngwkEAAYASAAEgLeYvD_BwE");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			WebElement ele = driver.findElement(By.xpath("//a[text()='Fashion']"));
			System.out.println("Text : "+ele.getText());
			WebElement ele2 = driver.findElement(By.id("glow-ingress-line1"));
			System.out.println("Attribute Value : "+ele2.getAttribute("class"));
			WebElement ele3 = driver.findElement(By.id("nav-logo-sprites")); 
			org.openqa.selenium.Point Location = ele3.getLocation();
			int x = Location.getX();
			int y = Location.getY();
			System.out.println("X : "+x);
			System.out.println("Y : "+y);
			org.openqa.selenium.Dimension Size = ele3.getSize();
			int height = Size.getHeight();
			int width = Size.getWidth();
			System.out.println("Height : " +height);
			System.out.println("Width : "+width);
			
			
			
		
			
		}

	}

