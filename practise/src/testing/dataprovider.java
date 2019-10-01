package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class dataprovider {
public static 	WebDriver driver;
@DataProvider
public Object[][]  login()
{
Object data[][]= new Object[3][2];	
data[0][0]="EQNX1000";
data[0][1]="Equinox@123";
data[2][0]="EQNX1001";
data[2][1]="Equinox@123";
data[0][0]="EQNX1003";
data[0][1]="Equinox@123";
return data;
	
	

	

}
	
	
	
	
	
	
  @Test(description = "data take from data provider",dataProvider = "login")
  public void loginpage(String username,String password) throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hrmsdev.tk/");
		
		driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-block']")).click();  
	  
	  Thread.sleep(2000);
	  driver.close();
	  
  }
  

}
