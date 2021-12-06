package week2.day2Assignments;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shruthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testleaf");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9012345678");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@12345");
		
		WebElement ele1 = driver.findElement(By.id("day"));
		Select day = new Select(ele1);
		day.selectByValue("4");
		
		WebElement ele2 = driver.findElement(By.id("month"));
		Select month = new Select(ele2);
		month.selectByVisibleText("Apr");
		
		WebElement ele3 = driver.findElement(By.id("year"));
		Select year = new Select(ele3);
		year.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();	
		
		

	}

}
