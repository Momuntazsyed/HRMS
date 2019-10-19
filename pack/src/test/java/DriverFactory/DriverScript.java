package DriverFactory;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import CommonFunctionLibrary.FunctionLibrary;
import Utilities.ExcelFileUtils;



public class DriverScript {
	WebDriver  driver;
	ExtentReports reports;
	ExtentTest logger;
	
//ExcelFileUtil Excel = new ExcelFileUtil();
public void startTest() throws Throwable
{
	ExcelFileUtils Excel = new ExcelFileUtils();
	
	for (int i=1;i<=Excel.rowCount("MasterTestData");i++)
	{
	String ModuleStatus="";
	
		if(Excel.getData("MasterTestData", i, 2).equalsIgnoreCase("Y"))
	      {
	String TCModule= Excel.getData("MasterTestData", i, 1);
	
	//Generate Extent Reports
	
	reports = new ExtentReports("./Reports/"+TCModule+".html"+""+FunctionLibrary.generateDate());
	logger= reports.startTest(TCModule);
	
	int  rowCount= Excel.rowCount(TCModule);
	System.out.println(rowCount);
	
	for (int j=1;j<=rowCount;j++)
	{
         String  Description= Excel.getData(TCModule, j, 0);
		String Object_Type= Excel.getData(TCModule, j, 1);
		String Locator_Type=Excel.getData(TCModule, j, 2);
		String Locator_Value=Excel.getData(TCModule, j, 3);
		String Test_Data = Excel.getData(TCModule,j, 4);
	try
	{
		if(Object_Type.equalsIgnoreCase("startBrowser"))
		{
			driver=FunctionLibrary.startBrowser(driver);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("openApplication"))
		{
		
			FunctionLibrary.openApplication(driver);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("waitForElement"))
		{
			FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("typeAction"))
		{
			FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, Test_Data);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("clickAction"))
		{
			Thread.sleep(1000);
			FunctionLibrary.clickAction(driver,Locator_Type,Locator_Value);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("closeApplication"))
		{
			FunctionLibrary.closeApplication(driver);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("titleValidation"))
		{
			FunctionLibrary.titleValidation(driver, Test_Data);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("actionClass"))
		{
			FunctionLibrary.actionClass(driver, Locator_Type, Locator_Value);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("selectAction"))
		{
			FunctionLibrary.selectAction(driver, Locator_Type, Locator_Value,Test_Data);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("datePicker"))
		{
			FunctionLibrary.datePicker(driver, Locator_Value, Test_Data);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("captureData"))
		{
			FunctionLibrary.captureData(driver, Locator_Type, Locator_Value);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("tableValidation"))
		{
			FunctionLibrary.tableValidation(driver, Test_Data);
			
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("scrollUp"))
		{
			FunctionLibrary.scrollUp(driver);
			logger.log(LogStatus.INFO, Description);
		}
		if(Object_Type.equalsIgnoreCase("scrollDown"))
		{
			FunctionLibrary.scrollDown(driver);
			logger.log(LogStatus.INFO, Description);
		}
		
		if(Object_Type.equalsIgnoreCase("popUp"))
		{
			FunctionLibrary.popUp(driver);
			logger.log(LogStatus.INFO, Description);
		}
		
		
		if(Object_Type.equalsIgnoreCase("fileUppload"))
		{
			FunctionLibrary.fileUppload();
			logger.log(LogStatus.INFO, Description);
		}
		
		
		
		
		
		Excel.setData(TCModule, j, 5, "Pass");
		ModuleStatus ="true";
		logger.log(LogStatus.PASS, Description+"pass");
	}
	catch(Exception e)
	   {
		Excel.setData(TCModule, j, 5, "Fail");
		ModuleStatus ="false";
		logger.log(LogStatus.FAIL, Description+"Fail");
		
		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("./SreenShot/" +Description +"_"+FunctionLibrary.generateDate() +".jpg"));
		driver.close();
		break;
	}
	catch(AssertionError a)
	{
		Excel.setData(TCModule, j, 5, "Fail");
		ModuleStatus = "false";
		logger.log(LogStatus.FAIL, Description+"Fail");
			File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(srcfile, new File("./ScreenShot/" +Description +"_"+FunctionLibrary.generateDate() +".jpg"));
		
		
		break;
	}
	}
	
	if (ModuleStatus.equalsIgnoreCase("true"))
	{
		Excel.setData("MasterTestData", i, 3, "Pass");
	}
	else
	{
		Excel.setData("MasterTestData", i, 3, "Fail");
		}
	      }
	      
	    else
	       {
	    	Excel.setData("MasterTestData", i, 3, "NotExecuted");
	
	      }
	reports.endTest(logger);
	reports.flush();
	
}

	}	


}
