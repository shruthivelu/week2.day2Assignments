package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_LeafGroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		String attri = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attri);
		
		String attribute = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		System.out.println(attribute);
		
		
		
		
	}

}
