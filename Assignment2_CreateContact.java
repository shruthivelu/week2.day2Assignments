package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Shruthi");
		driver.findElement(By.id("lastNameField")).sendKeys("TestLeaf");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Shruthi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Muthiah");
		driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Create Contact for Shruthi");
		driver.findElement(By.xpath("//input[@id=\"createContactForm_primaryEmail\"]")).sendKeys("shruthisubha09@gmail.com");
		
		WebElement ele = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select State = new Select(ele);
		State.selectByValue("NY");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("contact Edited");
		driver.findElement(By.xpath("(//input[@name ='submitButton'])[1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
