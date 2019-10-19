package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
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
		
		driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
		Thread.sleep(2000);
		
		//JavascriptExecutor jse = ((JavascriptExecutor)driver);
		//jse.executeScript("window.scrollBy(0,250)", "");
		
		//EventFiringWebDriver evnt=new EventFiringWebDriver(driver);
	
		//evnt.executeScript("window.quarySelector(//*[@id=\"upadteModal\"]),scrollDown-250");
		
		driver.findElement(By.xpath("//input[@placeholder='Registration Number']")).sendKeys("463636435547");
   driver.findElement(By.xpath("//input[@placeholder='Designation']")).sendKeys("Tester");
   driver.findElement(By.xpath("//input[@placeholder='Company FEIN No']")).sendKeys("2112131");
   driver.findElement(By.xpath("//input[@placeholder='Naics Code']")).sendKeys("9867896");
   driver.findElement(By.xpath("//input[@placeholder='State Of Incorporation']")).sendKeys("It");
    driver.findElement(By.xpath("//input[@id='file']")).click();
    //browse.sendKeys("D:\\SoftwareTestingMaterial\\UploadFile.txt");
		Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:\\Users\\Rainiersoft101\\Desktop\\file2.exe");
		
	}



}
