package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_LeafGroundImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		WebElement brokenimage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		String attribute = brokenimage.getAttribute("src");
		driver.navigate().to(attribute);
		
		String title = driver.getTitle();
		
		if (title.contains("HTTP Status 404 – Not Found")) {
			System.out.println("I'm Broken Image");
		}
		else {
			System.out.println("I'm not a Broken Image");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();	
		
		
	}

}
