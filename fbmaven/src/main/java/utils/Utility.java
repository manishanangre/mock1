package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	static Workbook workbook;
	static Sheet sheet;
	static Row row;
	static Cell cell;
	public static String getDataFromExcelSheet(int sheetNo, int rowno, int cellno) throws EncryptedDocumentException, IOException
	{
		String data = "";
		String filepath = "C:\\Users\\admin\\Downloads\\Notes\\Automationpract.xlsx";
		InputStream file = new FileInputStream(filepath);
		Workbook workbook =	WorkbookFactory.create(file);
	    sheet = workbook.getSheetAt(sheetNo);
		row = sheet.getRow(rowno);
	 	cell = row.getCell(cellno);
		 
		try {  
			
			data = cell.getStringCellValue();
			System.out.println(data);
		}
		catch(Exception e) {
			
		double value = cell.getNumericCellValue();
		data = value +"";
		}
		return data;
	}
//String filepath,String sheet,int row,int cell
	
	public static void captureScreenshot(WebDriver driver, String testId) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy HH mm ss");
		Date date = new Date();
		File dest = new File("C:\\Users\\admin\\Downloads\\Screenshots"+testId+""+formatter.format(date)+".jpeg");
		FileHandler.copy(src, dest);
		
		
	}
	
}
