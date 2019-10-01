package CommonFunctionLibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.formula.ThreeDEval;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utilities.PropertyFileUtil;

public class FunctionLibrary {

	public static WebDriver startBrowser(WebDriver driver) throws Throwable
	{
		System.out.println("start browser");
		
		if(PropertyFileUtil.getValueForKey("browser").equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			}
		else
			if(PropertyFileUtil.getValueForKey("browser").equalsIgnoreCase("Chrome"))
			{
			System.out.println("chrome");
				System.setProperty("webdriver.chrome.driver", "./common jar files/chromedriver.exe");
				driver= new ChromeDriver();
			}
			else
				
				if(PropertyFileUtil.getValueForKey("browser").equalsIgnoreCase("IE"))
				{
					System.setProperty("webdriver.ie.driver", "./CommonJarFile/IEDriverServer.exe");
					driver=new InternetExplorerDriver();
				}
		return driver;
		
	}
	public static void openApplication(WebDriver driver) throws IOException, Throwable
	{
		System.out.println("enter url");	
			driver.manage().window().maximize();
			driver.get(PropertyFileUtil.getValueForKey("url"));


	}
	public static void clickAction(WebDriver driver,String locaterType,String locatervalue)
	{
		if(locaterType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatervalue)).click();
		}
		else
			if(locaterType.equalsIgnoreCase("partialLinkText"))
			{
				driver.findElement(By.partialLinkText(locatervalue)).click();
			}
			else
				if(locaterType.equalsIgnoreCase("cssSelector"))
				{
					driver.findElement(By.cssSelector(locatervalue)).click();
				}
				else
					if(locaterType.equalsIgnoreCase("linkText"))
					{
						driver.findElement(By.linkText(locatervalue)).click();
					}
							
	          	else 
			if(locaterType.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(locatervalue)).click();
			}
			else
				if(locaterType.equalsIgnoreCase("xpath"))
				{
					
					driver.findElement(By.xpath(locatervalue)).click();
				}
	}
	public static void typeAction(WebDriver driver,String locaterType,String locatervalue,String Data)
	{
		if(locaterType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatervalue)).clear();
			driver.findElement(By.id(locatervalue)).sendKeys(Data);
		}
		else
			if(locaterType.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(locatervalue)).clear();
				driver.findElement(By.name(locatervalue)).sendKeys(Data);
			}
			else 
				if(locaterType.equalsIgnoreCase("xpath"))
				{
					driver.findElement(By.xpath(locatervalue)).clear();
					driver.findElement(By.xpath(locatervalue)).sendKeys(Data);
				}
	}
	public static void closeApplication(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	public static void waitForElement(WebDriver driver,String locaterType,String locatervalue)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		if(locaterType.equalsIgnoreCase("id"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatervalue)));
					
		}
		else 
			if(locaterType.equalsIgnoreCase("name"))
			{
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(locatervalue)));
				
			}
			else
				if(locaterType.equalsIgnoreCase("cssSelector"))
				{
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locatervalue)));
					
				}
				
			else
				if(locaterType.equalsIgnoreCase("xpath"))
				{
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatervalue)));
				}
				else
					if(locaterType.equalsIgnoreCase("linkText"))
						
					{
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatervalue)));
					}
					
				else
					
					if(locaterType.equalsIgnoreCase("partialLinkText"))
					{
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locatervalue)));
					}
	}
	public static void selectAction(WebDriver driver,String locatortype,String locatervalue,String  data) throws Exception
	{
		
		if(locatortype.equalsIgnoreCase("id"))
		{
		Select s=new Select(driver.findElement(By.id(locatervalue)));
		s.selectByVisibleText(data);
		}
		else
			if(locatortype.equalsIgnoreCase("name"))
			{
			Select s=new Select(driver.findElement(By.name(locatervalue)));
			s.selectByVisibleText(data);
			}
			else
				if(locatortype.equalsIgnoreCase("xpath"))
				{
					//Thread.sleep(1000);
				Select s=new Select(driver.findElement(By.xpath(locatervalue)));
				s.selectByVisibleText(data);
				}
		
	}
	public static void  titleValidation(WebDriver driver, String exp_title)
	  {
		  String act_title=driver.getTitle();
		  Assert.assertEquals(exp_title, act_title);
	  }
	public static String generateDate(){
		Date d=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy_mm_dd");
		return sd.format(d);
		
	}
	public  static void tableValidation(WebDriver driver,String colNum) throws Throwable
	{
		FileReader fr=new FileReader("./captureData/data.txt");
		BufferedReader br=new BufferedReader(fr);
		String expt_data=br.readLine();
		//conversion from String to integer
		int colnum=Integer.parseInt(colNum);
		
	}
	public static void captureData(WebDriver driver,String locatertype,String locatervalue) throws Throwable
	{
		String data="";
		if(locatertype.equalsIgnoreCase("id"))
		{
			data=driver.findElement(By.id(locatervalue)).getAttribute("value");
			
		}
		if(locatertype.equalsIgnoreCase("name"))
		{
			data=driver.findElement(By.name(locatervalue)).getAttribute("value");
			
		}
		if(locatertype.equalsIgnoreCase("xpath"))
		{
			data=driver.findElement(By.xpath(locatervalue)).getAttribute("value");
			
		}
	FileWriter fos=new FileWriter("./captureData/Data.txt");
	BufferedWriter bo=new BufferedWriter(fos);
	bo.write(data);
	bo.flush();
	bo.close();
	
	
	}
	/*public static void datePicker(WebDriver driver,String locaterValue,String data)
	**{
	****	((JavascriptExecutor)driver).executeScript("document.getElementByxpath(' "+locaterValue+" ').value=' "+data+" '");
	****
	}*/
	
	public  static void fileUppload() throws IOException, InterruptedException
	
	{
		Thread.sleep(3000);
		 Runtime.getRuntime().exec("C:\\Users\\Rainiersoft101\\Desktop\\resume5.exe");
	}
	
	
	
	public static void datePicker(WebDriver driver,String locaterValue,String data)
	{
	System.out.println(data);
			driver.findElement(By.xpath(locaterValue)).sendKeys(data);
		}
	public static void scrollUp(WebDriver driver)
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_UP).perform();
	}
	
	public static void scrollDown(WebDriver driver)
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN ).perform();
	}
	
	public static void taleValidation(WebDriver driver,String act_value,String locatertype,String locatervalue)
	{
	
	if(locatertype.equalsIgnoreCase("id"))
	{
		String expt_value=driver.findElement(By.id(locatervalue)).getText();
		Assert.assertEquals(act_value, expt_value);
	}
	if(locatertype.equalsIgnoreCase("name"))
	{
		String expt_value=driver.findElement(By.name(locatervalue)).getText();
		Assert.assertEquals(act_value, expt_value);
	}
	if(locatertype.equalsIgnoreCase("xpath"))
	{
		String expt_value=driver.findElement(By.xpath(locatervalue)).getText();
		Assert.assertEquals(act_value, expt_value);
	}
	}
	public static void actionClass(WebDriver driver,String locatertype,String locateevalue)
	{
		Actions ac=new Actions(driver);
		WebElement E=driver.findElement(By.xpath(locateevalue));
ac.moveToElement(E).click().build().perform();
	}
	public static void popUp(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}

}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


