package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddataFromDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis =new FileInputStream("./src/test/resources/TestScriptData.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	DataFormatter df = new DataFormatter();
	System.out.println(df.formatCellValue(wb.getSheet("Sheet1").getRow(2).getCell(1)));
	

	}

}
