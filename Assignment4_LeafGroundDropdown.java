package week2.day2Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_LeafGroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement ele1 = driver.findElement(By.id("dropdown1"));
		Select DD = new Select(ele1);
		DD.selectByIndex(1);
		System.out.println(DD);
		
		WebElement ele2 = driver.findElement(By.name("dropdown2"));
		Select DD1 = new Select(ele2);
		DD1.selectByVisibleText("Appium");
		System.out.println(DD1);
		
		WebElement ele3 = driver.findElement(By.id("dropdown3"));
		Select DD2 = new Select(ele3);
		DD2.selectByValue("3");
		System.out.println(DD2);
		
		
		WebElement ele4 = driver.findElement(By.className("dropdown"));
		Select DD3 = new Select(ele4);
		List<WebElement> options = DD3.getOptions();
		int size = options.size();
		System.out.println("Total Options are:"+ size);
		
		
		WebElement ele5 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		ele5.sendKeys("Selenium");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()='Appium'])[6]")).click();
		
		
		
	}

}
