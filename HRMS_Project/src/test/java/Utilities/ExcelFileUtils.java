package Utilities;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtils {
	Workbook wb;
	//creating constructor for load excel file
	public ExcelFileUtils() throws Throwable{
		FileInputStream fis=new FileInputStream("./TestInputs/inputFile.xlsx");
		wb=WorkbookFactory.create(fis);
		
	}//close constructor
	
	//count row
	public int rowCount(String Sheetname)
	{
		
		return wb.getSheet(Sheetname).getLastRowNum();
	
	}
	//column count
	public int colCount(String sheetname,int rowno)
	{
		return wb.getSheet(sheetname).getRow(rowno).getLastCellNum();
		
	}
	//get data
	public String getData(String sheetname,int rowno,int colno)
	{
		String data="";
		if(wb.getSheet(sheetname).getRow(rowno).getCell(colno).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			int celldata=(int)(wb.getSheet(sheetname).getRow(rowno).getCell(colno).getNumericCellValue());
			data=String.valueOf(celldata);
			
		}
		else
		{
			data=wb.getSheet(sheetname).getRow(rowno).getCell(colno).getStringCellValue();
		}
		return data;
		
	}
	public void setData(String sheetname,int rowno,int colno,String str) throws Throwable
	{
		Sheet sh=wb.getSheet(sheetname);
		Row rowNum=sh.getRow(rowno);
		Cell cell=rowNum.createCell(colno);
		cell.setCellValue(str);
		if(str.equalsIgnoreCase("pass"))
		{
			//create cell data
			CellStyle style=wb.createCellStyle();
			//create font
			Font font=wb.createFont();
			//apply color to text
			font.setColor(IndexedColors.GREEN.getIndex());
		   //apply bold to the text
			font.setBoldweight(font.BOLDWEIGHT_BOLD);
			//set font
			style.setFont(font);
			//set cell style
			rowNum.getCell(colno).setCellStyle(style);
			
		}
		else
			if(str.equalsIgnoreCase("Fail"))
			{
				//create cell data
				CellStyle style=wb.createCellStyle();
				//create font
				Font font=wb.createFont();
				//apply color to text
				font.setColor(IndexedColors.RED.getIndex());
			   //apply bold to the text
				font.setBoldweight(font.BOLDWEIGHT_BOLD);

				//set font
				style.setFont(font);
				//set cell style
				rowNum.getCell(colno).setCellStyle(style);
				
			}
			else
				if(str.equalsIgnoreCase("NotExcuted"))
				{
					//create cell data
					CellStyle style=wb.createCellStyle();
					//create font
					Font font=wb.createFont();
					//apply color to text
					font.setColor(IndexedColors.BLUE.getIndex());
				   //apply bold to the text
					font.setBoldweight(font.BOLDWEIGHT_BOLD);
					//set font
					style.setFont(font);
					//set cell style
					rowNum.getCell(colno).setCellStyle(style);
					
				}
			FileOutputStream fos=new FileOutputStream("./OutputFile/outputSheet.xlsx");
	       wb.write(fos);
	       fos.close();
	}
}
