package testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class movetotab {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		             WebElement element1 = driver.findElement(By.name("q"));
		
		             element1.sendKeys("software testing help");
		
		             element1.sendKeys(Keys.ENTER);
		             
		             driver.findElement(By.id("recaptcha-anchor")).click();
		
		            // String a = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		            // driver.findElement(By.partialLinkText("Software Testing Help - A Must Visit Software Testing Portal")).sendKeys(a);
		
		            // Robot robot = new Robot(); // instantiated robot class
	
		            //robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the shortcut keys
		
		           //  robot.keyPress(KeyEvent.VK_2); // here, we have just pressed ctrl+2
		
		        //     robot.keyRelease(KeyEvent.VK_CONTROL); // once we press and release ctrl+2, it will go to the second tab.
	
		            // robot.keyRelease(KeyEvent.VK_2); //if you again want to go back to first tab press and release vk_1
	}

}
