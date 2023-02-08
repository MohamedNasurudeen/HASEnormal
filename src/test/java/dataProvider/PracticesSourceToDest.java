package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class PracticesSourceToDest {
	
	@DataProvider
	public void dataFromExcel() throws IOException {
			FileInputStream fis = new FileInputStream(".//src/test/resources/SourceToDest.xlsx");		
		  Workbook wb = WorkbookFactory.create(fis); 
		  Sheet sh = wb.getSheet("sheet1");
		  int rowcount = sh.getPhysicalNumberOfRows();
		  Object[][] obj = new Object[rowcount][2];
		  
		  for(int i=0;i<rowcount;i++) {
			  Row row=sh.getRow(i);
			  Cell From = sh.getRow(i).getCell(0);
		  }
		  
		
		
		
	}
	

}
