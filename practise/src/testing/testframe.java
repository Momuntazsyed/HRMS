package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://hrmsdev.tk/");
	driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys("EQNX1000");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Equinox@123");
	driver.findElement(By.xpath("//button[@class='btn btn-success btn-block']")).click();
	List<WebElement>allframes=driver.findElements(By.tagName("iframe"));
	System.out.println(allframes.size());

	}

}
