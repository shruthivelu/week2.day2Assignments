package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_LeafGroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();		
		String attri = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		String title = driver.getTitle();
		System.out.println(title);
		
		String attribute = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		String title2 = driver.getTitle();
		if (title2.contains("HTTP Status 404 – Not Found")) {
			System.out.println("I'm Broken");			
		}
		else {
			System.out.println("I'm not Broken");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.navigate().back();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='How many links are available in this page?']"));
		Select links = new Select(ele);
		links.
		
		
		
		
		
		
		
	}

}
