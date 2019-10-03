package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadfile {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver	driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://hrmsdev.tk/");
		driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys("EQNX1000");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Equinox@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[contains(text(),'Organization')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(2000);
		WebDriverWait wait=new  WebDriverWait(driver,30);
		WebElement file =driver.findElement(By.xpath("//input[@id='file']"));
	wait.until(ExpectedConditions.elementToBeSelected(file));
		Actions ac=new Actions(driver);
		ac.moveToElement(file).build().perform();
		Thread.sleep(2000);
		 Runtime.getRuntime().exec("E:\\Resume-Copy.exe");
		
	}



}
