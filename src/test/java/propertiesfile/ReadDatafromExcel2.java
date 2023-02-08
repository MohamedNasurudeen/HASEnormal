package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	//String data = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	//System.out.println(data);
	System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue());
	wb.close();

	}

	
}
