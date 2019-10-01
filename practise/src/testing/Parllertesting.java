package testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parllertesting {
	public  WebDriver driver;
	@Parameters("myBrowser")
	@BeforeMethod()
	public void launcnBrowser(String myBrowser) throws Exception
	{
		if(myBrowser.equalsIgnoreCase("firefox"))
		{
			System.out.println("firefox browser");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://hrmsdev.tk/");
		}else if(myBrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			WebDriver	driver= new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://hrmsdev.tk/");
		}
	}
	
	
 
 @Test()
 public void M1()
 {
System.out.println("M1");			
		
 }
 @Test()
 public void M2()
 {
System.out.println("M2");			
		
 }
 @Test()
 public void M3()
 {
System.out.println("M3");			
		
 }
 @Test()
 public void M4()
 {
System.out.println("M4");			
		
 }
 
}
