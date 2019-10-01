package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		 
		 FileInputStream fi=new FileInputStream("E:\\TESTING\\practise\\TestInputdata.xlsx");		
HSSFWorkbook wb=new HSSFWorkbook(fi);
HSSFSheet s=wb.getSheet("Data");
//print the row value
HSSFRow row=s.getRow(0);
//print the column value
int cc=row.getLastCellNum();
System.out.println("no of rows"+row);
System.out.println("no of rows"+cc);

		       
	
		 
		
		
		
	}

}
