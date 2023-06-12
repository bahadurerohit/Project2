package DataDrivenTesting1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ddt1 {
public static void main(String[] args) throws Throwable{
	FileInputStream fs=new FileInputStream("C:\\Users\\HP\\Dropbox\\My PC (LAPTOP-RIBD8V9J)\\Desktop\\SeleniumDataDriven.xlsx");
	//open the excel(workbook)
	Workbook wb = WorkbookFactory.create(fs);
	//Get The Control Of The Sheet
	Sheet  ex= wb.getSheet("Sheet1");
	//get control of the row
	Row gr = ex.getRow(1);
	// get the control of cell
	Cell gc = gr.getCell(0);
	//get the data present in cell
	String value = gc.getStringCellValue();
	
	System.out.println(value);
	
}
}
