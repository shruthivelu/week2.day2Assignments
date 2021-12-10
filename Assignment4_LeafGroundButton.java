package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);
		
		
	}

}
